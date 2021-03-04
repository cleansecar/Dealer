package com.autobrixusedcar.dealer.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.autobrixusedcar.dealer.entities.OtpRequest;


public interface OtpRepository extends JpaRepository<OtpRequest, Long>{
	
	  @Modifying(clearAutomatically=true)
	    @Transactional
	    @Query("UPDATE OtpRequest ort SET ort.is_active='N' WHERE ort.phone_no=:phoneNo AND ort.is_active='Y' AND ort.is_verified='N'")
	    void invalidateRequests(@Param("phoneNo") String phoneNo);

	    @Query(value="select ort.* from otp_request_tbl ort where phone_no=:phoneNo and ort.otp_code=:OTP and ort.is_verified='N' "
	            + "and ort.is_active='Y' and TIMESTAMPDIFF(MINUTE, ort.requested_on, now()) <= 15 ORDER BY ort.requested_on DESC LIMIT 1",
	            nativeQuery=true)
	    Optional<OtpRequest> getValidatedOTPObject(@Param("phoneNo") String phoneNo, @Param("OTP") String OTP);


}

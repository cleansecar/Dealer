package com.autobrixusedcar.dealer.repositories;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.autobrixusedcar.dealer.entities.BaseEntity;

public interface DealerHomeRepository extends JpaRepository<BaseEntity, Long>{
	
	
	
	@Transactional
	@Query(value = "insert into car_vendor_admin_master_tbl (vendor_name,owner_name,phone_no,alternative_no,location,landmark,created_by,city,state,latitude,longitude,\n" + 
			"			adhar_card_image,adhar_card_number,pan_card_image,pan_card_number,driving_licence_image,driving_licence_number,suv_commission,hatchback_commission,sedan_commission,\n" + 
			"			acc_holder_name,bank_name,bank_account_no,ifsc_code,is_acc_verified,dealer_code,pincode) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ;",nativeQuery = true)
	void insert_car_vendor_admin_master_tbl(
			@Param("vendor_name") String vendor_name,
			@Param("owner_name") String owner_name,
			@Param("phone_no") String phone_no,
			@Param("alternative_no") String alternative_no,
			@Param("location") String location,
			@Param("landmark") String landmark,
			@Param("created_by") String created_by,
			@Param("city") String city,
			@Param("latitude") String latitude,
			@Param("longitude") String longitude,
			@Param("adhar_card_image") String adhar_card_image,
			@Param("adhar_card_number") String adhar_card_number,
			@Param("pan_card_image") String pan_card_image,
			@Param("pan_card_number") String pan_card_number,
			@Param("driving_licence_image") String driving_licence_image,
			@Param("driving_licence_number") String driving_licence_number,
			@Param("suv_commission") String suv_commission,
			@Param("hatchback_commission") String hatchback_commission,
			@Param("sedan_commission") String sedan_commission,
			@Param("acc_holder_name") String acc_holder_name,
			@Param("bank_name") String bank_name,
			@Param("bank_account_no") String bank_account_no,
			@Param("ifsc_code") String ifsc_code,
			@Param("is_acc_verified") String is_acc_verified,
			@Param("dealer_code") String dealer_code,
			@Param("pincode") String pincode,
			@Param("state") String state
			);
	
	
	
	
	
	
	
	 
	 @Query(value = "call used_car_home_page_sales_amount(:mobileno,:type,:fromdate,:todate,:duration)" , nativeQuery = true)
	 Map<String, Object> used_car_home_page_sales_amount(@Param("mobileno")String mobileno,@Param("type")String type,@Param("fromdate")String fromdate,@Param("todate")String todate,@Param("duration") String duration);

	 
	 @Query(value = "call used_car_home_page_vendor_details(:mobileno,:type)" , nativeQuery = true)
	 Map<String, Object> used_car_home_page_vendor_details(@Param("mobileno")String mobileno,@Param("type")String type);

	 	
	
}

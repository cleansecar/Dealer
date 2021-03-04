package com.autobrixusedcar.dealer.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.autobrixusedcar.dealer.dtos.UserData;
import com.autobrixusedcar.dealer.entities.BaseEntity;

public interface LoginRepository extends JpaRepository<BaseEntity, Long>{
	
	
	@Query(value = "call used_car_employee_login_details(:phoneNo) ;", nativeQuery = true)
	Map<String, Object> getEmployeeDetails(@Param("phoneNo") String phoneNo);
	
	

}
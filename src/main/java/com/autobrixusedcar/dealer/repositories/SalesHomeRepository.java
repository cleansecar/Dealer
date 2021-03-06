package com.autobrixusedcar.dealer.repositories;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.autobrixusedcar.dealer.entities.BaseEntity;

public interface SalesHomeRepository  extends JpaRepository<BaseEntity, Long> {
	
	 @Query(value="call  used_car_vehilce_list_for_dealer_sales(:dealerId)",nativeQuery = true)
	 List<Map<String, Object>> used_car_sales_vehicle_list(@Param("dealerId")String dealerId);
	 
	 
	 
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="update used_car_add_vehicle set customer_name=:customerName,phone_no=:phone_no,package_id=:packageId\n" + 
	 		"where add_vehicle_id=:vehicleId ;",nativeQuery = true)
	 void updateintoused_car_add_vehicle(
			 @Param("customerName")String customerName,
			 @Param("phone_no")String phone_no,
			 @Param("packageId")String packageId,
			 @Param("vehicleId")String vehicleId
			 );
	 
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="insert into used_car_customer_vehicle_follow_up (customer_name,customer_number,select_date,select_time,add_vehicle_id,employee_id,vendor_id) \n" + 
	 		"values (?,?,?,?,?,?,?) ;",nativeQuery = true)
	 void insertintoused_car_customer_vehicle_follow_up(
			 @Param("customer_name")String customer_name,
			 @Param("customer_number")String customer_number,
			 @Param("select_date")String select_date,
			 @Param("select_time")String select_time,
			 @Param("add_vehicle_id")String add_vehicle_id,
			 @Param("employee_id")String employee_id,
			 @Param("vendor_id")String vendor_id
			 );
	 
	 
}

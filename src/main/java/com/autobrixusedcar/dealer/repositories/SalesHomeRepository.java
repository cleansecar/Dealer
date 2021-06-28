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
	 @Query(value="update used_car_add_vehicle set customer_name=:customerName,phone_no=:phone_no,package_id=:packageId,current_status='Follow Up',package_service_id=:package_service_id  \n" + 
	 		"where add_vehicle_id=:vehicleId ;",nativeQuery = true)
	 void updateintoused_car_add_vehicle(
			 @Param("customerName")String customerName,
			 @Param("phone_no")String phone_no,
			 @Param("packageId")String packageId,
			 @Param("vehicleId")String vehicleId,
			 @Param("package_service_id")String package_service_id
			 );
	 
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="insert into used_car_customer_vehicle_follow_up (customer_name,customer_number,select_date,select_time,add_vehicle_id,vendor_id,follow_up_status,service_package_id,package_id,sales_comment) \n" + 
	 		"values (:customer_name,:customer_number,:select_date,:select_time,:add_vehicle_id,:vendor_id,:Follow_Up,:service_package_id,:package_id,:sales_comment) ;",nativeQuery = true)
	 void insertintoused_car_customer_vehicle_follow_up(
			 @Param("customer_name")String customer_name,
			 @Param("customer_number")String customer_number,
			 @Param("select_date")String select_date,
			 @Param("select_time")String select_time,
			 @Param("add_vehicle_id")String add_vehicle_id,
			 @Param("vendor_id")String vendor_id,
			 @Param("Follow_Up") String Follow_Up,
			 @Param("service_package_id")String service_package_id,
			 @Param("package_id")String package_id,
			 @Param("sales_comment")String sales_comment
			 );
	 
	 
	 
	 
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="update used_car_add_vehicle set customer_name=:customerName,phone_no=:phone_no,package_id=:packageId,package_service_id=:package_service_id,date_of_service=:date_of_service  \n" + 
	 		"where add_vehicle_id=:vehicleId ;",nativeQuery = true)
	 void soldupdateintoused_car_add_vehicle(
			 @Param("customerName")String customerName,
			 @Param("phone_no")String phone_no,
			 @Param("packageId")String packageId,
			 @Param("vehicleId")String vehicleId,
			 @Param("package_service_id")String package_service_id,
			 @Param("date_of_service")String date_of_service

			 );
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="insert into used_car_employee_sales_tbl(user_vehicle_id,package_id,actual_package_amount,\n" + 
	 		"discount_amount,final_price,vendor_id,user_added_date,service_date) \n" + 
	 		"values (?,?,?,?,?,?,?,?,?,?,?);",nativeQuery = true)
	 void soldInsertused_car_employee_sales_tbl(
			 @Param("vehicleId")String vehicleId,
			 @Param("packageId")String packageId,
			 @Param("actual_package_amount")String actual_package_amount,
			 @Param("discount_amount")String discount_amount,
			 @Param("final_price")String final_price,
			 @Param("vendor_id")String vendor_id,
			 @Param("ServiceStartDate")String ServiceStartDate,
			 @Param("ServiceEndDate")String ServiceEndDate
			 );
	
	 
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="call used_car_vehilce_customer_insert(:vehicleId,:customerName,:phone_no,:packageId,:package_service_id,:ServiceStartDate,:ServiceEndDate,:actual_package_amount,:discount_amount,:final_price,:vendor_id);",nativeQuery = true)
	 Integer used_car_vehilce_customer_insert(
			 @Param("vehicleId")String vehicleId,
			 @Param("packageId")String packageId,
			 @Param("actual_package_amount")String actual_package_amount,
			 @Param("discount_amount")String discount_amount,
			 @Param("final_price")String final_price,
			 @Param("vendor_id")String vendor_id,
			 @Param("ServiceStartDate")String ServiceStartDate,
			 @Param("customerName")String customerName,
			 @Param("phone_no")String phone_no,
			 @Param("package_service_id")String package_service_id,
			 @Param("ServiceEndDate")String ServiceEndDate
			 );
	 
	 
	 @Query(value="call  used_car_packages_list(:cartype)",nativeQuery = true)
	 List<Map<String, Object>> used_car_packages_list(@Param("cartype")String cartype);
	 
	 
	 @Query(value="call  used_car_dates_30_days(:currentdate)",nativeQuery = true)
	 List<Map<String, Object>> used_car_dates_30_days(@Param("currentdate")String currentdate);
	 
	 @Query(value = "call used_car_vehilce_followup_list(:employeeid,:searchtext)" , nativeQuery = true)
	 List<Map<String, Object>> used_car_followup_list_sale(@Param("employeeid")String employeeid,@Param("searchtext")String searchtext);
	 
	 
	 @Query(value = "call used_car_vehicle_followup_history(:vehicleId)" , nativeQuery = true)
	 List<Map<String, Object>> usedcar_followup_history(@Param("vehicleId")String vehicleId);
	 
	 @Query(value = "call used_car_sold_vehilces_sales(:employeeId)" ,nativeQuery = true)
	 List<Map<String, Object>> usedcar_sales_sold_vehicle_list(@Param("employeeId")String employeeId);
	 
}

package com.autobrixusedcar.dealer.repositories;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.autobrixusedcar.dealer.entities.BaseEntity;

public interface DealerHomeRepository extends JpaRepository<BaseEntity, Long>{
	
	
	
	@Transactional
	@Query(value = "insert into car_vendor_admin_master_tbl (vendor_name,owner_name,phone_no,alternative_no,location,landmark,created_by,city,state,latitude,longitude,\n" + 
			"			adhar_card_image,adhar_card_number,pan_card_image,pan_card_number,driving_licence_image,driving_licence_number,suv_commission,hatchback_commission,sedan_commission,\n" + 
			"			acc_holder_name,bank_name,bank_account_no,ifsc_code,is_acc_verified,pincode) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ;",nativeQuery = true)
	void insert_car_vendor_admin_master_tbl(
			@Param("vendor_name") String vendor_name,
			@Param("owner_name") String owner_name,
			@Param("phone_no") String phone_no,
			@Param("alternative_no") String alternative_no,
			@Param("location") String location,
			@Param("landmark") String landmark,
			@Param("created_by") String created_by,
			@Param("city") String city,
			@Param("state") String state,

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
			@Param("pincode") String pincode
			);
	
	
	

	 @Query(value = "call used_car_home_page_sales_amount(:mobileno,:type,:fromdate,:todate,:duration)" , nativeQuery = true)
	 Map<String, Object> used_car_home_page_sales_amount(@Param("mobileno")String mobileno,@Param("type")String type,@Param("fromdate")String fromdate,@Param("todate")String todate,@Param("duration") String duration);

	 
	 @Query(value = "call used_car_home_page_vendor_details(:mobileno,:type)" , nativeQuery = true)
	 Map<String, Object> used_car_home_page_vendor_details(@Param("mobileno")String mobileno,@Param("type")String type);

	 	
	 @Query(value = "call used_car_employee_wise_sale(:mobileno,:type)" , nativeQuery = true)
	 List<Map<String, Object>> used_car_employee_wise_sale(@Param("mobileno")String mobileno,@Param("type")String type);
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value ="insert into used_car_add_vehicle (vehicle_make,vehicle_model,fuel_type,vehicle_no,manfufacturing_year,odometer,vin_number,vendor_id) values (?,?,?,?,?,?,?,?) ; ",nativeQuery =true)
	 void insert_used_car_add_vehicle(
			 @Param("vehicle_make")String vehicle_make,
			 @Param("vehicle_model")String vehicle_model,
			 @Param("fuel_type")String fuel_type,
			 @Param("vehicle_no")String vehicle_no,
			 @Param("manfufacturing_year")String manfufacturing_year,
			 @Param("odometer")String odometer,
			 @Param("vin_number")String vin_number,
			 @Param("vendor_id")String vendor_id
			 );
	 
	 @Query(value="call dashboard_vehicles_list(:searchtext)",nativeQuery = true)
	 List<Map<String, Object>> search_vehicl(@Param("searchtext")String searchtext);
	 
	 @Query(value="call  used_car_vehilce_list_for_dealer(:dealerId,:searchtext)",nativeQuery = true)
	 List<Map<String, Object>> used_car_vehicle_list(@Param("dealerId")String dealerId,@Param ("searchtext")String searchtext);
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="insert into used_car_add_employee_tbl (employee_name,phone_no,employee_image,vendor_id) values (?,?,?,?) ;",nativeQuery = true)
	 void insert_used_car_add_employee_tbl(
			 @Param("employee_name")String employee_name,
			 @Param("phone_no")String phone_no,
			 @Param("employee_image")String employee_image,
			 @Param("vendor_id")String vendor_id
			 );
	 
	 
	 
	 @Query(value = "SELECT \n" + 
		 		"    vendor_admin_id,\n" + 
		 		"    owner_name,\n" + 
		 		"    phone_no,\n" + 
		 		"    alternative_no,\n" + 
		 		"    location,\n" + 
		 		"    IFNULL(landmark, '') landmark,\n" + 
		 		"    city,\n" + 
		 		"    state,\n" + 
		 		"    pincode,\n" + 
		 		"    dealer_code\n" + 
		 		"FROM\n" + 
		 		"    car_vendor_admin_master_tbl\n" + 
		 		"WHERE\n" + 
		 		"    is_active = 'Y' \n" + 
		 		"    and created_by = :employeeId ;", nativeQuery = true)
		 List<Map<String,Object>> dealerslist(@Param("employeeId")String employeeId);
		 
		 
		 
	 

}

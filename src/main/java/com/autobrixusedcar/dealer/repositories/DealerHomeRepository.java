package com.autobrixusedcar.dealer.repositories;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.autobrixusedcar.dealer.dtos.soldData;
import com.autobrixusedcar.dealer.entities.BaseEntity;
public interface DealerHomeRepository extends JpaRepository<BaseEntity, Long>{
	
    @Modifying(flushAutomatically = true)
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
	 @Query(value ="insert into used_car_add_vehicle (vehicle_make,vehicle_model,fuel_type,vehicle_no,manufacturing_year,odometer,vin_number,dealer_id,car_type) values (?,?,?,?,?,?,?,?,?) ; ",nativeQuery =true)
	 void insert_used_car_add_vehicle(
			 @Param("vehicle_make")String vehicle_make,
			 @Param("vehicle_model")String vehicle_model,
			 @Param("fuel_type")String fuel_type,
			 @Param("vehicle_no")String vehicle_no,
			 @Param("manufacturing_year")String manufacturing_year,
			 @Param("odometer")String odometer,
			 @Param("vin_number")String vin_number,
			 @Param("vendor_id")String vendor_id,
			 @Param("car_type")String car_type
			 );
	 
	 
//	 
//	 @Modifying(flushAutomatically = true)
//	 @Transactional
	 @Query(value ="call uci_add_vehicle(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);",nativeQuery =true)
	 Integer insert_uci_addvehicle(
			 @Param("model_id")Integer model_id,
			 @Param("vehicle_make")String vehicle_make,
			 @Param("vehicle_model")String vehicle_model,
			 @Param("fuel_type")String fuel_type,
			 @Param("vehicle_no")String vehicle_no,
			 @Param("manufacturing_year")String manufacturing_year,
			 @Param("odometer")String odometer,
			 @Param("vendor_id")Integer vendor_id,
			 @Param("ownership_id")Integer ownership_id,
			 @Param("ownership")String ownership,
			 @Param("insurance_validity")String insurance_validity,
			 @Param("about_car")String about_car,
             @Param("status_id")Integer status_id,
             @Param("insurance_type")String insurance_type,
             @Param("actual_price")Double actual_price,
             @Param("'rc_front'")String rc_front,
             @Param("'rc_rear'")String rc_rear,
			 @Param("transmission_type")String transmission_type ,
			 @Param("color")String color,
			 @Param("engine_no")String engine_no,
			 @Param("chassis_no")String chassis_no,
			 @Param("insurance_provider")String insurance_provider,
			 @Param("insurance_copy")String insurance_copy,
			 @Param("rc_transfer")String rc_transfer,
			 @Param("lifetime_tax_copy")String lifetime_tax_copy,
			 @Param("lifetime_tax")String lifetime_tax,
			 @Param("negotiable")String negotiable,
			 @Param("loan_option")String loan_option,
			 @Param("video_url")String video_url,
			 @Param("test_drive")String test_drive,
			 @Param("test_drive_type")String test_drive_type,
			 @Param("test_drive_amount")Double test_drive_amount,
			 @Param("abs")String abs,
			 @Param("adjustable_external_mirror")String adjustable_external_mirror,
			 @Param("adjustable_steering")String adjustable_steering,
			 @Param("air_conditioning")String air_conditioning,
			 @Param("number_of_airbags")Integer number_of_airbags,
			 @Param("alloy_wheels")String alloy_wheels,
			 @Param("lock_system")String lock_system,
			 @Param("parking_sensors")String parking_sensors,
			 @Param("power_steering")String power_steering,
			 @Param("power_windows")String power_windows,
			 @Param("am_fm_radio")String am_fm_radio,
			 @Param("usb_compability")String usb_compability
             
             );
	 
     @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value ="INSERT INTO uci_vehicle_images_tbl (dealer_id, vehicle_id, image_type_id, image,is_profile_image) VALUES (?,?,?,?,?); ",nativeQuery =true)
	 void insert_used_car_vehicle_images(
			 @Param("dealer_id")Integer dealer_id,
			 @Param("vehicle_id")Integer vehicle_id,
			 @Param("image_type_id")Integer image_type_id,
			 @Param("image")String image,
			 @Param("is_profile_image")String is_profile_image
			
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
	 
		 
	 @Query(value = " call used_car_vehilce_list_for_my_approvels_dealer(:employeeId);", nativeQuery = true)
		 List<Map<String,Object>> used_car_vehilce_list_for_my_approvels_dealer(@Param("employeeId")String employeeId);
		 
	 
	 
	 @Query(value = " call used_car_check_out_amount(:salesid);", nativeQuery = true)
	 List<Map<String,Object>> used_car_check_out_amount(@Param("salesid")String salesid);
	 
	 @Query(value = " call used_car_check_out(:salesid);", nativeQuery = true)
	 Map<String,Object> used_car_check_out(@Param("salesid")String salesid);
	 

	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="update used_car_add_vehicle set current_status='Approve' where vehicle_id = :vehicleId ;",nativeQuery = true)
	 void updateapprovestatus(
			 @Param("vehicleId")String vehicleId

			 );
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="update used_car_employee_sales_tbl set current_status='Approve' ,is_approve_pay='A' where user_vehicle_id = :vehicleId ;",nativeQuery = true)
	 void updateapprovestatusused_car_employee_sales_tbl(
			 @Param("vehicleId")String vehicleId
			 );
	 
	 
	 
	 
	 @Query(value = " call used_car_sold_vehilces_vendor(:employeeid);", nativeQuery = true)
	 List<Map<String,Object>> used_car_sold_vehilces_vendor(@Param("employeeid")String employeeid);
	 
	 
	 
	 
	 @Query(value = " call used_car_commision_vendor_wise(:employeeId);", nativeQuery = true)
	 List<Map<String,Object>> used_car_commision_vendor_wise(@Param("employeeId")String employeeId);
	 
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value = "insert into used_car_payment_tbl (sale_id,actual_amount,discount_amount,final_amount,razor_pay_id,payment_status,is_paid)values (?,?,?,?,?,?,?);", nativeQuery = true )
	 void insertintopaymnets(@Param("sale_id")String sale_id,
			 @Param("actual_amount")String actual_amount,
			 @Param("discount_amount")String discount_amount,
			 @Param("final_amount")String final_amount,
			 @Param("razor_pay_id")String razor_pay_id,
			 @Param("payment_status")String payment_status,
			 @Param("is_paid")String is_paid);
	 
	  
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="update used_car_add_vehicle set current_status='Approve & Pay' where vehicle_id = :vehicleId ;",nativeQuery = true)
	 void updateapprovestatuspay(
			 @Param("vehicleId")String vehicleId
			 );
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="update used_car_employee_sales_tbl set current_status='Approve & Pay' ,is_approve_pay='P' where user_vehicle_id = :vehicleId ;",nativeQuery = true)
	 void updateapprovestatusused_car_employee_sales_tblpay(
			 @Param("vehicleId")String vehicleId
			 );
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="call user_creation_used_car(:customername,:customerno,:saleid);",nativeQuery = true)
	 void createuser(
			 @Param("customername")String customername,
			 @Param("customerno")String customerno,
			 @Param("saleid")String saleid
			 );
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="call used_car_cs_ondemand_lead_insert(:saleid);",nativeQuery = true)
	 void used_car_cs_ondemand_lead_insert(
	 @Param("saleid")String saleid
	 );
	 
	 @Query(value = " select id,name from uci_vehicle_image_type_master_tbl where is_active='Y';", nativeQuery = true)
	 List<Map<String,Object>> vehicle_images_list();
	 
	 
	 @Query(value = "Select 100 as id,'All Cars' as status\n" + 
	 		"UNION ALL\n" + 
	 		"Select id,status from uci_vehicle_status_master_tbl where is_active='Y' and is_filter='Y' ;", nativeQuery = true)
	 List<Map<String,Object>> vehicle_status_list();
	 
	 
	 @Query(value = " SELECT id,name FROM uci_vehicle_ownership_master_tbl WHERE is_active='Y';", nativeQuery = true)
	 List<Map<String,Object>> ownership_list();
	 
	 @Query(value = "select vehicle_id as vehicle_id,dealer_id from used_car_add_vehicle where vehicle_no = :vehicle_no and is_active='Y';", nativeQuery = true)
	  Map<String,Object> checkvehicleexist(@Param("vehicle_no")String vehicle_no);
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="Update used_car_add_vehicle set model_id=:model_id,vehicle_make=:vehicle_make,vehicle_model=:vehicle_model,fuel_type=:fuel_type,vehicle_no=:vehicle_no,"
	 		+ "manufacturing_year=:manufacturing_year,odometer=:odometer,dealer_id=:vendor_id,ownership_id=:ownership_id,insurance_validity=:insurance_validity,about_car=:about_car,status_id=:status_id,"
	 		+ "insurance_type=:insurance_type,user_id=null,customer_name=null,phone_no=null,"
	 		+ "customer_address=null,actual_price=:actual_price,rc_front=:rc_front,rc_rear=:rc_rear , "
	 		+ "    transmission_type = :transmission_type,\n"
	 		+ "    color = :color,\n"
	 		+ "    engine_no = :engine_no,\n"
	 		+ "    chassis_no = :chassis_no,\n"
	 		+ "    insurance_provider = :insurance_provider,\n"
	 		+ "    insurance_copy = :insurance_copy,\n"
	 		+ "    rc_transfer = :rc_transfer,\n"
	 		+ "    lifetime_tax_copy = :lifetime_tax_copy,\n"
	 		+ "    lifetime_tax = :lifetime_tax,\n"
	 		+ "    negotiable = :negotiable,\n"
	 		+ "    loan_option = :loan_option,\n"
	 		+ "    video_url = :video_url,\n"
	 		+ "    test_drive = :test_drive,\n"
	 		+ "    test_drive_type = :test_drive_type,\n"
	 		+ "    test_drive_amount = :test_drive_amount,\n"
	 		+ "    abs = :abs,\n"
	 		+ "    adjustable_external_mirror = :adjustable_external_mirror,\n"
	 		+ "    adjustable_steering = :adjustable_steering,\n"
	 		+ "    air_conditioning = :air_conditioning,\n"
	 		+ "    number_of_airbags = :number_of_airbags,\n"
	 		+ "    alloy_wheels = :alloy_wheels,\n"
	 		+ "    lock_system = :lock_system,\n"
	 		+ "    parking_sensors = :parking_sensors,\n"
	 		+ "    power_steering = :power_steering,\n"
	 		+ "    power_windows = :power_windows,\n"
	 		+ "    am_fm_radio = :am_fm_radio,\n"
	 		+ "    usb_compability = :usb_compability,ownership = :ownership "
	 		+ "where vehicle_id=:vehicle_id and is_active='Y';",nativeQuery = true)
	 void update_existing_vehicle(
			 @Param("model_id")Integer model_id,
			 @Param("vehicle_make")String vehicle_make,
			 @Param("vehicle_model")String vehicle_model,
			 @Param("fuel_type")String fuel_type,
			 @Param("vehicle_no")String vehicle_no,
			 @Param("manufacturing_year")String manufacturing_year,
			 @Param("odometer")String odometer,
			 @Param("vendor_id")Integer vendor_id,
			 @Param("ownership_id")Integer ownership_id,
			 @Param("insurance_validity")String insurance_validity,
			 @Param("about_car")String about_car,
			 @Param("status_id")Integer status_id,
			 @Param("insurance_type")String insurance_type,
			 @Param("vehicle_id")Integer vehicle_id,
			 @Param("actual_price")Double actual_price,
			 @Param("rc_front")String rc_front,
			 @Param("rc_rear")String rc_rear,
			 @Param("ownership")String ownership,
			 @Param("transmission_type")String transmission_type ,
			 @Param("color")String color,
			 @Param("engine_no")String engine_no,
			 @Param("chassis_no")String chassis_no,
			 @Param("insurance_provider")String insurance_provider,
			 @Param("insurance_copy")String insurance_copy,
			 @Param("rc_transfer")String rc_transfer,
			 @Param("lifetime_tax_copy")String lifetime_tax_copy,
			 @Param("lifetime_tax")String lifetime_tax,
			 @Param("negotiable")String negotiable,
			 @Param("loan_option")String loan_option,
			 @Param("video_url")String video_url,
			 @Param("test_drive")String test_drive,
			 @Param("test_drive_type")String test_drive_type,
			 @Param("test_drive_amount")Double test_drive_amount,
			 @Param("abs")String abs,
			 @Param("adjustable_external_mirror")String adjustable_external_mirror,
			 @Param("adjustable_steering")String adjustable_steering,
			 @Param("air_conditioning")String air_conditioning,
			 @Param("number_of_airbags")Integer number_of_airbags,
			 @Param("alloy_wheels")String alloy_wheels,
			 @Param("lock_system")String lock_system,
			 @Param("parking_sensors")String parking_sensors,
			 @Param("power_steering")String power_steering,
			 @Param("power_windows")String power_windows,
			 @Param("am_fm_radio")String am_fm_radio,
			 @Param("usb_compability")String usb_compability
			 
		 );
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value ="INSERT INTO uci_vehicle_flow_tbl (vehicle_id,model_id,dealer_id,fuel_type,vehicle_no,manufacturing_year,odometer,ownership_id,insurance_validity,about_car,"
	 		+ "status_id,insurance_type,actual_price,rc_front,rc_rear,transmission_type,color,engine_no,chassis_no,insurance_provider,insurance_copy,rc_transfer,"
	 		+ "lifetime_tax_copy,lifetime_tax,negotiable,loan_option,video_url,test_drive,test_drive_type,test_drive_amount,"
	 		+ "abs,adjustable_external_mirror,adjustable_steering,air_conditioning,number_of_airbags,alloy_wheels,lock_system,parking_sensors,"
	 		+ "power_steering,power_windows,am_fm_radio,usb_compability) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);",nativeQuery =true)
	 Integer insert_uci_flow_addvehicle(
			 @Param("vehicle_id")Integer vehicle_id,
			 @Param("model_id")Integer model_id,
			 @Param("dealer_id")Integer dealer_id,
			 @Param("fuel_type")String fuel_type,
			 @Param("vehicle_no")String vehicle_no,
			 @Param("manufacturing_year")String manufacturing_year,
			 @Param("odometer")String odometer,
			 @Param("ownership_id")Integer ownership_id,
			 @Param("insurance_validity")String insurance_validity,
			 @Param("about_car")String about_car,
			 @Param("status_id")Integer status_id,
             @Param("insurance_type")String insurance_type,
             @Param("actual_price")Double actual_price,
             @Param("rc_front")String rc_front,
			 @Param("rc_rear")String rc_rear,
			 @Param("transmission_type")String transmission_type ,
			 @Param("color")String color,
			 @Param("engine_no")String engine_no,
			 @Param("chassis_no")String chassis_no,
			 @Param("insurance_provider")String insurance_provider,
			 @Param("insurance_copy")String insurance_copy,
			 @Param("rc_transfer")String rc_transfer,
			 @Param("lifetime_tax_copy")String lifetime_tax_copy,
			 @Param("lifetime_tax")String lifetime_tax,
			 @Param("negotiable")String negotiable,
			 @Param("loan_option")String loan_option,
			 @Param("video_url")String video_url,
			 @Param("test_drive")String test_drive,
			 @Param("test_drive_type")String test_drive_type,
			 @Param("test_drive_amount")Double test_drive_amount,
			 @Param("abs")String abs,
			 @Param("adjustable_external_mirror")String adjustable_external_mirror,
			 @Param("adjustable_steering")String adjustable_steering,
			 @Param("air_conditioning")String air_conditioning,
			 @Param("number_of_airbags")Integer number_of_airbags,
			 @Param("alloy_wheels")String alloy_wheels,
			 @Param("lock_system")String lock_system,
			 @Param("parking_sensors")String parking_sensors,
			 @Param("power_steering")String power_steering,
			 @Param("power_windows")String power_windows,
			 @Param("am_fm_radio")String am_fm_radio,
			 @Param("usb_compability")String usb_compability
			 );
	 
	 
	 @Query(value = "Select \n" + 
	 		"	z.vehicle_id,z.model_id,z.vehicle_make,z.vehicle_model,\n" + 
	 		"    z.vehicle_no,z.fuel_type,z.manufacturing_year,z.odometer,z.insurance_validity,\n" + 
	 		"    z.insurance_type,z.status_id,z.status,z.brand_icon,z.ownership,\n" + 
	 		"    z.inspection_on_display,z.enquiries_count,\n" + 
	 		"    ifnull(group_concat('[',z.images,']'),null) as images\n" + 
	 		"\n" + 
	 		"from (Select  \n" + 
	 		"	ucav.vehicle_id,ucav.model_id,cbmt.car_brand as vehicle_make,cmmt.car_model as vehicle_model,\n" + 
	 		"    ucav.vehicle_no,ucav.fuel_type,ucav.manufacturing_year,ucav.odometer,ucav.insurance_validity,\n" + 
	 		"    ucav.insurance_type,ucav.status_id,uvsmt.status,cbmt.brand_icon,uvomt.name as ownership,\n" + 
	 		"    ucav.inspection_on_display,count(uvet.vehicle_id) as enquiries_count,\n" + 
	 		"    ifnull(group_concat('{\"image\":\"',imgs.image,'\",\"image_type\":\"',image_type,'\"}'),null) as images\n" + 
	 		"from used_car_add_vehicle ucav\n" + 
	 		"Inner Join uci_vehicle_status_master_tbl uvsmt on uvsmt.id=ucav.status_id\n" + 
	 		"Inner Join uci_vehicle_ownership_master_tbl uvomt on uvomt.id=ucav.ownership_id\n" + 
	 		"Inner Join car_model_master_tbl cmmt on cmmt.model_id=ucav.model_id\n" + 
	 		"Left Join car_brand_master_tbl cbmt on cbmt.id=cmmt.brand_id\n" + 
	 		"Left Join uci_vehicle_enquiry_tbl uvet on uvet.dealer_id=ucav.dealer_id\n" + 
	 		"	and uvet.vehicle_id=ucav.vehicle_id and uvet.is_active='Y'\n" + 
	 		"Left Join (Select uvit.dealer_id,uvit.vehicle_id,uvit.image,uvitmt.name as image_type from uci_vehicle_images_tbl uvit\n" + 
	 		"	Inner join uci_vehicle_image_type_master_tbl uvitmt on uvitmt.id=uvit.image_type_id\n" + 
	 		"	Where uvit.is_active='Y') imgs on imgs.vehicle_id=ucav.vehicle_id\n" + 
	 		"	and imgs.dealer_id=ucav.dealer_id \n" + 
	 		"Where ucav.is_active='Y' and ucav.dealer_id=:dealerid\n" + 
	 		"	and case when :status_id=100 then ucav.status_id else ucav.status_id=:status_id end\n" + 
	 		"    and concat_ws('',cbmt.car_brand,cmmt.car_model,ucav.vehicle_no) LIKE CONCAT('%', :searchtext , '%') \n" + 
	 		"group by ucav.vehicle_id) z\n" + 
	 		"group by z.vehicle_id\n" + 
	 		"order by z.vehicle_id desc;\n", nativeQuery = true)
		 List<Map<String,Object>> home_page_carlist1(@Param("dealerid")Integer dealerid,@Param("status_id")Integer status_id,@Param("searchtext")String searchtext);
	 
	 
	 
	 
	 
	 @Query(value = "call uci_my_vehicle(:status_id, :dealerid,:searchtext,:page_no);", nativeQuery = true)
			 List<Map<String,Object>> home_page_carlist(@Param("dealerid")Integer dealerid,@Param("status_id")Integer status_id,@Param("searchtext")String searchtext,@Param("page_no")Integer page_no);
	 
	 
     @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="call uci_create_enquiry(:dealer_id,:vehicle_id,:customer_name,:phone_no,:description);",nativeQuery = true)
	 void insert_used_car_vehicle_enquiries(
			 @Param("dealer_id")Integer dealer_id,
			 @Param("vehicle_id")Integer vehicle_id,
			 @Param("customer_name")String customer_name,
			 @Param("phone_no")String phone_no,
			 @Param("description")String description
			 );
     
     
//   
//            @Query(value = "Select customer_name,phone_no,description,date_format(created_on,\"%D %b %Y\") as created_on  \n" + 
//            		"From uci_vehicle_enquiry_tbl\n" + 
//            		"Where is_active='Y'\n" + 
//            		" and dealer_id=:dealerid and vehicle_id=:vehicleid ;", nativeQuery = true)
	 @Query(value = "call uci_enquiry_list(:dealerid,:vehicleid);", nativeQuery = true)

	        List<Map<String,Object>> vehicle_enquiry_list(@Param("dealerid")Integer dealerid,@Param("vehicleid")Integer vehicleid);
     
  
  
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="Update used_car_add_vehicle Set status_id=:status_id\n" + 
	 		"Where is_active='Y' and dealer_id=:dealer_id and vehicle_id=:vehicle_id\n" + 
	 		";",nativeQuery = true)
	   void update_inspection_request(
			 @Param("status_id")Integer status_id,
			 @Param("dealer_id")Integer dealer_id,
			 @Param("vehicle_id")Integer vehicle_id	 
			 );
	 
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="Update used_car_add_vehicle Set status_id=:status_id,inspection_on=now(),inspection_on_display=now()\n" + 
	 		"Where is_active='Y' and dealer_id=:dealer_id and vehicle_id=:vehicle_id\n" +  
	 		";",nativeQuery = true)
	   void update_inspection_request_status(
			 @Param("status_id")Integer status_id,
			 @Param("dealer_id")Integer dealer_id,
			 @Param("vehicle_id")Integer vehicle_id	 
			 );
	 
     
     @Query(value = "Select uvit.image,uvitmt.name as image_type from uci_vehicle_images_tbl uvit\n" + 
     		"Inner join uci_vehicle_image_type_master_tbl uvitmt on uvitmt.id=uvit.image_type_id\n" + 
     		"Where uvit.is_active='Y' and uvit.dealer_id=:dealerid and uvit.vehicle_id=:vehicleid ;", nativeQuery = true)
     List<Map<String,Object>> vehicle_images_list(@Param("dealerid")Integer dealerid,@Param("vehicleid")Integer vehicleid);
     
     
     @Query(value = "Select  \n" + 
     		"	udmpmt.d_package_id,umpmt.name as d_package_name,udmpmt.actual_price,udmpmt.final_discount,udmpmt.after_discount,\n" + 
     		"    udmpmt.tax_percentage,udmpmt.tax_amount,round(udmpmt.final_amount) as final_amount\n" + 
     		"\n" + 
     		"from uci_dealer_main_package_mapping_tbl udmpmt\n" + 
     		"Inner Join uci_main_package_master_tbl umpmt on umpmt.main_package_id=udmpmt.main_package_id\n" + 
     		"	and umpmt.is_active='Y'\n" + 
     		"Where udmpmt.is_active='Y'\n" + 
     		"and Date(now()) between Date(udmpmt.valid_from) and Date(udmpmt.valid_to)\n" + 
     		"and udmpmt.dealer_id=:dealerid and udmpmt.category_id=:categoryid \n" + 
     		"group by udmpmt.main_package_id;\n" + 
     		";", nativeQuery = true)
      List<Map<String,Object>> package_list(@Param("dealerid")Integer dealerid,@Param("categoryid")Integer categoryid);
     
     
     @Query(value = "Select uaoppmt.id,uaomt.name,uaoppmt.actual_price,uaoppmt.final_discount,uaoppmt.after_discount,uaoppmt.tax_percentage,uaoppmt.tax_amount,round(uaoppmt.final_amount) as final_amount,'N' as is_warranty\n" + 
     		"From uci_add_ons_package_price_mapping_tbl uaoppmt\n" + 
     		"Inner Join uci_add_ons_master_tbl uaomt on uaomt.id=uaoppmt.add_on_id\n" + 
     		"Where uaomt.is_active='Y'\n" + 
     		"and Date(now()) between Date(uaoppmt.valid_from) and Date(uaoppmt.valid_to)\n" + 
     		"and uaoppmt.dealer_id=1 and uaoppmt.category_id=1\n" + 
     		"UNION ALL\n" + 
     		"select udwpmt.id,uwpmt.name,udwpmt.actual_price,udwpmt.final_discount,udwpmt.after_discount,udwpmt.tax_percentage,udwpmt.tax_amount,round(udwpmt.final_amount) as final_amount,'Y' as is_warranty\n" + 
     		"From uci_dealer_warranty_package_mapping_tbl udwpmt\n" + 
     		"Inner Join uci_warranty_package_price_mapping_tbl uwppmt on uwppmt.id=udwpmt.wp_package_id\n" + 
     		"Inner Join uci_warranty_package_master_tbl uwpmt on uwpmt.id=uwppmt.w_package_id\n" + 
     		"Where udwpmt.is_active='Y'\n" + 
     		"and Date(now()) between Date(udwpmt.valid_from) and Date(udwpmt.valid_to)\n" + 
     		"and udwpmt.dealer_id=:dealerid and udwpmt.category_id=:categoryid ;\n" + 
     		"", nativeQuery = true)
       List<Map<String,Object>> Addon_list(@Param("dealerid")Integer dealerid,@Param("categoryid")Integer categoryid);
     
     
//     
//     @Modifying(flushAutomatically = true)
//  	 @Transactional
	 @Query(value="call uci_create_customer(:customer_name,:phone_no,:comments,:vehicle_id,:category_id,:dealer_id,:d_package_id);",nativeQuery = true)
    Integer create_customer(
  			 @Param("dealer_id")Integer dealer_id,
  			 @Param("vehicle_id")Integer vehicle_id,
  			 @Param("customer_name")String customer_name,
  			 @Param("phone_no")String phone_no,
  			 @Param("comments")String comments,
  			 @Param("category_id")Integer category_id,
  			 @Param("d_package_id")Integer d_package_id
  			     );
     
     
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="Update uci_customer_warranty_package_mapping_tbl Set is_active='N' Where vehicle_id=:vehicle_id and is_active='Y' ;",nativeQuery = true)
	   void inactive_old_warranty(
			 @Param("vehicle_id")Integer vehicle_id	 
			 );
     
	 
	 @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value="Update uci_vehicle_add_ons_tbl Set is_active='N' Where vehicle_id=:vehicle_id and is_active='Y';",nativeQuery = true)
	   void inactive_old_addons(
			 @Param("vehicle_id")Integer vehicle_id );
	 
	  @Modifying(flushAutomatically = true)
	  	 @Transactional
		 @Query(value="call uci_add_vehicle_add_ons(:is_warranty,:user_id,:vehicle_id,:add_on_id,:dealer_id);",nativeQuery = true)
	  	 void add_vehicle_addons(
	  			 @Param("is_warranty")String is_warranty,
	  			 @Param("user_id")Integer user_id,
	  			 @Param("vehicle_id")Integer vehicle_id,
	  			 @Param("add_on_id")Integer add_on_id,
	  			 @Param("dealer_id")Integer dealer_id );
	  
	  
	  @Modifying(flushAutomatically = true)
	  	 @Transactional
		 @Query(value="Update uci_payments_tbl Set is_active='N' Where is_active='Y' and uci_vehicle_id=:vehicle_id and status not in('paid');",nativeQuery = true)
	  	 void inactive_old_payment(
	  			
	  			 @Param("vehicle_id")Integer vehicle_id);
	  
	  
	  			
	  
	    @Modifying(flushAutomatically = true)
		 @Transactional
		 @Query(value ="Insert Into uci_payments_tbl(user_id,uci_vehicle_id,actual_amount,final_discount,after_discount,tax_amount,final_amount,payment_option,follow_up_on,\n" + 
		 		"		payment_mode_id,status,order_id,payment_link,reference_id)\n" + 
		 		"		Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?); ",nativeQuery =true)
		 void insert_payent_option(
				 @Param("user_id")Integer user_id,
				 @Param("uci_vehicle_id")Integer uci_vehicle_id,
				 @Param("actual_amount")Double actual_amount,
				 @Param("final_discount")Double final_discount,
				 @Param("after_discount")Double after_discount,
				 @Param("tax_amount")Double tax_amount,
				 @Param("final_amount")Double final_amount,
				 @Param("payment_option")String payment_option,
				 @Param("follow_up_on")String follow_up_on,
				 @Param("payment_mode_id")Integer payment_mode_id,
				 @Param("status")String status,
				 @Param("order_id")String order_id,
				 @Param("payment_link")String payment_link,
				 @Param("reference_id")String reference_id
				
			 );
	     
	     @Query(value = "select id,title,description1,description2,coupon_code,coupon_image,\n" + 
	     		"	offer_category,offer_value,offer_validation,offer_validation_description \n" + 
	     		"from uci_dealer_wise_offer_tbl\n" + 
	     		"where dealer_id=:dealerid and is_active='Y'\n" + 
	     		"and Date(now()) between Date(valid_from) and Date(valid_to);\n" + 
	     		"", nativeQuery = true)
	      List<Map<String,Object>> offer_list(@Param("dealerid")Integer dealerid);
	     
	     
	     @Query(value = "select ucav.customer_name,ucav.phone_no,uvomt.name as ownership \n" + 
	     		"	from used_car_add_vehicle ucav\n" + 
	     		"	Inner Join uci_vehicle_ownership_master_tbl uvomt on uvomt.id=ucav.ownership_id\n" + 
	     		"	where ucav.vehicle_id=:vehicle_id and ucav.is_active='Y'\n" + 
	     		";\n" + 
		     		"", nativeQuery = true)
		      Map<String,Object> checkout_customerdetails(@Param("vehicle_id")Integer vehicle_id);
	     
	     
	     @Query(value = "select umpmt.name as main_package_name,date_format(ucpmt.valid_from, \"%d/%m/%y\") as valid_from,\n" + 
	     		"        date_format(ucpmt.valid_to, \"%d/%m/%y\") as valid_to,\n" + 
	     		"        udmpmt.actual_price,\n" + 
	     		"        udmpmt.final_discount,udmpmt.after_discount,udmpmt.tax_amount,round(udmpmt.final_amount) as final_amount\n" + 
	     		"		from uci_customer_package_mapping_tbl ucpmt\n" + 
	     		"		Inner Join uci_dealer_main_package_mapping_tbl udmpmt on udmpmt.d_package_id=ucpmt.d_package_id\n" + 
	     		"			and udmpmt.is_active='Y'\n" + 
	     		"		Inner Join uci_main_package_master_tbl umpmt on umpmt.main_package_id=udmpmt.main_package_id\n" + 
	     		"		Where ucpmt.vehicle_id=:vehicle_id and ucpmt.is_active='Y'\n" + 
	     		"		group by ucpmt.vehicle_id ;\n" + 
		     		"", nativeQuery = true)
		      Map<String,Object> checkout_packdetails(@Param("vehicle_id")Integer vehicle_id);
	     
	     
	     @Query(value = "Select uvaot.id,uaomt.name,uvaot.actual_price,uvaot.final_discount,uvaot.after_discount,\n" + 
	     		"		uvaot.tax_amount,round(uvaot.final_amount) as final_amount,'N' as is_warranty,\n" + 
	     		"        date_format(uvaot.valid_from, \"%d/%m/%y\") as valid_from,\n" + 
	     		"        date_format(uvaot.valid_to, \"%d/%m/%y\") as valid_to\n" + 
	     		"		From uci_vehicle_add_ons_tbl uvaot\n" + 
	     		"		Inner Join uci_add_ons_package_price_mapping_tbl uaoppmt on uaoppmt.id=uvaot.add_on_price_id\n" + 
	     		"		Inner Join uci_add_ons_master_tbl uaomt on uaomt.id=uaoppmt.add_on_id\n" + 
	     		"		Where uvaot.is_active='Y'\n" + 
	     		"		and Date(now()) between Date(uvaot.valid_from) and Date(uvaot.valid_to)\n" + 
	     		"		and uvaot.vehicle_id=:vehicle_id\n" + 
	     		"		UNION ALL\n" + 
	     		"		select ucwpmt.id,uwpmt.name,udwpmt.actual_price,udwpmt.final_discount,udwpmt.after_discount,\n" + 
	     		"		udwpmt.tax_amount,round(udwpmt.final_amount) as final_amount,'Y' as is_warranty,\n" + 
	     		"        date_format(ucwpmt.valid_from, \"%d/%m/%y\") as valid_from,\n" + 
	     		"        date_format(ucwpmt.valid_to, \"%d/%m/%y\") as valid_to\n" + 
	     		"		From uci_customer_warranty_package_mapping_tbl ucwpmt\n" + 
	     		"		Inner Join uci_dealer_warranty_package_mapping_tbl udwpmt on udwpmt.dealer_id=ucwpmt.dealer_id\n" + 
	     		"			and udwpmt.id=ucwpmt.dwp_package_id and udwpmt.is_active='Y'\n" + 
	     		"		Inner Join uci_warranty_package_price_mapping_tbl uwppmt on uwppmt.id=udwpmt.wp_package_id\n" + 
	     		"		Inner Join uci_warranty_package_master_tbl uwpmt on uwpmt.id=uwppmt.w_package_id\n" + 
	     		"		Where ucwpmt.is_active='Y'\n" + 
	     		"		and Date(now()) between Date(ucwpmt.valid_from) and Date(ucwpmt.valid_to)\n" + 
	     		"		and ucwpmt.vehicle_id=:vehicle_id ;\n" + 
		     		"", nativeQuery = true)
		      List<Map<String,Object>> checkout_addon_list(@Param("vehicle_id")Integer vehicle_id);
	     
	     
	     @Query(value = "select count(udwot.id) as no_of_offers_available\n" + 
	     		"		from uci_dealer_wise_offer_tbl udwot\n" + 
	     		"        where udwot.is_active='Y'\n" + 
	     		"        and Date(udwot.created_on) between Date(udwot.valid_from) and Date(udwot.valid_to)\n" + 
	     		"        and udwot.dealer_id=:dealerid ;", nativeQuery = true)
			      Map<String,Object> checkout_couponcount(@Param("dealerid")Integer dealerid);
	     
	     
	     @Query(value = "call uci_get_vehicle_prices(:vehicle_id,:coupon_id,:couponcode);\n" + 
		     		"", nativeQuery = true)
		      List<Map<String,Object>> checkout_price_list(@Param("vehicle_id")Integer vehicle_id,@Param("coupon_id")Integer coupon_id,@Param("couponcode")String couponcode);
	     
	     @Query(value = "call uci_get_vehicle_prices_for_payment_link(:vehicle_id,:coupon_id,:couponcode);\n" + 
		     		"", nativeQuery = true)
		      Map<String,Object> checkout_payment_object(@Param("vehicle_id")Integer vehicle_id,@Param("coupon_id")Integer coupon_id,@Param("couponcode")String couponcode);
	     
	     @Modifying(flushAutomatically = true)
	  	 @Transactional
	  	 @Query(value = "call uci_complete_payment(:vehicle_id,:coupon_id,:couponcode);\n" + 
		     		"", nativeQuery = true)
	  	 void complete_payment_couponupdate(@Param("vehicle_id")Integer vehicle_id,
	  			@Param("coupon_id")Integer coupon_id,
	  			@Param("couponcode")String couponcode);
	     
	     
//	     @Modifying(flushAutomatically = true)
//	  	 @Transactional
		 @Query(value="call uci_insert_payment_details(:user_id,:uci_vehicle_id,:actual_amount,:final_discount,:after_discount,:tax_amount,:final_amount,:payment_option,:follow_up_on,:payment_mode_id,:status,:order_id,:payment_link,:reference_id);",nativeQuery = true)
	    Integer complete_payment_status(
	  			 @Param("user_id")Integer user_id,
	  			 @Param("uci_vehicle_id")Integer uci_vehicle_id,
	  			 @Param("actual_amount")Double actual_amount,
	  			 @Param("final_discount")Double final_discount,
	  			 @Param("after_discount")Double after_discount,
	  			 @Param("tax_amount")Double tax_amount,
	  			 @Param("final_amount")Double final_amount,
	  			 @Param("payment_option")String payment_option,
	  			 @Param("follow_up_on")String follow_up_on,
	  			 @Param("payment_mode_id")String payment_mode_id,
	  			@Param("status")String status,
	  			@Param("order_id")String order_id,
	  			@Param("payment_link")String payment_link,
	  			@Param("reference_id")String reference_id
	  			 
	  			     );
		 

	     
	     @Query(value = "select ifnull(vendor_name,'') vendor_name,ifnull(owner_name,'')owner_name,ifnull(phone_no,'')phone_no,ifnull(alternative_no,'')alternative_no,ifnull(email_id,'')email_id,\n" + 
	     		"	ifnull(location,'')location,ifnull(landmark,'')landmark,ifnull(city,'')city,ifnull(state,'')state,ifnull(pincode,'')pincode,ifnull(latitude,'')latitude,ifnull(longitude,'')longitude,ifnull(dealer_logo,'')dealer_logo \n" + 
	     		"from car_vendor_admin_master_tbl\n" + 
	     		"Where is_active='Y' and vendor_admin_id=:dealerid " + 
	     		" ;", nativeQuery = true)
		      Map<String,Object> profile_details(@Param("dealerid")Integer dealerid);
	     
	     
	     @Query(value = "select email_id,phone_no \n" + 
	     		"from uci_support_master_tbl\n" + 
	     		"where is_active='Y' limit 1\n" +
		     		" ;", nativeQuery = true)
			      Map<String,Object> help_support_details();
	     
	     
	     
	     @Query(value = "call uci_get_sold_vehicles(:dealerid,:month,:year,:search);\n" + 
		     		"", nativeQuery = true)
	     List<soldData> sold_vehicle_list(@Param("dealerid")Integer dealerid,@Param("month")String month,@Param("year")String year,@Param("search")String search);
	     
	     @Query(value = "call uci_get_vehicle_package_and_add_ons(:vehicle_id);\n" + 
		     		"", nativeQuery = true)
	     List<soldData> sold_vehicle_packaddonlist(@Param("vehicle_id")Integer vehicle_id);
	     
	     @Query(value = "call uci_get_package_and_add_ons_activities(:vehicle_id,:id,:item_type);\n" + 
		     		"", nativeQuery = true)
	     List<soldData> sold_vehicle_includes(@Param("vehicle_id")Integer vehicle_id,@Param("id")Integer id,@Param("item_type")String item_type);
	     
	     @Query(value = "call uci_vehicle_info_category_list(:vehicle_id,:dealer_id);\n" + 
		     		"", nativeQuery = true)
	     List<Map<String,Object>> share_category_list(@Param("vehicle_id")Integer vehicle_id,@Param("dealer_id")Integer dealer_id);
	     
	     
	     @Query(value = "call uci_vehicle_info_category_data_points(:vehicle_id,:category_id,:dealer_id);\n" + 
		     		"", nativeQuery = true)
	    Map<String,Object> share_subcategory_list(@Param("vehicle_id")Integer vehicle_id,@Param("category_id")Integer category_id,@Param("dealer_id")Integer dealer_id);
	     
	     
	     
	     @Query(value = "call uci_help_and_support_data((:dealerid);\n" + 
		     		"", nativeQuery = true)
	      List<Map<String,Object>> help_support_list(@Param("dealerid")Integer dealerid);
	     
	     
	     @Modifying(flushAutomatically = true)
		 @Transactional
		 @Query(value = "call uci_update_vehicle_info_category_wise(:vehicle_id,:dealer_id, :category_id,:odometer,:ownership_id,:ownership,:insurance_validity,:insurance_type,"
		 		+ ":insurance_provider,:insurance_copy,:engine_no,"
		 		+ ":chassis_no,:rc_front,:rc_rear,:rc_transfer,:lifetime_tax_copy,:lifetime_tax,"
		 		+ ":actual_price,:negotiable,:loan_option,:video_url,:test_drive,:test_drive_type,"
		 		+ ":test_drive_amount,:abs,:adjustable_external_mirror,:adjustable_steering,:air_conditioning,"
		 		+ ":number_of_airbags,:alloy_wheels,:lock_system,:parking_sensors,:power_steering,"
		 		+ ":power_windows,:am_fm_radio,:usb_compability,:front_image,:right_image,:left_image,:rear_image,"
		 		+ ":trunk_image,:dashboard_image,:front_seat_image,:floor_mat_image,:infotainm_image,:odometer_image,"
		 		+ ":rear_seat_image,:engine_image,:fl_tyre_image,:fr_tyre_image,:rl_tyre_image,:rr_tyre_image,:profile_image);\n" + 
		     		"", nativeQuery = true)
		 void update_data_points(
				 @Param("vehicle_id")Integer vehicle_id,
				 @Param("dealer_id")Integer dealer_id,
		         @Param("category_id")Integer category_id,
                 @Param("odometer")String odometer,
                 @Param("ownership_id")Integer ownership_id,
                 @Param("ownership")String ownership,
                 @Param("insurance_validity")String insurance_validity,
                 @Param("insurance_type")String insurance_type,
                 @Param("insurance_provider")String insurance_provider,
                 @Param("insurance_copy")String insurance_copy,
                 @Param("engine_no")String engine_no,
                 @Param("chassis_no")String chassis_no,
                 @Param("rc_front")String rc_front,
                 @Param("rc_rear")String rc_rear,
                 @Param("rc_transfer")String rc_transfer,
                 @Param("lifetime_tax_copy")String lifetime_tax_copy,
                 @Param("lifetime_tax")String lifetime_tax,
                 @Param("actual_price")Double actual_price,
                 @Param("negotiable")String negotiable,
                 @Param("loan_option")String loan_option,
                 @Param("video_url")String video_url,
                 @Param("test_drive")String test_drive,
                 @Param("test_drive_type")String test_drive_type,
                 @Param("test_drive_amount")Double test_drive_amount,
                 @Param("abs")String abs,
                 @Param("adjustable_external_mirror")String adjustable_external_mirror,
                 @Param("adjustable_steering")String adjustable_steering,
                 @Param("air_conditioning")String air_conditioning,
                 @Param("number_of_airbags")Integer number_of_airbags,
                 @Param("alloy_wheels")String alloy_wheels,
                 @Param("lock_system")String lock_system,
                 @Param("parking_sensors")String parking_sensors,
                 @Param("power_steering")String power_steering,
                 @Param("power_windows")String power_windows,
                 @Param("am_fm_radio")String am_fm_radio,
                 @Param("usb_compability")String usb_compability,
                 @Param("front_image")String front_image,
                 @Param("right_image")String right_image,
                 @Param("left_image")String left_image,
                 @Param("rear_image")String rear_image,
                 @Param("trunk_image")String trunk_image,
                 @Param("dashboard_image")String dashboard_image,
                 @Param("front_seat_image")String front_seat_image,
                 @Param("floor_mat_image")String floor_mat_image,
                 @Param("infotainm_image")String infotainm_image,
                 @Param("odometer_image")String odometer_image,
                 @Param("rear_seat_image")String rear_seat_image,
                 @Param("engine_image")String engine_image,
                 @Param("fl_tyre_image")String fl_tyre_image,
                 @Param("fr_tyre_image")String fr_tyre_image,
                 @Param("rl_tyre_image")String rl_tyre_image,
                 @Param("rr_tyre_image")String rr_tyre_image,
                 @Param("profile_image")String profile_image
                 

                 );
		 
	     @Modifying(flushAutomatically = true)
		 @Transactional
		 @Query(value = "call uci_update_vehicle_info_data_point_access_category_wise(:vehicle_id, :dealer_id,:category_id,:is_car_brand,:is_car_model,"
		 		+ ":is_fuel_type,:is_vehicle_no,:is_manufacturg_year,"
		 		+ ":is_odometer,:is_ownership,:is_transmission_type,"
		 		+ ":is_color,:is_insurance_validity,:is_insurance_type,:is_insurance_provider,:is_insurance_copy,:is_enge_no,"
		 		+ ":is_chassis_no,:is_rc_front,:is_rc_rear,:is_rc_transfer,:is_lifetime_tax_copy,:is_lifetime_tax,"
		 		+ ":is_actual_price,:is_negotiable,:is_loan_option,:is_front_image,:is_left_image,"
		 		+ ":is_right_image,:is_rear_image,:is_enge_image,:is_dashboard_image,:is_fl_tyre_image,"
		 		+ ":is_fr_tyre_image,:is_rl_tyre_image,:is_rr_tyre_image,:is_floor_mat_image,\n" 
		 		+ ":is_front_seat_image,:is_trunk_image,:is_rear_seat_image,:is_fotam_image,\n" 
		 		+ ":is_odometer_image,:is_video_url,:is_inspection_report_image,:is_diagnostic_report_image,\n" 
		 		+ ":is_warranty_certificate_image,:is_matenance_url,:is_test_drive,:is_test_drive_type,\n" 
		 		+ ":is_test_drive_amount,:is_abs,:is_adjustable_external_mirror,:is_adjustable_steerg,\n"  
                + ":is_air_conditiong,:is_number_of_airbags,:is_alloy_wheels,:is_lock_system,\n" 
		 		+ ":is_parkg_sensors,:is_power_steerg,:is_power_wdows,:is_am_fm_radio,:is_usb_compability);\n"+
		 		"", nativeQuery = true)
		 void update_data_access_points(
				 @Param("vehicle_id")Integer vehicle_id,
				 @Param("dealer_id")Integer dealer_id,
		         @Param("category_id")Integer category_id,
		          @Param("is_car_brand")String is_car_brand,
                 @Param("is_car_model")String is_car_model,
                 @Param("is_fuel_type")String is_fuel_type,
                 @Param("is_vehicle_no")String is_vehicle_no,
                 @Param("is_manufacturg_year")String is_manufacturg_year,
                 @Param("is_odometer")String is_odometer,
                 @Param("is_ownership")String is_ownership,
                 @Param("is_transmission_type")String is_transmission_type,
                 @Param("is_color")String is_color,
                 @Param("is_insurance_validity")String is_insurance_validity,
                 @Param("is_insurance_type")String is_insurance_type,
                 @Param("is_insurance_provider")String is_insurance_provider,
                 @Param("is_insurance_copy")String is_insurance_copy,
                 @Param("is_enge_no")String is_enge_no,
                 @Param("is_chassis_no")String is_chassis_no,
                 @Param("is_rc_front")String is_rc_front,
                 @Param("is_rc_rear")String is_rc_rear,
                 @Param("is_rc_transfer")String is_rc_transfer,
                 @Param("is_lifetime_tax_copy")String is_lifetime_tax_copy,
                 @Param("is_lifetime_tax")String is_lifetime_tax,
                 @Param("is_actual_price")String is_actual_price,             
                 @Param("is_negotiable")String is_negotiable,
                 @Param("is_loan_option")String is_loan_option,
                 @Param("is_front_image")String is_front_image,
                 @Param("is_left_image")String is_left_image,
                 @Param("is_right_image")String is_right_image,
                 @Param("is_rear_image")String is_rear_image,
                 @Param("is_enge_image")String is_enge_image,
                 @Param("is_dashboard_image")String is_dashboard_image,
                 @Param("is_fl_tyre_image")String is_fl_tyre_image,
                 @Param("is_fr_tyre_image")String is_fr_tyre_image,
                 @Param("is_rl_tyre_image")String is_rl_tyre_image,
                 @Param("is_rr_tyre_image")String is_rr_tyre_image,
                 @Param("is_floor_mat_image")String is_floor_mat_image, 
                 @Param("is_front_seat_image")String is_front_seat_image,
                 @Param("is_trunk_image")String is_trunk_image,
                 @Param("is_rear_seat_image")String is_rear_seat_image,
                 @Param("is_fotam_image")String is_fotam_image,
                 @Param("is_odometer_image")String is_odometer_image,
                 @Param("is_video_url")String is_video_url,
                 @Param("is_inspection_report_image")String is_inspection_report_image,
                 @Param("is_diagnostic_report_image")String is_diagnostic_report_image,
                 @Param("is_warranty_certificate_image")String is_warranty_certificate_image,
                 @Param("is_matenance_url")String is_matenance_url,
                 @Param("is_test_drive")String is_test_drive,
                 @Param("is_test_drive_type")String is_test_drive_type,
                 @Param("is_test_drive_amount")String is_test_drive_amount,
                 @Param("is_abs")String is_abs,
                 @Param("is_adjustable_external_mirror")String is_adjustable_external_mirror,
                 @Param("is_adjustable_steerg")String is_adjustable_steerg,
                 @Param("is_air_conditiong")String is_air_conditiong,
                 @Param("is_number_of_airbags")String is_number_of_airbags,
                 @Param("is_alloy_wheels")String is_alloy_wheels,
                 @Param("is_lock_system")String is_lock_system,
                 @Param("is_parkg_sensors")String is_parkg_sensors,
                 @Param("is_power_steerg")String is_power_steerg,
                 @Param("is_power_wdows")String is_power_wdows,
                 @Param("is_am_fm_radio")String is_am_fm_radio,
                 @Param("is_usb_compability")String is_usb_compability
                 );
	     
	     
	    @Query(value = "call uci_create_vehicle_info_url(:vehicle_id,:valid_minutes,:is_car_brand,:is_car_model,:is_fuel_type,"
	     		+ ":is_vehicle_no,:is_manufacturing_year,:is_odometer,:is_ownership,:is_transmission_type,:is_color,"
	     		+ ":is_insurance_validity,:is_insurance_type,:is_insurance_provider,:is_insurance_copy,:is_engine_no,"
	     		+ ":is_chassis_no,:is_rc_front,:is_rc_rear,:is_rc_transfer,:is_lifetime_tax_copy,:is_lifetime_tax,"
	     		+ ":is_actual_price,:is_negotiable,:is_loan_option,:is_front_image,:is_left_image,:is_right_image,"
	     		+ ":is_rear_image,:is_engine_image,:is_dashboard_image,:is_fl_tyre_image,:is_fr_tyre_image,"
	     		+ ":is_rl_tyre_image,:is_rr_tyre_image,:is_floor_mat_image,:is_front_seat_image,:is_trunk_image,"
	     		+ ":is_rear_seat_image,:is_infotainm_image,:is_odometer_image,:is_video_url,:is_inspection_report_image,"
	     		+ ":is_diagnostic_report_image,:is_warranty_certificate_image,:is_maintenance_url,:is_test_drive,:is_test_drive_type,"
	     		+ ":is_test_drive_amount,:is_abs,:is_adjustable_external_mirror,:is_adjustable_steering,:is_air_conditioning,"
	     		+ ":is_number_of_airbags,:is_alloy_wheels,:is_lock_system,:is_parking_sensors,:is_power_steering,"
	     		+ ":is_power_windows,:is_am_fm_radio,:is_usb_compability);" +
		     		"", nativeQuery = true)
	    Map<String,Object> store_url_data(@Param("vehicle_id")Integer vehicle_id,
	    		@Param("valid_minutes")String valid_minutes,
	    		@Param("is_car_brand")String is_car_brand,
	    		@Param("is_car_model")String is_car_model,
	    		@Param("is_fuel_type")String is_fuel_type,
	    		@Param("is_vehicle_no")String is_vehicle_no,
	    		@Param("is_manufacturing_year")String is_manufacturing_year,
	    		@Param("is_odometer")String is_odometer,
	    		@Param("is_ownership")String is_ownership,
	    		@Param("is_transmission_type")String is_transmission_type,
	    		@Param("is_color")String is_color,
	    		@Param("is_insurance_validity")String is_insurance_validity,
	    		@Param("is_insurance_type")String is_insurance_type,
	    		@Param("is_insurance_provider")String is_insurance_provider,
	    		@Param("is_insurance_copy")String is_insurance_copy,
	    		@Param("is_engine_no")String is_engine_no,
	    		@Param("is_chassis_no")String is_chassis_no,
	    		@Param("is_rc_front")String is_rc_front,
	    		@Param("is_rc_rear")String is_rc_rear,
	    		@Param("is_rc_transfer")String is_rc_transfer,
	    		@Param("is_lifetime_tax_copy")String is_lifetime_tax_copy,
	    		@Param("is_lifetime_tax")String is_lifetime_tax,
	    		@Param("is_actual_price")String is_actual_price,
	    		@Param("is_negotiable")String is_negotiable,
	    		@Param("is_loan_option")String is_loan_option,
	    		@Param("is_front_image")String is_front_image,
	    		@Param("is_left_image")String is_left_image,
	    		@Param("is_right_image")String is_right_image,
	    		@Param("is_rear_image")String is_rear_image,
	    		@Param("is_engine_image")String is_engine_image,
	    		@Param("is_dashboard_image")String is_dashboard_image,
	    		@Param("is_fl_tyre_image")String is_fl_tyre_image,
	    		@Param("is_fr_tyre_image")String is_fr_tyre_image,
	    		@Param("is_rl_tyre_image")String is_rl_tyre_image,
	    		@Param("is_rr_tyre_image")String is_rr_tyre_image,
	    		@Param("is_floor_mat_image")String is_floor_mat_image,
	    		@Param("is_front_seat_image")String is_front_seat_image,
	    		@Param("is_trunk_image")String is_trunk_image,
	    		@Param("is_rear_seat_image")String is_rear_seat_image,
	    		@Param("is_infotainm_image")String is_infotainm_image,
	    		@Param("is_odometer_image")String is_odometer_image,
	    		@Param("is_video_url")String is_video_url,
	    		@Param("is_inspection_report_image")String is_inspection_report_image,
	    		@Param("is_diagnostic_report_image")String is_diagnostic_report_image,
	    		@Param("is_warranty_certificate_image")String is_warranty_certificate_image,
	    		@Param("is_maintenance_url")String is_maintenance_url,
	    		@Param("is_test_drive")String is_test_drive,
	    		@Param("is_test_drive_type")String is_test_drive_type,
	    		@Param("is_test_drive_amount")String is_test_drive_amount,
	    		@Param("is_abs")String is_abs,
	    		@Param("is_adjustable_external_mirror")String is_adjustable_external_mirror,
	    		@Param("is_adjustable_steering")String is_adjustable_steering,
	    		@Param("is_air_conditioning")String is_air_conditioning,
	    		@Param("is_number_of_airbags")String is_number_of_airbags,
	    		@Param("is_alloy_wheels")String is_alloy_wheels,
	    		@Param("is_lock_system")String is_lock_system,
	    		@Param("is_parking_sensors")String is_parking_sensors,
	    		@Param("is_power_steering")String is_power_steering,
	    		@Param("is_power_windows")String is_power_windows,
	    		@Param("is_am_fm_radio")String is_am_fm_radio,
	    		@Param("is_usb_compability")String is_usb_compability
	    		);
	     
	     @Modifying(flushAutomatically = true)
	  	 @Transactional
		 @Query(value="Update uci_vehicle_info_url_tbl Set url=:mainurl,url_code=:url_code Where url_id=:url_id and is_active='Y';",nativeQuery = true)
	  	 void generateurl( @Param("url_id")Integer url_id,@Param("url_code")String url_code,@Param("mainurl")String mainurl);
	     
	     
	      @Query(value = "call uci_vehicle_inspection_report_data(:vehicle_id);", nativeQuery = true)
	      List<Map<String,Object>> inspection_report_data(@Param("vehicle_id")Integer vehicle_id);
	     
	      @Query(value = "call uci_get_test_drive_requests(:vehicle_id,:lead_id);", nativeQuery = true)
	      List<Map<String,Object>> test_drive_request_list(@Param("vehicle_id")Integer vehicle_id,@Param("lead_id")Integer lead_id);
	     
	     @Query(value = "call uci_get_vehicle_info_links(:vehicle_id);", nativeQuery = true)
	      List<Map<String,Object>> vehicle_info_link(@Param("vehicle_id")Integer vehicle_id);
	     
	     
	     @Modifying(flushAutomatically = true)
		 @Transactional
		 @Query(value ="call uci_create_test_drive_request(:vehicle_id, :customer_name, :phone_no,:date,:time,:address); ",nativeQuery =true)
		 void insert_new_test_drive_request(
				
			     @Param("vehicle_id")Integer vehicle_id,
				 @Param("customer_name")String customer_name,
				 @Param("phone_no")String phone_no,
				 @Param("date")String date,
				 @Param("time")String time,
				 @Param("address")String address
	 );
	     
	     
	     @Query(value = "call uci_get_vehicle_inspection_flow(:vehicle_id);", nativeQuery = true)
	      Map<String,Object> vehicle_inspection_flow(@Param("vehicle_id")Integer vehicle_id);
	     
	     
	         @Modifying(flushAutomatically = true)
			 @Transactional
			 @Query(value ="call uci_create_vehicle_status_flow(:vehicle_id, :status_id); ",nativeQuery =true)
			 void update_vehicle_status_flow(
					
				      @Param("vehicle_id")Integer vehicle_id,
					 @Param("status_id")Integer status_id
					
		 );
	         
	         
               @Query(value = "call uci_status_questions_list(:status_id,:sub_status_id);", nativeQuery = true)
		      List<Map<String,Object>> lead_status_reason_list(@Param("status_id")Integer status_id,@Param("sub_status_id")Integer sub_status_id);
               
               
             
               
               
      	     @Modifying(flushAutomatically = true)
   		 @Transactional
    		 @Query(value ="call uci_update_enquiry_status(:lead_id, :status_id, :sub_status_id,:selected_date,:selected_time,:question_id,:option_id,:comments); ",nativeQuery =true)
      	   void update_enquiry_status(
    				
               	     @Param("lead_id")Integer lead_id,
    				 @Param("status_id")Integer status_id,
    				 @Param("sub_status_id")Integer sub_status_id,
    				 @Param("selected_date")String selected_date,
    				 @Param("selected_time")String selected_time,
    				 @Param("question_id")Integer question_id,
    				 @Param("option_id")Integer option_id,
    				 @Param("comments")String comments );  
      	     
             
      	 
    
      	   @Query(value = "call uci_get_lead_history(:lead_id);", nativeQuery = true)
 	       List<Map<String,Object>> lead_history_list(@Param("lead_id")Integer lead_id);
      	   
      	   
      	 @Query(value ="call uci_update_enquiry_status(:lead_id, :status_id, :sub_status_id,:selected_date,:selected_time,:question_id,:option_id,:comments); ",nativeQuery =true)
	       Integer update_cancel_status(
				
         	     @Param("lead_id")Integer lead_id,
				 @Param("status_id")Integer status_id,
				 @Param("sub_status_id")Integer sub_status_id,
				 @Param("selected_date")String selected_date,
				 @Param("selected_time")String selected_time,
				 @Param("question_id")Integer question_id,
				 @Param("option_id")Integer option_id,
				 @Param("comments")String comments );  
		 
     @Modifying(flushAutomatically = true)
	 @Transactional
	 @Query(value ="call uci_create_lead_flow_reasons(:lead_flow_id, :question_id, :option_ids,:comments); ",nativeQuery =true)
     void update_cancel_reasons(
     	     @Param("lead_flow_id")Integer lead_flow_id,
			 @Param("question_id")Integer question_id,
			 @Param("option_ids")String option_ids,
			 @Param("comments")String comments); 
      	     
      	 
	     
}

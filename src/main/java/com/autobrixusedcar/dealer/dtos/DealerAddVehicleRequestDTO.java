package com.autobrixusedcar.dealer.dtos;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.query.Param;

public class DealerAddVehicleRequestDTO {

	private String vehicle_make;
	private String vehicle_model;
	private String fuel_type;
	private String vehicle_no;
	private String manfufacturing_year;
	
	private String car_type;
	private String saleid;
	private String actualamount;
	private String discountamount;
	private String finalamount;
	private String razorpayid;
	private String paymentstatus;
	private String ispaid;
	private String vehicleid;
	private String customername;
	private String customerno;
	
	private String model_id;
	private String couponid;
	private String couponcode;

	private String ownership_id;
	private String insurance_validity;
	private String about_car;
	private String status_id;
	private String insurance_type;
	private String searchtext;
	private String odometer;
	private String vin_number;
	private String vendor_id;
	private String employee_name;
	private String phone_no;
	
	private String ownership;
	private String transmission_type;
	private String color;
	private String engine_no;
	private String chassis_no;
	private String insurance_provider;
	private String insurance_copy;
	private String rc_transfer;
	private String lifetime_tax_copy;
	private String lifetime_tax;
	private String negotiable;
	private String loan_option;
	private String video_url;
	private String maintenance_url;
	private String test_drive;
	private String test_drive_type;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private String test_drive_amount;
	private String abs;
	private String adjustable_external_mirror;
	private String adjustable_steering;
	private String air_conditioning;
	private String number_of_airbags;
	private String alloy_wheels;
	private String lock_system;
	private String parking_sensors;
	private String power_steering;
	private String power_windows;
	private String am_fm_radio;
	private String usb_compability;
	
	private String date;
	private String time;
	private String address;
	
	
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	public String getTransmission_type() {
		return transmission_type;
	}
	public void setTransmission_type(String transmission_type) {
		this.transmission_type = transmission_type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}
	public String getChassis_no() {
		return chassis_no;
	}
	public void setChassis_no(String chassis_no) {
		this.chassis_no = chassis_no;
	}
	public String getInsurance_provider() {
		return insurance_provider;
	}
	public void setInsurance_provider(String insurance_provider) {
		this.insurance_provider = insurance_provider;
	}
	public String getInsurance_copy() {
		return insurance_copy;
	}
	public void setInsurance_copy(String insurance_copy) {
		this.insurance_copy = insurance_copy;
	}
	public String getRc_transfer() {
		return rc_transfer;
	}
	public void setRc_transfer(String rc_transfer) {
		this.rc_transfer = rc_transfer;
	}
	public String getLifetime_tax_copy() {
		return lifetime_tax_copy;
	}
	public void setLifetime_tax_copy(String lifetime_tax_copy) {
		this.lifetime_tax_copy = lifetime_tax_copy;
	}
	public String getLifetime_tax() {
		return lifetime_tax;
	}
	public void setLifetime_tax(String lifetime_tax) {
		this.lifetime_tax = lifetime_tax;
	}
	public String getNegotiable() {
		return negotiable;
	}
	public void setNegotiable(String negotiable) {
		this.negotiable = negotiable;
	}
	public String getLoan_option() {
		return loan_option;
	}
	public void setLoan_option(String loan_option) {
		this.loan_option = loan_option;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	public String getMaintenance_url() {
		return maintenance_url;
	}
	public void setMaintenance_url(String maintenance_url) {
		this.maintenance_url = maintenance_url;
	}
	public String getTest_drive() {
		return test_drive;
	}
	public void setTest_drive(String test_drive) {
		this.test_drive = test_drive;
	}
	public String getTest_drive_type() {
		return test_drive_type;
	}
	public void setTest_drive_type(String test_drive_type) {
		this.test_drive_type = test_drive_type;
	}
	public String getTest_drive_amount() {
		return test_drive_amount;
	}
	public void setTest_drive_amount(String test_drive_amount) {
		this.test_drive_amount = test_drive_amount;
	}
	public String getAbs() {
		return abs;
	}
	public void setAbs(String abs) {
		this.abs = abs;
	}
	public String getAdjustable_external_mirror() {
		return adjustable_external_mirror;
	}
	public void setAdjustable_external_mirror(String adjustable_external_mirror) {
		this.adjustable_external_mirror = adjustable_external_mirror;
	}
	public String getAdjustable_steering() {
		return adjustable_steering;
	}
	public void setAdjustable_steering(String adjustable_steering) {
		this.adjustable_steering = adjustable_steering;
	}
	public String getAir_conditioning() {
		return air_conditioning;
	}
	public void setAir_conditioning(String air_conditioning) {
		this.air_conditioning = air_conditioning;
	}
	public String getNumber_of_airbags() {
		return number_of_airbags;
	}
	public void setNumber_of_airbags(String number_of_airbags) {
		this.number_of_airbags = number_of_airbags;
	}
	public String getAlloy_wheels() {
		return alloy_wheels;
	}
	public void setAlloy_wheels(String alloy_wheels) {
		this.alloy_wheels = alloy_wheels;
	}
	public String getLock_system() {
		return lock_system;
	}
	public void setLock_system(String lock_system) {
		this.lock_system = lock_system;
	}
	public String getParking_sensors() {
		return parking_sensors;
	}
	public void setParking_sensors(String parking_sensors) {
		this.parking_sensors = parking_sensors;
	}
	public String getPower_steering() {
		return power_steering;
	}
	public void setPower_steering(String power_steering) {
		this.power_steering = power_steering;
	}
	public String getPower_windows() {
		return power_windows;
	}
	public void setPower_windows(String power_windows) {
		this.power_windows = power_windows;
	}
	public String getAm_fm_radio() {
		return am_fm_radio;
	}
	public void setAm_fm_radio(String am_fm_radio) {
		this.am_fm_radio = am_fm_radio;
	}
	public String getUsb_compability() {
		return usb_compability;
	}
	public void setUsb_compability(String usb_compability) {
		this.usb_compability = usb_compability;
	}
	public String getCouponid() {
		return couponid;
	}
	public void setCouponid(String couponid) {
		this.couponid = couponid;
	}
	public String getCouponcode() {
		return couponcode;
	}
	public void setCouponcode(String couponcode) {
		this.couponcode = couponcode;
	}
	
	public String getActual_price() {
		return actual_price;
	}
	public void setActual_price(String actual_price) {
		this.actual_price = actual_price;
	}

	private String employee_image;
	private String category_id;
	private String d_package_id;
	private String is_warranty;
	private String user_id;
	private String add_on_id;
	private String final_discount;
	private String after_discount;
	private String tax_amount;
	private String payment_option;
	private String follow_up_on;
	private String payment_mode_id;
	private String actual_price;
	private String page_no;
	public String getPage_no() {
		return page_no;
	}
	public void setPage_no(String page_no) {
		this.page_no = page_no;
	}

	private String rc_front_image_url;
	public String getRc_front_image_url() {
		return rc_front_image_url;
	}
	public void setRc_front_image_url(String rc_front_image_url) {
		this.rc_front_image_url = rc_front_image_url;
	}
	public String getRc_rear_image_url() {
		return rc_rear_image_url;
	}
	public void setRc_rear_image_url(String rc_rear_image_url) {
		this.rc_rear_image_url = rc_rear_image_url;
	}
	private String rc_rear_image_url;

	public List<Map<String, String>> getAddonid() {
		return addonid;
	}
	public void setAddonid(List<Map<String, String>> addonid) {
		this.addonid = addonid;
	}
	private String status;
	private String order_id;
	private String payment_link;
	private String reference_id;
	private List<Map<String,String>>addonid;
	
	public String getFinal_discount() {
		return final_discount;
	}
	public void setFinal_discount(String final_discount) {
		this.final_discount = final_discount;
	}
	public String getAfter_discount() {
		return after_discount;
	}
	public void setAfter_discount(String after_discount) {
		this.after_discount = after_discount;
	}
	public String getTax_amount() {
		return tax_amount;
	}
	public void setTax_amount(String tax_amount) {
		this.tax_amount = tax_amount;
	}
	public String getPayment_option() {
		return payment_option;
	}
	public void setPayment_option(String payment_option) {
		this.payment_option = payment_option;
	}
	public String getFollow_up_on() {
		return follow_up_on;
	}
	public void setFollow_up_on(String follow_up_on) {
		this.follow_up_on = follow_up_on;
	}
	public String getPayment_mode_id() {
		return payment_mode_id;
	}
	public void setPayment_mode_id(String payment_mode_id) {
		this.payment_mode_id = payment_mode_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getPayment_link() {
		return payment_link;
	}
	public void setPayment_link(String payment_link) {
		this.payment_link = payment_link;
	}
	public String getReference_id() {
		return reference_id;
	}
	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}
	public String getIs_warranty() {
		return is_warranty;
	}
	public void setIs_warranty(String is_warranty) {
		this.is_warranty = is_warranty;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getAdd_on_id() {
		return add_on_id;
	}
	public void setAdd_on_id(String add_on_id) {
		this.add_on_id = add_on_id;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getD_package_id() {
		return d_package_id;
	}
	public void setD_package_id(String d_package_id) {
		this.d_package_id = d_package_id;
	}
	public String getSearchtext() {
		return searchtext;
	}
	public void setSearchtext(String searchtext) {
		this.searchtext = searchtext;
	}
	public String getInsurance_type() {
		return insurance_type;
	}
	public void setInsurance_type(String insurance_type) {
		this.insurance_type = insurance_type;
	}
	private List<Map<String, Object>> imagesArr;
	
	private String dealer_id;
	
	public String getDealer_id() {
		return dealer_id;
	}
	public void setDealer_id(String dealer_id) {
		this.dealer_id = dealer_id;
	}
	public List<Map<String, Object>> getImagesArr() {
		return imagesArr;
	}
	public void setImagesArr(List<Map<String, Object>> imagesArr) {
		this.imagesArr = imagesArr;
	}
	public String getStatus_id() {
		return status_id;
	}
	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}
	public String getModel_id() {
		return model_id;
	}
	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}
	public String getOwnership_id() {
		return ownership_id;
	}
	public void setOwnership_id(String ownership_id) {
		this.ownership_id = ownership_id;
	}
	public String getInsurance_validity() {
		return insurance_validity;
	}
	public void setInsurance_validity(String insurance_validity) {
		this.insurance_validity = insurance_validity;
	}
	public String getAbout_car() {
		return about_car;
	}
	public void setAbout_car(String about_car) {
		this.about_car = about_car;
	}
	
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerno() {
		return customerno;
	}
	public void setCustomerno(String customerno) {
		this.customerno = customerno;
	}
	public String getSaleid() {
		return saleid;
	}
	public void setSaleid(String saleid) {
		this.saleid = saleid;
	}
	public String getActualamount() {
		return actualamount;
	}
	public void setActualamount(String actualamount) {
		this.actualamount = actualamount;
	}
	public String getDiscountamount() {
		return discountamount;
	}
	public void setDiscountamount(String discountamount) {
		this.discountamount = discountamount;
	}
	public String getFinalamount() {
		return finalamount;
	}
	public void setFinalamount(String finalamount) {
		this.finalamount = finalamount;
	}
	public String getRazorpayid() {
		return razorpayid;
	}
	public void setRazorpayid(String razorpayid) {
		this.razorpayid = razorpayid;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getIspaid() {
		return ispaid;
	}
	public void setIspaid(String ispaid) {
		this.ispaid = ispaid;
	}
	public String getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getVehicle_make() {
		return vehicle_make;
	}
	public void setVehicle_make(String vehicle_make) {
		this.vehicle_make = vehicle_make;
	}
	public String getVehicle_model() {
		return vehicle_model;
	}
	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	public String getVehicle_no() {
		return vehicle_no;
	}
	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}
	public String getManfufacturing_year() {
		return manfufacturing_year;
	}
	public void setManfufacturing_year(String manfufacturing_year) {
		this.manfufacturing_year = manfufacturing_year;
	}
	public String getOdometer() {
		return odometer;
	}
	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}
	public String getVin_number() {
		return vin_number;
	}
	public void setVin_number(String vin_number) {
		this.vin_number = vin_number;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmployee_image() {
		return employee_image;
	}
	public void setEmployee_image(String employee_image) {
		this.employee_image = employee_image;
	}

}



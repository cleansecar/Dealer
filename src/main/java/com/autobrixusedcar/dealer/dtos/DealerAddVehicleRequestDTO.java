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



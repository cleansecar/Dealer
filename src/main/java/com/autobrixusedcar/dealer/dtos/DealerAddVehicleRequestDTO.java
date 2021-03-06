package com.autobrixusedcar.dealer.dtos;

import org.springframework.data.repository.query.Param;

public class DealerAddVehicleRequestDTO {
	private String vehicle_make;
	private String vehicle_model;
	private String fuel_type;
	private String vehicle_no;
	private String manfufacturing_year;
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
	private String odometer;
	private String vin_number;
	private String vendor_id;
	private String employee_name;
	private String phone_no;
	private String employee_image;
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



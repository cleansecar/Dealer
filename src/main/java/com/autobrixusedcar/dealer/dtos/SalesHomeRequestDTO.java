package com.autobrixusedcar.dealer.dtos;

public class SalesHomeRequestDTO {
	
	
	private String customerName;
	private String customermobileno;
	private String packageId;
	private String vehicleId;
	
	private String followupdate;

	private String followuptime	;

	private String employeeId;
	
	private String dealerId;
	
	
	
	
	private String ServicepackageId;
	
	private String Comment;
	
	
	private String servicedate;
	
	private String actual_package_amount;
	private String discount_amount;
	private String final_price;
	


	public String getServicedate() {
		return servicedate;
	}

	public void setServicedate(String servicedate) {
		this.servicedate = servicedate;
	}

	public String getActual_package_amount() {
		return actual_package_amount;
	}

	public void setActual_package_amount(String actual_package_amount) {
		this.actual_package_amount = actual_package_amount;
	}

	public String getDiscount_amount() {
		return discount_amount;
	}

	public void setDiscount_amount(String discount_amount) {
		this.discount_amount = discount_amount;
	}

	public String getFinal_price() {
		return final_price;
	}

	public void setFinal_price(String final_price) {
		this.final_price = final_price;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public String getServicepackageId() {
		return ServicepackageId;
	}

	public void setServicepackageId(String servicepackageId) {
		ServicepackageId = servicepackageId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomermobileno() {
		return customermobileno;
	}

	public void setCustomermobileno(String customermobileno) {
		this.customermobileno = customermobileno;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getFollowupdate() {
		return followupdate;
	}

	public void setFollowupdate(String followupdate) {
		this.followupdate = followupdate;
	}

	public String getFollowuptime() {
		return followuptime;
	}

	public void setFollowuptime(String followuptime) {
		this.followuptime = followuptime;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}
	

}

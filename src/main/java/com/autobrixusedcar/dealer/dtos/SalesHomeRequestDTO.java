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

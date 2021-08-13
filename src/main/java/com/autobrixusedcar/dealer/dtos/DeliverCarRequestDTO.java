package com.autobrixusedcar.dealer.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliverCarRequestDTO {
	private String exchange_id;
	private String lead_id;
	private String address_line_1;
	private String address_line_2;
	private String landmark;
	private String city;
	private String status;
	private String state;
	private String pincode;
	private String vehicle_id;
	private String aadhar_front_image;
	private String aadhar_rear_image;
	private String pan_card_front_image;
	private String pan_card_rear_image;
	private String driving_licience_front_image;
	private String driving_licience_rear_image;
	private String passport_size_image;
	private String commitment_id;
	private String is_exists;
	private String comments;
	private String dealer_id;
	private String postdelvehimage1;
	private String postdelvehimage2;
	private String postdelvehimage3;
	private String postdelvehimage4;
	private List<Map<String, Object>> commitmentarr;
	private String customer_name;
	private String customer_no;
	private String model_id;
	private String vehicle_make;
	private String vehicle_model;
	private String fuel_type;
	private String vehicle_no;
	private String ownership;
	private String odometer;
	private String manufacturing_year;
	private String color;
	private String price;
	private String transmission_type;
	private String paymentid;
	private String paymenttypeid;
	private String paymentmodeid;
	private String appliedamount;
	private String finalamount;
	private String refno;
	private String bankid;
	private String chequeno;
	private String chequestatus;
	private String loanstatus;
}

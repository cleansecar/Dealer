package com.autobrixusedcar.dealer.Controllers;

import com.autobrixusedcar.dealer.dtos.DealerAddVehicleRequestDTO;
import com.autobrixusedcar.dealer.dtos.DeliverCarRequestDTO;
import com.autobrixusedcar.dealer.services.DeliverCarService;
import com.autobrixusedcar.dealer.services.JPAException;
import com.autobrixusedcar.dealer.services.VehicleEnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/dealer/deliver_car")
public class DeliverCarController {
	@Autowired
	private DeliverCarService delivercarservice;

	@GetMapping("/getleadaddress")
	public ResponseEntity<Object> getleadaddress(@RequestParam("lead_id") String lead_id) {
		Map<String,Object> details = delivercarservice.getleadAddress(lead_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}
	@PostMapping("/updateleadaddress")
	public ResponseEntity<Object> updateleadaddress(@RequestBody DeliverCarRequestDTO dto) throws JPAException {
		delivercarservice.updateleadaddress(dto);
		Map<String, String> map = new HashMap<>();
		map.put("message", "Updated successfully.");
		return com.autobrixusedcar.dealer.utils.Response.success(map);

	}

	@GetMapping("/getcommitmentlist")
	public ResponseEntity<Object> getcommitmentlist() {
		Map<String,Object> details = delivercarservice.getpostvehdeliverycommitmentlist();
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}

	@PostMapping("/updatepostvehdeliveryvehdetails")
	public ResponseEntity<Object> updatepostvehdeliverydetails(@RequestBody DeliverCarRequestDTO dto) throws JPAException {
		delivercarservice.updatepostvehdeliverydetails(dto);
		Map<String, String> map = new HashMap<>();
		map.put("message", "Updated successfully.");
		return com.autobrixusedcar.dealer.utils.Response.success(map);

	}

	@GetMapping("/getvehiclexchangedata")
	public ResponseEntity<Object> getvehicleexchangedata(@RequestParam("vehicle_id") String vehicle_id,@RequestParam("mobile_no") String mobile_no) {
		Map<String,Object> details = delivercarservice.getvehicleexchangedata(vehicle_id,mobile_no);
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}

	@PostMapping("/updatevehicleexchangedata")
	public ResponseEntity<Object> updatevehicleexchangedata(@RequestBody DeliverCarRequestDTO dto) throws JPAException {
		delivercarservice.updatevehicleexchangedata(dto);
		Map<String, String> map = new HashMap<>();
		map.put("message", "Updated successfully.");
		return com.autobrixusedcar.dealer.utils.Response.success(map);

	}

	@GetMapping("/getpaymenttypelist")
	public ResponseEntity<Object> getpaymenttypelist() {
		Map<String,Object> details = delivercarservice.getpaymenttypelist();
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}

	@GetMapping("/getpaymentmodelist")
	public ResponseEntity<Object> getpaymentmodelist() {
		Map<String,Object> details = delivercarservice.getpaymentmodelist();
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}

	@GetMapping("/getbanklist")
	public ResponseEntity<Object> getbanklist() {
		Map<String,Object> details = delivercarservice.getbanklist();
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}


	@PostMapping("/createleadpayment")
	public ResponseEntity<Object> createleadpayment(@RequestBody DeliverCarRequestDTO dto) throws JPAException {
		delivercarservice.createleadpayment(dto);
		Map<String, String> map = new HashMap<>();
		map.put("message", "Added successfully.");
		return com.autobrixusedcar.dealer.utils.Response.success(map);

	}


	@PostMapping("/cancelleadpayment")
	public ResponseEntity<Object> cancelleadpayment(@RequestBody DeliverCarRequestDTO dto) throws JPAException {
		delivercarservice.cancelleadpayment(dto);
		Map<String, String> map = new HashMap<>();
		map.put("message", "Updated successfully.");
		return com.autobrixusedcar.dealer.utils.Response.success(map);

	}

	@GetMapping("/getleaddata")
	public ResponseEntity<Object> getleaddata(@RequestParam("lead_id") String lead_id,@RequestParam("status")String status) {
		Map<String,Object> details = delivercarservice.getleaddata(lead_id,status);
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}

	@GetMapping("/getpincode")
	public ResponseEntity<Object> getpincodedetails(@RequestParam("pincode") String pincode) {
		Map<String,Object> details = delivercarservice.getpincodedetails(pincode);
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}

	@GetMapping("/getbaldetails")
	public ResponseEntity<Object> getbaldetails(@RequestParam("lead_id") String lead_id) {
		Map<String,Object> details = delivercarservice.getbaldetails(lead_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}


}

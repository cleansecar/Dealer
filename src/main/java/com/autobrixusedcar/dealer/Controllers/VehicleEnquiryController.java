package com.autobrixusedcar.dealer.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.autobrixusedcar.dealer.services.DealerHomeService;
import com.autobrixusedcar.dealer.services.VehicleEnquiryService;

@Controller
@RequestMapping("/dealer/vehicle_enquiry")
public class VehicleEnquiryController {
	@Autowired
	private VehicleEnquiryService vehicleenquiryservice;
	
	@GetMapping("/getvehicleenquiry/typelist")
	public ResponseEntity<Object> getvehicleenquirytypelist(@RequestParam("dealer_id") String dealer_id,@RequestParam("month") String month,@RequestParam("year") String year,@RequestParam("from_date") String from_date,@RequestParam("to_date") String to_date) {		
		Map<String,Object> details = vehicleenquiryservice.getvehicleenquirytypelist(dealer_id, month, year, from_date, to_date);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	
	}
	
	
	@GetMapping("/getvehicleenquiry/brandlist")
	public ResponseEntity<Object> getvehicleenquirybrandlist(@RequestParam("dealer_id") String dealer_id,@RequestParam("month") String month,@RequestParam("year") String year,@RequestParam("from_date") String from_date,@RequestParam("to_date") String to_date,@RequestParam("vehicle_category_id")String vehicle_category_id) {		
		Map<String,Object> details = vehicleenquiryservice.getvehicleenquirybrandlist(dealer_id, month, year, from_date, to_date, vehicle_category_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	
	}
	
	
	@GetMapping("/getvehicleenquiry/statuslist")
	public ResponseEntity<Object> getvehicleenquirystatuslist(@RequestParam("dealer_id") String dealer_id,@RequestParam("month") String month,@RequestParam("year") String year,@RequestParam("from_date") String from_date,@RequestParam("to_date") String to_date,@RequestParam("vehicle_category_id")String vehicle_category_id,@RequestParam("brand_id")String brand_id,@RequestParam("model_id")String model_id,@RequestParam("manufacturing_year")String manufacturing_year,@RequestParam("fuel_type")String fuel_type) {		
		Map<String,Object> details = vehicleenquiryservice.getvehicleenquirystatuslist(dealer_id, month, year, from_date, to_date, vehicle_category_id, brand_id, model_id, manufacturing_year, fuel_type);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	
	}
	
	
	@GetMapping("/getvehicleenquiry/enquirymaster")
	public ResponseEntity<Object> getvehicleenquirystatuslist(@RequestParam("dealer_id") String dealer_id,@RequestParam("month") String month,@RequestParam("year") String year,@RequestParam("from_date") String from_date,@RequestParam("to_date") String to_date,@RequestParam("vehicle_category_id")String vehicle_category_id,@RequestParam("brand_id")String brand_id,@RequestParam("model_id")String model_id,@RequestParam("manufacturing_year")String manufacturing_year,@RequestParam("fuel_type")String fuel_type,@RequestParam("status_ids")String status_ids,@RequestParam("sub_status_ids")String sub_status_ids,@RequestParam("page_no")String page_no,@RequestParam("search")String search) {
		Map<String,Object> details = vehicleenquiryservice.getenquirymasterlist(dealer_id, month, year, from_date, to_date, vehicle_category_id, brand_id, model_id, manufacturing_year, fuel_type, status_ids, sub_status_ids,page_no,search);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	
	}
	
	
	@GetMapping("/getallcar/typelist")
	public ResponseEntity<Object> getallcartypelist(@RequestParam("dealer_id") String dealer_id,@RequestParam("month") String month,@RequestParam("year") String year,@RequestParam("from_date") String from_date,@RequestParam("to_date") String to_date) {		
		Map<String,Object> details = vehicleenquiryservice.getallcarvehtypelist(dealer_id, month, year, from_date, to_date);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	
	}
	
	
	@GetMapping("/getallcar/brandlist")
	public ResponseEntity<Object> getallcarbrandlist(@RequestParam("dealer_id") String dealer_id,@RequestParam("month") String month,@RequestParam("year") String year,@RequestParam("from_date") String from_date,@RequestParam("to_date") String to_date,@RequestParam("vehicle_category_id")String vehicle_category_id) {		
		Map<String,Object> details = vehicleenquiryservice.getallcarvehbrandlist(dealer_id, month, year, from_date, to_date, vehicle_category_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	
	}
	
	
	@GetMapping("/getallcar/statuslist")
	public ResponseEntity<Object> getallcarstatuslist(@RequestParam("dealer_id") String dealer_id,@RequestParam("month") String month,@RequestParam("year") String year,@RequestParam("from_date") String from_date,@RequestParam("to_date") String to_date,@RequestParam("vehicle_category_id")String vehicle_category_id,@RequestParam("brand_id")String brand_id,@RequestParam("model_id")String model_id,@RequestParam("manufacturing_year")String manufacturing_year,@RequestParam("fuel_type")String fuel_type) {		
		Map<String,Object> details = vehicleenquiryservice.getallcarvehstatuslist(dealer_id, month, year, from_date, to_date, vehicle_category_id, brand_id, model_id, manufacturing_year, fuel_type);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	
	}
	

}

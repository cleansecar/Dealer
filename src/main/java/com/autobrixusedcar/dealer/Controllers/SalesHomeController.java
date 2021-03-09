package com.autobrixusedcar.dealer.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;
import com.autobrixusedcar.dealer.dtos.SalesHomeRequestDTO;
import com.autobrixusedcar.dealer.services.DealerHomeService;
import com.autobrixusedcar.dealer.services.JPAException;
import com.autobrixusedcar.dealer.services.SalesHomeService;
import com.autobrixusedcar.dealer.utils.Response;

@Controller
@RequestMapping("/salesHomeservices")
public class SalesHomeController {
	@Autowired
	private SalesHomeService saleshomeservice;
	
	@GetMapping("/getsalesallvehiclelist")
	public ResponseEntity<Object>getsalesvehiclelist(@RequestParam("dealerId")String dealerId){
		
		Map<String, Object>details=saleshomeservice.getsalesvehiclelist(dealerId);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	}
	
	
	
	@PostMapping("/insertflowupDetails")
	public ResponseEntity<Object> insertflowupDetails(@RequestBody SalesHomeRequestDTO dto)  throws JPAException{
		saleshomeservice.insertflowupDetails(dto);		
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Created successfully.");
			System.out.print("yes");

		return com.autobrixusedcar.dealer.utils.Response.success(map);
		}
	
	
	
	@PostMapping("/insertsoldDetails")
	public ResponseEntity<Object> insertsoldDetails(@RequestBody SalesHomeRequestDTO dto)  throws JPAException{
		saleshomeservice.insertsoldDetails(dto);		
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Created successfully.");
			System.out.print("yes");

		return com.autobrixusedcar.dealer.utils.Response.success(map);
		}
	
	
	@GetMapping("/getpackageslistdropdown")
	public ResponseEntity<Object> getpackageslistdropdown(@RequestParam("cartype")String cartype) {
		Map<String,Object>deatails = saleshomeservice.getpackageslistdropdown(cartype);
		return Response.success(deatails);
		
	}
	
	@GetMapping("/getpackagesstartdates")
	public ResponseEntity<Object> getpackagesstartdates() {
		Map<String,Object>deatails = saleshomeservice.getpackagesstartdates();
		return Response.success(deatails);
		
	}
	@GetMapping("/getfollowupvehiclelist")
	public ResponseEntity<Object>getfollowupvehiclelist(@RequestParam("employeeId")String employeeId,@RequestParam("searchtext")String searchtext){
		
		Map<String, Object>details=saleshomeservice.getfollowupvehiclelist(employeeId, searchtext);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	}
	
	@GetMapping("/getfollowuphistory")
	public ResponseEntity<Object>getfollowuphistory(@RequestParam("vehicleId")String vehicleId){
		
		Map<String, Object>details=saleshomeservice.getfollowuphistory(vehicleId);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	}
	
	
	@GetMapping("/getsoldvehiclelist")
	public ResponseEntity<Object>getsoldvehiclelist(@RequestParam("employeeId")String employeeId){
		Map<String, Object>details=saleshomeservice.getsoldvehiclelist(employeeId);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	}
	
}

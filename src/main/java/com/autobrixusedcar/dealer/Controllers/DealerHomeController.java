package com.autobrixusedcar.dealer.Controllers;

import java.util.HashMap;
import java.util.Map;

//import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.autobrixusedcar.dealer.dtos.DealerAddVehicleRequestDTO;
import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;
import com.autobrixusedcar.dealer.services.DealerHomeService;
import com.autobrixusedcar.dealer.services.*;
import com.autobrixusedcar.dealer.utils.*;

@Controller
@RequestMapping("/dealerHomeservices")
public class DealerHomeController {

	@Autowired
	private DealerHomeService dealerhomeservice;
	
	
	@PostMapping("/addnewdealar")
	public ResponseEntity<Object> createnewdealar(@RequestBody DealerHomeRequestDTO dto)  throws JPAException{
		 dealerhomeservice.createnewdealar(dto);		
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Created successfully.");
			System.out.print("yes");

		return com.autobrixusedcar.dealer.utils.Response.success(map);
		}
	
	@PostMapping("/getdealerHomepagedetails")
	public ResponseEntity<Object> getdealerHomepagedetails(@RequestBody DealerHomeRequestDTO dto) {
		
		System.out.print("yes");
		Map<String, Object> details = dealerhomeservice.getdealerHomepagedetails(dto);	
		
		return com.autobrixusedcar.dealer.utils.Response.success(details);

		
	}
	
	
	
	
	@GetMapping("/getsaleemployeelist")
	public ResponseEntity<Object> getsalesemployeelist(@RequestParam("phoneNo") String phoneNo, @RequestParam("typeofAcc") String typeofAcc){		
		Map<String,Object> details = dealerhomeservice.getsaleemployeelist(phoneNo, typeofAcc);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	  }
	
	@PostMapping("/addnewcar")
	public ResponseEntity<Object>addcar(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.addcar(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Added successfully.");
			System.out.print("yes");
		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	@GetMapping("/searchcar")
	public ResponseEntity<Object>setsearchvehicle(@RequestParam ("searchtext")String searchtext){
		Map<String,Object> details = dealerhomeservice.getsearchlist(searchtext);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	}
		@GetMapping("/getvehiclelist")
	public ResponseEntity<Object>getvehiclelist(@RequestParam("dealerId")String dealerId,@RequestParam("searchtext")String searchtext){
		
		Map<String, Object>details=dealerhomeservice.getvehiclelist(dealerId, searchtext);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	}
	
	
	@PostMapping("/addnewemployee")
	public ResponseEntity<Object>addemployee(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.addemployee(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Added successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	
	
	@GetMapping("/getdealersemployeelist")
	public ResponseEntity<Object> getdealersemployeelist(@RequestParam("employeeId") String employeeId){		
		Map<String,Object> details = dealerhomeservice.getdealersemployeelist(employeeId);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	
	
	@GetMapping("/getdealersapprovalsList")
	public ResponseEntity<Object> getdealersapprovalsList(@RequestParam("employeeId") String employeeId){		
		Map<String,Object> details = dealerhomeservice.getdealersapprovalsList(employeeId);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	
	
	@GetMapping("/getdealersCheckoutPage")
	public ResponseEntity<Object> getdealersCheckoutPage(@RequestParam("saleId") String saleId){		
		Map<String,Object> details = dealerhomeservice.getdealersCheckoutPage(saleId);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	@GetMapping("/updatedealerapprove")
	public ResponseEntity<Object> updatedealerapprove(@RequestParam("vehicleId") String vehicleId) throws JPAException{		
		 dealerhomeservice.updatedealerapprove(vehicleId);
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Updated successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		}
	
	@GetMapping("/getdealerallsaleslist")
	public ResponseEntity<Object> getdealerallsaleslist(@RequestParam("employeeid") String employeeid) {		
		Map<String,Object> details = dealerhomeservice.getdealerallsaleslist(employeeid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }	
	
	
	
	@GetMapping("/getcommisionlist")
	public ResponseEntity<Object> getcommisionlist(@RequestParam("employeeid") String employeeid) {		
		Map<String,Object> details = dealerhomeservice.getcommisionlist(employeeid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }	
	
	
	
	@PostMapping("/paymentupdate")
	public ResponseEntity<Object>paymentupdate(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.paymentupdate(dto);	
		
		Map<String, String> map = new HashMap<>();
	        map.put("message", "Added successfully.");
			System.out.print("yes");
		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	
}


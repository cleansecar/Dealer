package com.autobrixusedcar.dealer.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.autobrixusedcar.dealer.services.DealerHomeService;
import com.autobrixusedcar.dealer.services.SalesHomeService;

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

}

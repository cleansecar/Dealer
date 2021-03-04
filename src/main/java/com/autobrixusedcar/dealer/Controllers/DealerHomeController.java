package com.autobrixusedcar.dealer.Controllers;

import java.util.HashMap;
import java.util.Map;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;
import com.autobrixusedcar.dealer.services.DealerHomeService;
import com.autobrixusedcar.dealer.services.*;

@Controller
@RequestMapping("/dealerHomeservices")
public class DealerHomeController {

	@Autowired
	private DealerHomeService dealerhomeservice;
	
	
	@PostMapping("/addnewdealar")
	public ResponseEntity<Object> createnewdealar(@RequestBody DealerHomeRequestDTO dto)  throws JPAException{
		 dealerhomeservice.createnewdealar(dto);		
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Assigned successfully.");
			System.out.print("yes");

		return com.autobrixusedcar.dealer.utils.Response.success(map);
		}
	
	@PostMapping("/getdealerHomepagedetails")
	public ResponseEntity<Object> getdealerHomepagedetails(@RequestBody DealerHomeRequestDTO dto) {
		
		System.out.print("yes");
		Map<String, Object> details = dealerhomeservice.getdealerHomepagedetails(dto);	
		
		return com.autobrixusedcar.dealer.utils.Response.success(details);

		
	}
	
	
	
	
	
}

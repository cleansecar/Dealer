package com.autobrixusedcar.dealer.services;

import java.util.Map;

import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;
import com.autobrixusedcar.dealer.dtos.SalesHomeRequestDTO;

public interface SalesHomeService {
	
	Map<String, Object> getsalesvehiclelist(String dealerId);
	
	
	void insertflowupDetails(SalesHomeRequestDTO dto) throws JPAException;
	
	
	void insertsoldDetails(SalesHomeRequestDTO dto) throws JPAException;

	Map<String,Object> getpackageslistdropdown(String cartpe);
	Map<String,Object> getpackagesstartdates();
	Map<String,Object> getfollowupvehiclelist(String employeeId,String searchtext);
	Map<String,Object> getfollowuphistory(String vehicleId);
	Map<String,Object> getsoldvehiclelist(String employeeId);
	
}

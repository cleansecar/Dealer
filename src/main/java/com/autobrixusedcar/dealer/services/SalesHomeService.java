package com.autobrixusedcar.dealer.services;

import java.util.Map;

import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;
import com.autobrixusedcar.dealer.dtos.SalesHomeRequestDTO;

public interface SalesHomeService {
	
	Map<String, Object> getsalesvehiclelist(String dealerId);
	
	
	void insertflowupDetails(SalesHomeRequestDTO dto) throws JPAException;

}

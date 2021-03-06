package com.autobrixusedcar.dealer.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobrixusedcar.dealer.repositories.SalesHomeRepository;

@Service
public class SalesHomeServiceImpl implements SalesHomeService {
	@Autowired
	private SalesHomeRepository saleshomerepository;

	@Override
	public Map<String, Object> getsalesvehiclelist(String dealerId) {
		List<Map<String,Object>>vehiclelist=saleshomerepository.used_car_sales_vehicle_list(dealerId);
		Map<String,Object>map=new HashMap<>();
		map.put("salesvehiclelist", vehiclelist);
		return map;
	}

}

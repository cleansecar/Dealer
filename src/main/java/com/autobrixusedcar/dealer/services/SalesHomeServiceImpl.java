package com.autobrixusedcar.dealer.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobrixusedcar.dealer.dtos.SalesHomeRequestDTO;
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

	@Override
	public void insertflowupDetails(SalesHomeRequestDTO dto) throws JPAException {
		// TODO Auto-generated method stub
		
		saleshomerepository.updateintoused_car_add_vehicle(dto.getCustomerName(), dto.getCustomermobileno(), dto.getPackageId(), dto.getVehicleId());
		
		saleshomerepository.insertintoused_car_customer_vehicle_follow_up(dto.getCustomerName(), dto.getCustomermobileno(), dto.getFollowupdate(), dto.getFollowuptime(), dto.getVehicleId(), dto.getEmployeeId(), dto.getDealerId());
		
		
		
		return;
		
	}

}

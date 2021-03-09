package com.autobrixusedcar.dealer.services;

import java.util.Map;

import com.autobrixusedcar.dealer.dtos.DealerAddVehicleRequestDTO;
import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;


public interface DealerHomeService {
	
	void createnewdealar(DealerHomeRequestDTO dto) throws JPAException;


	Map<String,Object> getdealerHomepagedetails(DealerHomeRequestDTO dto);
	
	Map<String,Object> getsaleemployeelist(String phoneNo,String typeofacc);

	
	void addcar(DealerAddVehicleRequestDTO dto) throws JPAException;
	
	Map<String,Object> getsearchlist(String searchtext);
	Map<String,Object> getvehiclelist(String dealerId,String searchtext);
	
	void addemployee(DealerAddVehicleRequestDTO dto) throws JPAException;
	
	Map<String, Object> getdealersemployeelist(String employeeId);
	
	Map<String, Object> getdealersapprovalsList(String employeeId);
	Map<String, Object> getdealersCheckoutPage(String saleId);
	Map<String, Object> getdealerallsaleslist(String employeeid);

	void updatedealerapprove(String vehicleId) throws JPAException;
}

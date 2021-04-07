package com.autobrixusedcar.dealer.services;

import java.util.Map;

import com.autobrixusedcar.dealer.dtos.DealerAddVehicleRequestDTO;
import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;


public interface DealerHomeService {
	
	void createnewdealar(DealerHomeRequestDTO dto) throws JPAException;


	Map<String,Object> getdealerHomepagedetails(DealerHomeRequestDTO dto);
	
	Map<String,Object> getsaleemployeelist(String phoneNo,String typeofacc);

	
	void addcar(DealerAddVehicleRequestDTO dto) throws JPAException;
	Map<String,Object>  adducicars(DealerAddVehicleRequestDTO dto) throws JPAException;
	
	
	Map<String,Object> getsearchlist(String searchtext);
	Map<String,Object> getvehiclelist(String dealerId,String searchtext);
	
	void addemployee(DealerAddVehicleRequestDTO dto) throws JPAException;
	void addnewenquiry(DealerAddVehicleRequestDTO dto) throws JPAException;
	void updateinspectionrequest(DealerAddVehicleRequestDTO dto) throws JPAException;
	
	Map<String, Object> getdealersemployeelist(String employeeId);
	
	Map<String, Object> getdealersapprovalsList(String employeeId);
	Map<String, Object> getdealersCheckoutPage(String saleId);
	Map<String, Object> getdealerallsaleslist(String employeeid);
	
	Map<String, Object> getenquirylist(String dealerid, String vehicleid);

	
	Map<String, Object> getvehicleimagelist(String dealerid, String vehicleid);
	
	Map<String, Object> getpackagelist(String dealerid, String categoryid);
	
	Map<String, Object> getaddonslist(String dealerid,String categoryid);
	
	Map<String, Object> getcommisionlist(String employeeid);
	

	Map<String, Object> getimagelist();
	
	Map<String,Object> gethomepagecarlist(DealerAddVehicleRequestDTO dto);
	void updatedealerapprove(String vehicleId) throws JPAException;
	void paymentupdate(DealerAddVehicleRequestDTO dto) throws JPAException;
	Map<String, Object> getownershiplist();
	Map<String, Object> getvehiclstatuslist();
	
	void addsalesdetails(DealerAddVehicleRequestDTO dto) throws JPAException;

	
	

}

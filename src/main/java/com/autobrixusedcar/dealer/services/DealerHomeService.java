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
	
	Map<String, Object> getofferlist(String dealerid);
	
	Map<String, Object> getvehicleimagelist(String dealerid, String vehicleid);
	
	Map<String, Object> getpackagelist(String dealerid, String categoryid);
	
	Map<String, Object> getaddonslist(String dealerid,String categoryid);
	
	Map<String, Object> getcommisionlist(String employeeid);
	Map<String, Object> getcheckoutdetails(String dealerid, String vehicle_id, String coupon_id, String couponcode);
	Map<String, Object> getprofiledata(String dealerid);
	Map<String, Object> gethelpsupportdata();

	Map<String, Object> getimagelist();
	
	Map<String,Object> gethomepagecarlist(DealerAddVehicleRequestDTO dto);
	void updatedealerapprove(String vehicleId) throws JPAException;
	void paymentupdate(DealerAddVehicleRequestDTO dto) throws JPAException;
	Map<String, Object> getownershiplist();
	Map<String, Object> getvehiclstatuslist();
	
	void addsalesdetails(DealerAddVehicleRequestDTO dto) throws JPAException;
	
	Map<String, Object>completepayment(DealerAddVehicleRequestDTO dto) throws JPAException;

	Map<String, Object> getsoldvehicllist(String dealerid, String month, String year);



}

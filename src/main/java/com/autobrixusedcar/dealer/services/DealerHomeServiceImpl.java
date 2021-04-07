package com.autobrixusedcar.dealer.services;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.autobrixusedcar.dealer.dtos.DealerAddVehicleRequestDTO;
import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;
import com.autobrixusedcar.dealer.repositories.DealerHomeRepository;
import com.autobrixusedcar.dealer.utils.Util;
@Service
public class DealerHomeServiceImpl implements DealerHomeService {

	@Autowired
	private DealerHomeRepository dealerhomerepository;
	
	
	
	@Override
	public void createnewdealar(DealerHomeRequestDTO dto) throws JPAException{
		
		
		dealerhomerepository.insert_car_vendor_admin_master_tbl(dto.getDealername(), dto.getDealername(), dto.getDealermobileno(), dto.getAltermobileno(), dto.getLocation(), 
				dto.getLandmark(), dto.getCreatedby(), dto.getCity(), dto.getState() , dto.getLatitude(), dto.getLongitude(), dto.getAdharimage(), dto.getAdharno(), dto.getPancardimage(), dto.getPancardno(), 
				dto.getLicenceimage(), dto.getLicenceno(), dto.getSuvcommistion(), dto.getHatchbackcommistion(), dto.getSedancommistion(), dto.getAccountholdername(), dto.getBankname(),
				dto.getAccountno(), dto.getIfsccode(), dto.getAcc_is_verified(), dto.getPincode());		
	return;
	}



	@Override
	public Map<String, Object> getdealerHomepagedetails(DealerHomeRequestDTO dto) {
		// TODO Auto-generated method stub
		
		 
      
	
		Map<String,Object> data = dealerhomerepository.used_car_home_page_sales_amount(dto.getMobileno(), dto.getTypeofacc(), dto.getFromDate(), dto.getToDate(), dto.getDuration());
		
		
		Map<String,Object> details = dealerhomerepository.used_car_home_page_vendor_details(dto.getMobileno(), dto.getTypeofacc());

		Map<String, Object> map = new HashMap<>();
		map.put("details", details);
		map.put("data", data);
		return map;
	}



	@Override
	public Map<String, Object> getsaleemployeelist(String phoneNo, String typeofacc) {

		 List<Map<String,Object>> datalist = dealerhomerepository.used_car_employee_wise_sale(phoneNo, typeofacc);
		 
			Map<String, Object> map = new HashMap<>();
			map.put("salesEmployeeList", datalist);
			return map;
	}



	@Override
	public void addcar(DealerAddVehicleRequestDTO dto) throws JPAException {
		dealerhomerepository.insert_used_car_add_vehicle(dto.getVehicle_make(), dto.getVehicle_model(),dto.getFuel_type(),dto.getVehicle_no(),dto.getManfufacturing_year(),dto.getOdometer(),dto.getVin_number(),dto.getVendor_id(),dto.getCar_type());
		return;
	}



	@Override
	public Map<String, Object> getsearchlist(String searchtext) {
		List<Map<String,Object>>searchlist=dealerhomerepository.search_vehicl(searchtext);
		Map<String,Object>map=new HashMap<>();
		map.put("SearchList", searchlist);
		return map;
	}



	@Override
	public Map<String, Object> getvehiclelist(String dealerId,String searchtext) {
	
		List<Map<String,Object>>vehiclelist=dealerhomerepository.used_car_vehicle_list(dealerId,searchtext);
		Map<String,Object>map=new HashMap<>();
		map.put("vehiclelist", vehiclelist);
		return map;
	}



	@Override
	public void addemployee(DealerAddVehicleRequestDTO dto) throws JPAException {
		dealerhomerepository.insert_used_car_add_employee_tbl(dto.getEmployee_name(), dto.getPhone_no(), dto.getEmployee_image(), dto.getVendor_id());
		return;
	}
	
	
	@Override
	public Map<String, Object> getdealersemployeelist(String employeeId) {

		List<Map<String,Object>> datalist = dealerhomerepository.dealerslist(employeeId);
		Map<String, Object> map = new HashMap<>();
		map.put("salesEmployeeList", datalist);
		return map;
		}



	@Override
	public Map<String, Object> getdealersapprovalsList(String employeeId) {

		List<Map<String,Object>> datalist = dealerhomerepository.used_car_vehilce_list_for_my_approvels_dealer(employeeId);
		Map<String, Object> map = new HashMap<>();
		map.put("getdealersapprovalsList", datalist);
		return map;
	}



	@Override
	public Map<String, Object> getdealersCheckoutPage(String saleId) {

		Map<String,Object> datalist = dealerhomerepository.used_car_check_out(saleId);
		List<Map<String,Object>> priceList = dealerhomerepository.used_car_check_out_amount(saleId);

		Map<String, Object> map = new HashMap<>();
		map.put("getdealersCheckoutPageDetails", datalist);
		map.put("pricelist", priceList);

		return map;
	}



	@Override
	public void updatedealerapprove(String vehicleId) throws JPAException {

		dealerhomerepository.updateapprovestatus(vehicleId);
		dealerhomerepository.updateapprovestatusused_car_employee_sales_tbl(vehicleId);
		return;
		
	}



	@Override
	public Map<String, Object> getdealerallsaleslist(String employeeid) {

		List<Map<String,Object>> datalist = dealerhomerepository.used_car_sold_vehilces_vendor(employeeid);
		Map<String, Object> map = new HashMap<>();
		map.put("dealersmysales", datalist);
		return map;
	}



	@Override
	public Map<String, Object> getcommisionlist(String employeeid) {

		List<Map<String,Object>> datalist = dealerhomerepository.used_car_commision_vendor_wise(employeeid);
		Map<String, Object> map = new HashMap<>();
		map.put("getcommisionlist", datalist);
		return map;
	}



	@Override
	public void paymentupdate(DealerAddVehicleRequestDTO dto) throws JPAException {
		
		dealerhomerepository.insertintopaymnets(dto.getSaleid(), dto.getActualamount(), dto.getDiscountamount(), dto.getFinalamount(), dto.getRazorpayid(), dto.getPaymentstatus(), dto.getIspaid());
		
	    dealerhomerepository.updateapprovestatuspay(dto.getVehicleid());
		dealerhomerepository.updateapprovestatusused_car_employee_sales_tblpay(dto.getVehicleid());
		dealerhomerepository.createuser(dto.getCustomername(), dto.getCustomerno(), dto.getSaleid());
		dealerhomerepository.used_car_cs_ondemand_lead_insert(dto.getSaleid());
		
	}

	@Override
	public Map<String, Object> getimagelist() {
		
	List<Map<String,Object>> datalist = dealerhomerepository.vehicle_images_list();
		Map<String, Object> map = new HashMap<>();
		map.put("getvehicleimages", datalist);
		return map;
	}
	
	@Override
	public Map<String,Object> adducicars(DealerAddVehicleRequestDTO dto) throws JPAException {
		Map<String,Object> datalist = dealerhomerepository.checkvehicleexist(dto.getVehicle_no());
		if(datalist==null||datalist.isEmpty()) {
			
			 Integer value=dealerhomerepository.insert_uci_addvehicle(Integer.valueOf(dto.getModel_id()), dto.getVehicle_make(), dto.getVehicle_model(), dto.getFuel_type(), dto.getVehicle_no(), dto.getManfufacturing_year(),dto. getOdometer(),Integer.valueOf(dto.getVendor_id()), Integer.valueOf(dto.getOwnership_id()), null, dto.getAbout_car(),Integer.valueOf(dto.getStatus_id()),dto.getInsurance_type());
		     dealerhomerepository.insert_uci_flow_addvehicle(value, Integer.valueOf(dto.getModel_id()), Integer.valueOf(dto.getVendor_id()),  dto.getFuel_type(), dto.getVehicle_no(), dto.getManfufacturing_year(), dto. getOdometer(), Integer.valueOf(dto.getOwnership_id()), dto.getInsurance_validity(), dto.getAbout_car(), Integer.valueOf(dto.getStatus_id()), dto.getInsurance_type());

			  List<Map<String,Object>> data = dto.getImagesArr();
				
					for (Map<String, Object> map : data) {
				     dealerhomerepository.insert_used_car_vehicle_images(Integer.valueOf(dto.getDealer_id()),value,Integer.valueOf(map.get("id").toString()), map.get("imageurl").toString());
				
					
				}
		}else if(datalist!=null) {
			
			if(datalist.get("dealer_id").toString().equalsIgnoreCase(dto.getVendor_id())) {
				
					//toast
			     return null;

				
			}else {
				
				dealerhomerepository.update_existing_vehicle(Integer.valueOf(dto.getModel_id()), dto.getVehicle_make(), dto.getVehicle_model(), dto.getFuel_type(), dto.getVehicle_no(), dto.getManfufacturing_year(), dto.getOdometer(), Integer.valueOf(dto.getVendor_id()), Integer.valueOf(dto.getOwnership_id()), dto.getInsurance_validity(), dto.getAbout_car(), Integer.valueOf(dto.getStatus_id()), dto.getInsurance_type(), Integer.valueOf(datalist.get("vehicle_id").toString()));
				
			}
			
			
		}

		
		Map<String, Object> map = new HashMap<>();


     return map;
	}

	@Override
	public Map<String, Object> getownershiplist() {
		List<Map<String,Object>> datalist = dealerhomerepository.ownership_list();
		Map<String, Object> map = new HashMap<>();
		map.put("getownershiplist", datalist);
		return map;
	}



	@Override
	public Map<String, Object> getvehiclstatuslist() {
		List<Map<String,Object>> datalist = dealerhomerepository.vehicle_status_list();
		Map<String, Object> map = new HashMap<>();
		map.put("getvehiclestatuslist", datalist);
		return map;
	}



	@Override
	public Map<String, Object> gethomepagecarlist(DealerAddVehicleRequestDTO dto) {
		List<Map<String,Object>> datalist = dealerhomerepository.home_page_carlist(Integer.valueOf(dto.getVendor_id()), Integer.valueOf(dto.getStatus_id()), dto.getSearchtext());
		Map<String, Object> map = new HashMap<>();
		map.put("gethomepagecarlist", datalist);
		return map;
	}



	@Override
	public Map<String, Object> getenquirylist(String dealerid, String vehicleid) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> datalist = dealerhomerepository.vehicle_enquiry_list(Integer.valueOf(dealerid), Integer.valueOf(vehicleid));
		Map<String, Object> map = new HashMap<>();
		map.put("getenquirylist", datalist);
		return map;
	}



	@Override
	public void addnewenquiry(DealerAddVehicleRequestDTO dto) throws JPAException {
		dealerhomerepository.insert_used_car_vehicle_enquiries(Integer.valueOf(Integer.valueOf(dto.getDealer_id())), Integer.valueOf(dto.getVehicleid()), dto.getCustomername(), dto.getCustomerno(), dto.getAbout_car());
		
		return;
	}



	@Override
	public void updateinspectionrequest(DealerAddVehicleRequestDTO dto) throws JPAException {
		dealerhomerepository.update_inspection_request(Integer.valueOf(dto.getStatus_id()), Integer.valueOf(dto.getDealer_id()), Integer.valueOf(dto.getVehicleid()));
		return;
		
	}



	@Override
	public Map<String, Object> getvehicleimagelist(String dealerid, String vehicleid) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> datalist = dealerhomerepository.vehicle_images_list(Integer.valueOf(dealerid), Integer.valueOf(vehicleid));
		Map<String, Object> map = new HashMap<>();
		map.put("getvehiclimagelist", datalist);
		return map;
	}



	@Override
	public Map<String, Object> getpackagelist(String dealerid, String categoryid) {
				List<Map<String,Object>> datalist = dealerhomerepository.package_list(Integer.valueOf(dealerid), Integer.valueOf(categoryid));
				Map<String, Object> map = new HashMap<>();
				map.put("getpackagelist", datalist);
				return map;
	}



	@Override
	public Map<String, Object> getaddonslist(String dealerid, String categoryid) {
				List<Map<String,Object>> datalist = dealerhomerepository.Addon_list(Integer.valueOf(dealerid),Integer.valueOf(categoryid));
				Map<String, Object> map = new HashMap<>();
				map.put("getaddonlist", datalist);
				return map;
	}



	@Override
	public void addsalesdetails(DealerAddVehicleRequestDTO dto) throws JPAException {
		Integer userid = dealerhomerepository.create_customer(Integer.valueOf(dto.getDealer_id()), Integer.valueOf(dto.getVehicleid()), dto.getCustomername(), dto.getCustomerno(), dto.getAbout_car(), Integer.valueOf(dto.getCategory_id()), Integer.valueOf(dto.getD_package_id()));
		
		dealerhomerepository.inactive_old_warranty(Integer.valueOf(dto.getVehicleid()));
		
		dealerhomerepository.inactive_old_addons(Integer.valueOf(dto.getVehicleid()));
		
		for(int i=0;i<dto.getAddonid().size();i++) {
			dealerhomerepository.add_vehicle_addons(dto.getAddonid().get(i).get("warranty"), userid, Integer.valueOf(dto.getVehicleid()),Integer.valueOf(dto.getAddonid().get(i).get("id")), Integer.valueOf(dto.getDealer_id()));

			}
		
		dealerhomerepository.inactive_old_payment(Integer.valueOf(dto.getVehicleid()));
		System.out.print(userid);
		System.out.print(dto.getVehicleid());
		System.out.print(dto.getActualamount());
		System.out.print(dto.getFinal_discount());
		System.out.print(dto.getAfter_discount());
		System.out.print(dto.getTax_amount());
		System.out.print(dto.getFinalamount());
		
		dealerhomerepository.insert_payent_option(userid, Integer.valueOf(dto.getVehicleid()),Double.valueOf(dto.getActualamount()),Double.valueOf(dto.getFinal_discount()),Double.valueOf(dto.getAfter_discount()),Double.valueOf(dto.getTax_amount()), Double.valueOf(dto.getFinalamount()), dto.getPayment_option(), dto.getFollow_up_on(),Integer.valueOf(dto.getPayment_mode_id()), dto.getStatus(), dto.getOrder_id(), dto.getPayment_link(),dto.getReference_id());
		
		
	return;
		
	}



}

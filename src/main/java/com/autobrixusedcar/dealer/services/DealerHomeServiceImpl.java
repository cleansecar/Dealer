package com.autobrixusedcar.dealer.services;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.autobrixusedcar.dealer.dtos.DealerAddVehicleRequestDTO;
import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;
import com.autobrixusedcar.dealer.dtos.soldData;
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
		List<Map<String,Object>> offers = dealerhomerepository.offer_list(Integer.valueOf(dto.getVendor_id()));

		Map<String, Object> map = new HashMap<>();
		map.put("gethomepagecarlist", datalist);
		map.put("gethomepageofferlist", offers);
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
	
		
		dealerhomerepository.insert_payent_option(userid, Integer.valueOf(dto.getVehicleid()),Double.valueOf(dto.getActualamount()),Double.valueOf(dto.getFinal_discount()),Double.valueOf(dto.getAfter_discount()),Double.valueOf(dto.getTax_amount()), Double.valueOf(dto.getFinalamount()), dto.getPayment_option(), dto.getFollow_up_on(),Integer.valueOf(dto.getPayment_mode_id()), dto.getStatus(), dto.getOrder_id(), dto.getPayment_link(),dto.getReference_id());
		
		
	return;
		
	}



	@Override
	public Map<String, Object> getcheckoutdetails(String dealerid, String vehicle_id, String coupon_id,
			String couponcode) {
		
		Map<String,Object> customerdetails = dealerhomerepository.checkout_customerdetails(Integer.valueOf(vehicle_id));
		
		Map<String,Object> packagedetails = dealerhomerepository.checkout_packdetails(Integer.valueOf(vehicle_id));

		List<Map<String,Object>> addonlist = dealerhomerepository.checkout_addon_list(Integer.valueOf(vehicle_id));
		
		Map<String,Object> couponcount = dealerhomerepository.checkout_couponcount(Integer.valueOf(dealerid));
		
		Map<String,Object> paymentobject = dealerhomerepository.checkout_payment_object(Integer.valueOf(vehicle_id), coupon_id == null || coupon_id.isEmpty() ? null : Integer.valueOf(coupon_id), couponcode);
		
		List<Map<String,Object>> pricelist = dealerhomerepository.checkout_price_list(Integer.valueOf(vehicle_id), coupon_id == null || coupon_id.isEmpty() ? null : Integer.valueOf(coupon_id), couponcode);
		
	    Map<String, Object> map = new HashMap<>();
		map.put("getcheckoutcustomerdetails", customerdetails);
		map.put("getcheckoutpackagedetails", packagedetails);
		map.put("getcheckoutaddonlist", addonlist);
		map.put("getcheckoutcouponcount", couponcount);
		map.put("getcheckoutpaymentobject", paymentobject);
		map.put("getcheckoutpricelist", pricelist);
		return map;
	}


	@Override
	public Map<String, Object> getofferlist(String dealerid) {
				List<Map<String,Object>> datalist = dealerhomerepository.offer_list(Integer.valueOf(dealerid));
				Map<String, Object> map = new HashMap<>();
				map.put("getcheckoutofferlist", datalist);
				return map;
	}

	

	@Override
	public Map<String, Object> completepayment(DealerAddVehicleRequestDTO dto) throws JPAException {
		Integer orderid = dealerhomerepository.complete_payment_status(Integer.valueOf(dto.getUser_id()),Integer.valueOf(dto.getVehicleid()),Double.valueOf(dto.getActualamount()),Double.valueOf(dto.getFinal_discount()),Double.valueOf(dto.getAfter_discount()),Double.valueOf(dto.getTax_amount()), Double.valueOf(dto.getFinalamount()), dto.getPayment_option(), dto.getFollow_up_on(),dto.getPayment_mode_id(), dto.getStatus(), dto.getOrder_id(), dto.getPayment_link(),dto.getReference_id());
		
		if(!dto.getCouponcode().equalsIgnoreCase("")) {
			dealerhomerepository.complete_payment_couponupdate(Integer.valueOf(dto.getVehicleid()), Integer.valueOf(dto.getCouponid()), dto.getCouponcode());

			
		}
		
		dealerhomerepository.update_inspection_request(6, Integer.valueOf(dto.getDealer_id()),Integer.valueOf(dto.getVehicleid()));


		   Map<String, Object> map = new HashMap<>();
		   map.put("orderid", orderid.toString());

		return map;
	}



	@Override
	public Map<String, Object> getprofiledata(String dealerid) {
Map<String,Object> profiledata = dealerhomerepository.profile_details(Integer.valueOf(dealerid));
		
		
	    Map<String, Object> map = new HashMap<>();
		
		map.put("getprofiledata", profiledata);
		return map;
	}



	@Override
	public Map<String, Object> gethelpsupportdata() {
Map<String,Object> supportdata = dealerhomerepository.help_support_details();
		
		
	    Map<String, Object> map = new HashMap<>();
		
		map.put("getsupportdata", supportdata);
		return map;
	}



	@Override
	public Map<String, Object> getsoldvehicllist(String dealerid, String month, String year) {
		
		
		List<soldData> vehiclelistdata = dealerhomerepository.sold_vehicle_list(Integer.valueOf(dealerid), month, year);
		ArrayList<Map<String, Object>> vehiclelist = new ArrayList<Map<String, Object>>();
		
		vehiclelistdata.forEach(Obj -> {
			Map<String, Object> mapObjVertical = new HashMap<String, Object>();
			
			mapObjVertical.put("vehicle_id", Obj.getvehicle_id());
			mapObjVertical.put("vehicle_no", Obj.getvehicle_no());
			mapObjVertical.put("manufacturing_year", Obj.getmanufacturing_year());
			mapObjVertical.put("fuel_type", Obj.getfuel_type());
			mapObjVertical.put("brand_icon", Obj.getbrand_icon());
			mapObjVertical.put("vehicle_brand", Obj.getvehicle_brand());
			mapObjVertical.put("vehicle_model", Obj.getvehicle_model());
			mapObjVertical.put("ownership", Obj.getownership());
			mapObjVertical.put("user_id", Obj.getuser_id());
			mapObjVertical.put("customer_name", Obj.getcustomer_name());
			mapObjVertical.put("phone_no", Obj.getphone_no());
			mapObjVertical.put("payment_status", Obj.getpayment_status());
			mapObjVertical.put("payment_amount", Obj.getpayment_amount());
			
			List<soldData> packagedata = dealerhomerepository.sold_vehicle_packaddonlist(Obj.getvehicle_id());
			ArrayList<Map<String, Object>> packageslist = new ArrayList<Map<String, Object>>();
			
			packagedata.forEach(Obj1 -> {
				Map<String, Object> mapObjVertical1 = new HashMap<String, Object>();
				
				mapObjVertical1.put("id", Obj1.getid());

				mapObjVertical1.put("name", Obj1.getname());
				mapObjVertical1.put("item_type", Obj1.getitem_type());
				mapObjVertical1.put("is_expired", Obj1.getis_expired());
				
				
				List<soldData> subpackagesdata = dealerhomerepository.sold_vehicle_includes(Obj.getvehicle_id(), Obj1.getid(), Obj1.getitem_type());
				ArrayList<Map<String, Object>> subpackagelist = new ArrayList<Map<String, Object>>();
				
				subpackagesdata.forEach(Obj2 -> {
					Map<String, Object> mapObjVertical2 = new HashMap<String, Object>();
										
					mapObjVertical2.put("id", Obj2.getid());
					mapObjVertical2.put("name", Obj2.getname());
					mapObjVertical2.put("quantity", Obj2.getquantity());
					mapObjVertical2.put("no_of_times_used", Obj2.getno_of_times_used());
					mapObjVertical2.put("is_expired", Obj2.getis_expired());
					
					subpackagelist.add(mapObjVertical2);
					
				});
				
				mapObjVertical1.put("subpackagedata", subpackagelist);

				packageslist.add(mapObjVertical1);
			});
			
			mapObjVertical.put("packagesArr",packageslist);


			vehiclelist.add(mapObjVertical);
		});
		
		
	
		 Map<String, Object> map = new HashMap<>();
			
			map.put("soldcarsList", vehiclelist);
			return map;
			
	}


}

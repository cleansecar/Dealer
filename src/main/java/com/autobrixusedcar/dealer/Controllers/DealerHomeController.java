package com.autobrixusedcar.dealer.Controllers;

import java.util.HashMap;
import java.util.Map;

//import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.autobrixusedcar.dealer.dtos.DealerAddVehicleRequestDTO;
import com.autobrixusedcar.dealer.dtos.DealerHomeRequestDTO;
import com.autobrixusedcar.dealer.dtos.DealerShareRequestDTO;
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
	        map.put("message", "Created successfully.");
			System.out.print("yes");

		return com.autobrixusedcar.dealer.utils.Response.success(map);
		}
	
	@PostMapping("/getdealerHomepagedetails")
	public ResponseEntity<Object> getdealerHomepagedetails(@RequestBody DealerHomeRequestDTO dto) {
		
		System.out.print("yes");
		Map<String, Object> details = dealerhomeservice.getdealerHomepagedetails(dto);	
		
		return com.autobrixusedcar.dealer.utils.Response.success(details);

		
	}
	
	
	
	
	@GetMapping("/getsaleemployeelist")
	public ResponseEntity<Object> getsalesemployeelist(@RequestParam("phoneNo") String phoneNo, @RequestParam("typeofAcc") String typeofAcc){		
		Map<String,Object> details = dealerhomeservice.getsaleemployeelist(phoneNo, typeofAcc);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	  }
	
	@PostMapping("/addnewcar")
	public ResponseEntity<Object>addcar(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.addcar(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Added successfully.");
			System.out.print("yes");
		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	@GetMapping("/searchcar")
	public ResponseEntity<Object>setsearchvehicle(@RequestParam ("searchtext")String searchtext){
		Map<String,Object> details = dealerhomeservice.getsearchlist(searchtext);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	}
		@GetMapping("/getvehiclelist")
	public ResponseEntity<Object>getvehiclelist(@RequestParam("dealerId")String dealerId,@RequestParam("searchtext")String searchtext){
		
		Map<String, Object>details=dealerhomeservice.getvehiclelist(dealerId, searchtext);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	}
	
	
	@PostMapping("/addnewemployee")
	public ResponseEntity<Object>addemployee(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.addemployee(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Added successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	
	
	@GetMapping("/getdealersemployeelist")
	public ResponseEntity<Object> getdealersemployeelist(@RequestParam("employeeId") String employeeId){		
		Map<String,Object> details = dealerhomeservice.getdealersemployeelist(employeeId);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	
	
	@GetMapping("/getdealersapprovalsList")
	public ResponseEntity<Object> getdealersapprovalsList(@RequestParam("employeeId") String employeeId){		
		Map<String,Object> details = dealerhomeservice.getdealersapprovalsList(employeeId);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	
	
	@GetMapping("/getdealersCheckoutPage")
	public ResponseEntity<Object> getdealersCheckoutPage(@RequestParam("saleId") String saleId){		
		Map<String,Object> details = dealerhomeservice.getdealersCheckoutPage(saleId);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	@GetMapping("/updatedealerapprove")
	public ResponseEntity<Object> updatedealerapprove(@RequestParam("vehicleId") String vehicleId) throws JPAException{		
		 dealerhomeservice.updatedealerapprove(vehicleId);
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Updated successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		}
	
	@GetMapping("/getdealerallsaleslist")
	public ResponseEntity<Object> getdealerallsaleslist(@RequestParam("employeeid") String employeeid) {		
		Map<String,Object> details = dealerhomeservice.getdealerallsaleslist(employeeid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }	
	
	
	
	@GetMapping("/getcommisionlist")
	public ResponseEntity<Object> getcommisionlist(@RequestParam("employeeid") String employeeid) {		
		Map<String,Object> details = dealerhomeservice.getcommisionlist(employeeid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }	
	
	
	
	@GetMapping("/getimagelist")
	public ResponseEntity<Object> getimagelist() {		
		Map<String,Object> details = dealerhomeservice.getimagelist();
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }	
	
	
	@PostMapping("/paymentupdate")
	public ResponseEntity<Object>paymentupdate(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.paymentupdate(dto);	
		
		Map<String, String> map = new HashMap<>();
	        map.put("message", "Added successfully.");
			System.out.print("yes");
		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	@PostMapping("/adducinewcar")
	public ResponseEntity<Object>adducicar(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		Map<String,Object> details = dealerhomeservice.adducicars(dto);
		if(details==null) {
			 Map<String, String> map = new HashMap<>();
		        map.put("message", "Vehicle No Already Exists");
				System.out.print("yes");
			
			return com.autobrixusedcar.dealer.utils.Response.failure("300", map);
			
		}else {
			
			 Map<String, String> map = new HashMap<>();
		        map.put("message", "Added successfully.");
				System.out.print("yes");
			
			return com.autobrixusedcar.dealer.utils.Response.success(map);
		}
	
		
	}
	
	@GetMapping("/getownershiplist")
	public ResponseEntity<Object> getownershiplist() {		
		Map<String,Object> details = dealerhomeservice.getownershiplist();
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }	
	
	@GetMapping("/getvehicleststuslist")
	public ResponseEntity<Object> getvehiclestatuslist() {		
		Map<String,Object> details = dealerhomeservice.getvehiclstatuslist();
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }	
	
	
	@PostMapping("/gethomepagecarlist")
	public ResponseEntity<Object> gethomepagecarlist(@RequestBody DealerAddVehicleRequestDTO dto) {
		
		Map<String,Object> details = dealerhomeservice.gethomepagecarlist(dto);
		return com.autobrixusedcar.dealer.utils.Response.success(details);

		
	}
	
	@GetMapping("/getenquirieslist")
	public ResponseEntity<Object> getenquirieslist(@RequestParam("dealerid") String dealerid , @RequestParam("vehicleid") String vehicleid) {		
		Map<String,Object> details = dealerhomeservice.getenquirylist(dealerid,vehicleid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }	
	
	
	@PostMapping("/addnewenquiry")
	public ResponseEntity<Object>addnewenquiry(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.addnewenquiry(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Added successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	@PostMapping("/updateinspectionrequest")
	public ResponseEntity<Object>updateinspection(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.updateinspectionrequest(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Added successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	@GetMapping("/getvehicleimagelist")
	public ResponseEntity<Object> getvehicleimagelist(@RequestParam("dealerid") String dealerid , @RequestParam("vehicleid") String vehicleid) {		
		Map<String,Object> details = dealerhomeservice.getvehicleimagelist(dealerid,vehicleid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	@GetMapping("/getpackagelist")
	public ResponseEntity<Object> getpacakgelist(@RequestParam("dealerid") String dealerid , @RequestParam("categoryid") String categoryid) {		
		Map<String,Object> details = dealerhomeservice.getpackagelist(dealerid, categoryid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	@GetMapping("/getaddonlist")
	public ResponseEntity<Object> getvehicleaddonlist(@RequestParam("dealerid") String dealerid,@RequestParam("categoryid") String categoryid) {		
		Map<String,Object> details = dealerhomeservice.getaddonslist(dealerid,categoryid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	@PostMapping("/updatesalesdetails")
	public ResponseEntity<Object>updatesalesdetails(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.addsalesdetails(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Updated successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	
	
	@GetMapping("/getcheckoutdetails")
	public ResponseEntity<Object> getcheckoutdetails(@RequestParam("dealerid") String dealerid,@RequestParam("vehicle_id") String vehicle_id,@RequestParam("coupon_id") String coupon_id,@RequestParam("couponcode") String couponcode) {		
		Map<String,Object> details = dealerhomeservice.getcheckoutdetails(dealerid, vehicle_id, coupon_id, couponcode);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	@PostMapping("/completepayment")
	public ResponseEntity<Object>completepayment(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
	
		Map<String,Object> details = dealerhomeservice.completepayment(dto);

		return com.autobrixusedcar.dealer.utils.Response.success(details);

		
	}
	
	@GetMapping("/getofferlist")
	public ResponseEntity<Object> getvofferlist(@RequestParam("dealerid") String dealerid) {		
		Map<String,Object> details = dealerhomeservice.getofferlist(dealerid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	@GetMapping("/getprofiledata")
	public ResponseEntity<Object> getprofiledata(@RequestParam("dealerid") String dealerid) {		
		Map<String,Object> details = dealerhomeservice.getprofiledata(dealerid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	@GetMapping("/gethelpsupportdata")
	public ResponseEntity<Object> gethelpsupportdata() {		
		Map<String,Object> details = dealerhomeservice.gethelpsupportdata();
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	@GetMapping("/getsoldvehiclelist")
	public ResponseEntity<Object> getsoldvehiclelist(@RequestParam("dealerid") String dealerid,@RequestParam("month") String month,@RequestParam("year") String year,@RequestParam("search") String search) {		
		Map<String,Object> details = dealerhomeservice.getsoldvehicllist(dealerid, month, year,search);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	 }
	
	
	@GetMapping("/getsharecategorylist")
	public ResponseEntity<Object> getsharecategorylist(@RequestParam("vehicle_id") String vehicle_id,@RequestParam("dealer_id") String dealer_id) {		
		Map<String,Object> details = dealerhomeservice.getsharecategorylist(vehicle_id,dealer_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	
	}
	
	
	@GetMapping("/getsharesubcategorylist")
	public ResponseEntity<Object> getsharesubcategorylist(@RequestParam("vehicle_id") String vehicle_id,@RequestParam("category_id") String category_id,@RequestParam("dealer_id") String dealer_id) {		
		Map<String,Object> details = dealerhomeservice.getsharesubcategorylist(vehicle_id, category_id,dealer_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	
	}
	
	@GetMapping("/getsupportlist")
	public ResponseEntity<Object> getsupportlist(@RequestParam("dealerid") String dealerid) {		
		Map<String,Object> details = dealerhomeservice.getsupportlist(dealerid);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
		
	
	}
	
	
	@PostMapping("/updatesharedetails")
	public ResponseEntity<Object>updatesharedetails(@RequestBody DealerShareRequestDTO dto) throws JPAException{
		dealerhomeservice.updatesharedetails(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Updated successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	@PostMapping("/generatelink")
	public ResponseEntity<Object> generatelink(@RequestBody DealerShareRequestDTO dto) throws JPAException {		
		Map<String,Object> details = dealerhomeservice.generatelink(dto);
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}
	
	
	@GetMapping("/getinspectionreportdata")
	public ResponseEntity<Object> getinspectionreportdata(@RequestParam("vehicle_id") String vehicle_id) {		
		Map<String,Object> details = dealerhomeservice.getinspectionreportdata(vehicle_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	
	}
	
	@GetMapping("/gettestdriverequestlist")
	public ResponseEntity<Object> gettestdriverequestlist(@RequestParam("vehicle_id") String vehicle_id,@RequestParam("lead_id") String lead_id) {		
		Map<String,Object> details = dealerhomeservice.gettestdrivereqlist(vehicle_id,lead_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	
	}
	
	@GetMapping("/vehiclelinklist")
	public ResponseEntity<Object> vehiclelinklist(@RequestParam("vehicle_id") String vehicle_id) {		
		Map<String,Object> details = dealerhomeservice.getvehiclelinklist(vehicle_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	
	}
	
	@PostMapping("/addnewtestdriverequest")
	public ResponseEntity<Object>addnewtestdriverequest(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.addnewtestdriverequest(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Added successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	@GetMapping("/getvehicleinspectionflow")
	public ResponseEntity<Object> getvehicleinspectionflow(@RequestParam("vehicle_id") String vehicle_id) {		
		Map<String,Object> details = dealerhomeservice.getVehicleInspectionFlow(vehicle_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	 }
	
	@GetMapping("/getreasonlist")
	public ResponseEntity<Object> getleadstatusreasonlist(@RequestParam("status_id") String status_id,@RequestParam("sub_status_id") String sub_status_id) {		
		Map<String,Object> details = dealerhomeservice.lead_status_reason_list(status_id,sub_status_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	
	}
	
	@PostMapping("/updateenquirystatus")
	public ResponseEntity<Object>updateenquirystatus(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.updateenquirystatus(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Updated successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	@GetMapping("/getleadhistorylist")
	public ResponseEntity<Object> getleadhistorylist(@RequestParam("lead_id") String lead_id) {		
		Map<String,Object> details = dealerhomeservice.getleadhistorylist(lead_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	
	}
	
	
    @PostMapping("/updateCancelenquirystatus")
	public ResponseEntity<Object>updateCancelenquirystatus(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
		dealerhomeservice.cancelstatusupdate(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Updated successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
    
    
    @PostMapping("/addgeneralenquiry")
  	public ResponseEntity<Object>addgenaralenquiry(@RequestBody DealerAddVehicleRequestDTO dto) throws JPAException{
  		dealerhomeservice.cancelstatusupdate(dto);	
  		 Map<String, String> map = new HashMap<>();
  	        map.put("message", "Updated successfully.");		
  		return com.autobrixusedcar.dealer.utils.Response.success(map);
  		
  	}
    
	@PostMapping("/getfilterlist")
	public ResponseEntity<Object> getfilterlist(@RequestBody DealerAddVehicleRequestDTO dto) {
	 Map<String,Object> details = dealerhomeservice.getenquiryfilterlist(dto);
		return com.autobrixusedcar.dealer.utils.Response.success(details);

		
	}
	
	@GetMapping("/getfilteredvehiclelist")
	public ResponseEntity<Object> getfilteredvehiclelist(@RequestParam("dealer_id") String dealer_id,@RequestParam("category_ids") String category_ids,@RequestParam("brand_ids") String brand_ids,@RequestParam("ownership_ids") String ownership_ids,@RequestParam("colors") String colors,@RequestParam("min_price") String min_price,@RequestParam("max_price") String max_price,@RequestParam("min_odometer") String min_odometer,@RequestParam("max_odometer") String max_odometer) {		
		Map<String,Object> details = dealerhomeservice.getfilteredvehiclelist(dealer_id, category_ids, brand_ids, ownership_ids, colors, min_price, max_price, min_odometer, max_odometer);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
	
	}
	
	
	
	
	@GetMapping("/getimagesinsharepage")
	public ResponseEntity<Object> getimagesinsharepage(@RequestParam("dealer_id") String dealer_id,@RequestParam("vehicle_id")String vehicle_id) {		
		Map<String,Object> details = dealerhomeservice.getimagesinsharepage(dealer_id,vehicle_id);
		return com.autobrixusedcar.dealer.utils.Response.success(details);
		
	
	}
	
	
	
	
	
	
	@PostMapping("/updatesharePageImagesdetails")
	public ResponseEntity<Object>updatesharePageImagesdetails(@RequestBody DealerShareRequestDTO dto) throws JPAException{
		dealerhomeservice.updatesharePageImagesdetails(dto);	
		 Map<String, String> map = new HashMap<>();
	        map.put("message", "Updated successfully.");		
		return com.autobrixusedcar.dealer.utils.Response.success(map);
		
	}
	
	
	@PostMapping("/generatelinkNew")
	public ResponseEntity<Object> generatelinkNew(@RequestBody DealerShareRequestDTO dto) throws JPAException {		
		Map<String,Object> details = dealerhomeservice.generatelinkNew(dto);
		return com.autobrixusedcar.dealer.utils.Response.success(details);

	}
	
	
}



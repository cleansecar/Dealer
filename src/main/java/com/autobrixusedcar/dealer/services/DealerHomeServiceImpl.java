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
		dealerhomerepository.insert_used_car_add_vehicle(dto.getVehicle_make(), dto.getVehicle_model(),dto.getFuel_type(),dto.getVehicle_no(),dto.getManfufacturing_year(),dto.getOdometer(),dto.getVin_number(),dto.getVendor_id());
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
 
	

}

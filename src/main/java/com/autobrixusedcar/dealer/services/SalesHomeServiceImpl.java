package com.autobrixusedcar.dealer.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobrixusedcar.dealer.dtos.SalesHomeRequestDTO;
import com.autobrixusedcar.dealer.repositories.SalesHomeRepository;
import com.autobrixusedcar.dealer.utils.Util;

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
		
		saleshomerepository.updateintoused_car_add_vehicle(dto.getCustomerName(), dto.getCustomermobileno(), dto.getPackageId(), dto.getVehicleId(), dto.getServicepackageId(),dto.getEmployeeId());
		
		saleshomerepository.insertintoused_car_customer_vehicle_follow_up(dto.getCustomerName(), dto.getCustomermobileno(), dto.getFollowupdate(), dto.getFollowuptime(), dto.getVehicleId(), dto.getEmployeeId(), dto.getDealerId(), dto.getServicepackageId(), dto.getPackageId(), dto.getComment());
				
		return;
		
	}

	@Override
	public Map<String, Object> getpackageslistdropdown(String cartpe) {
		List<Map<String,Object>>vehiclelist=saleshomerepository.used_car_packages_list(cartpe);
		Map<String,Object>map=new HashMap<>();
		map.put("packageslistdropdown", vehiclelist);
		return map;
	}

	@Override
	public Map<String, Object> getpackagesstartdates() {
       Date startDate = new Date();
       String startDateStr = Util.formatDateToString(startDate, "yyyy-MM-dd");

		
		List<Map<String,Object>>vehiclelist=saleshomerepository.used_car_dates_30_days(startDateStr);
		Map<String,Object>map=new HashMap<>();
		map.put("packagesstartdates", vehiclelist);
		return map;
	}

	 public static Date addDays(Date d, int days)
	    {
	        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
	        return d;
	    }
	 
	 
	
	@Override
	public void insertsoldDetails(SalesHomeRequestDTO dto) throws JPAException {
		// TODO Auto-generated method stub
				
		
		String dateString = dto.getServicedate();
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    Date convertedDate = new Date();
	    try {
	        convertedDate = dateFormat.parse(dateString);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    System.out.println(convertedDate);
		
	    
	    
        Date endDate = addDays(convertedDate, 365);


//         Calendar calendar = Calendar.getInstance();
//
//         calendar.add(Calendar.DAY_OF_MONTH, +365);
//         
//         Date  endDate = calendar.getTime();

         String endDateStr = Util.formatDateToString(endDate, "yyyy-MM-dd");

		
		
		saleshomerepository.soldupdateintoused_car_add_vehicle(dto.getCustomerName(), dto.getCustomermobileno(), dto.getPackageId(), dto.getVehicleId(), dto.getServicepackageId(),dto.getServicedate(),dto.getEmployeeId());
		
		saleshomerepository.soldInsertused_car_employee_sales_tbl(dto.getVehicleId(), dto.getEmployeeId(), dto.getPackageId(), dto.getActual_package_amount(), dto.getDiscount_amount(), dto.getFinal_price(), dto.getDealerId(), dto.getServicedate(), endDateStr);
				
		return;
		
	}

}

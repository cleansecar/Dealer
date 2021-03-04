package com.autobrixusedcar.dealer.services;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
				dto.getLandmark(), dto.getCreatedby(), dto.getCity(), dto.getLatitude(), dto.getLongitude(), dto.getAdharimage(), dto.getAdharno(), dto.getPancardimage(), dto.getPancardno(), 
				dto.getLicenceimage(), dto.getLicenceno(), dto.getSuvcommistion(), dto.getHatchbackcommistion(), dto.getSedancommistion(), dto.getAccountholdername(), dto.getBankname(),
				dto.getAccountno(), dto.getIfsccode(), dto.getAcc_is_verified(), dto.getDealer_code(), dto.getPincode(), dto.getState());		
	return;
	}



	@Override
	public Map<String, Object> getdealerHomepagedetails(DealerHomeRequestDTO dto) {
		// TODO Auto-generated method stub
		
		 Date startDate;
	        Date endDate;
	        
	        startDate = dto.getFromDate();
            endDate = dto.getToDate();
        
		
        
        
        String startDateStr = Util.formatDateToString(startDate, "yyyy-MM-dd");
        String endDateStr = Util.formatDateToString(endDate, "yyyy-MM-dd");
        
		
		Map<String,Object> data = dealerhomerepository.used_car_home_page_sales_amount(dto.getMobileno(), dto.getTypeofacc(), startDateStr, endDateStr, dto.getDuration());
		
		
		Map<String,Object> details = dealerhomerepository.used_car_home_page_vendor_details(dto.getMobileno(), dto.getTypeofacc());

		Map<String, Object> map = new HashMap<>();
		map.put("details", details);
		map.put("data", data);
		return map;
	}
	
	

}

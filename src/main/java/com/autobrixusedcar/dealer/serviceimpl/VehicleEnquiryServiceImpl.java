package com.autobrixusedcar.dealer.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobrixusedcar.dealer.repositories.DealerHomeRepository;
import com.autobrixusedcar.dealer.repositories.VehicleEnquiryRepository;
import com.autobrixusedcar.dealer.services.VehicleEnquiryService;

@Service
public class VehicleEnquiryServiceImpl implements VehicleEnquiryService{
	@Autowired
	private VehicleEnquiryRepository vehicleenquiryrepository;

	@Override
	public Map<String, Object> getvehicleenquirytypelist(String dealer_id, String month, String year, String from_date,
			String to_date) {
		
		List<Map<String,Object>> datalist = vehicleenquiryrepository.vehicleenquirytypelist(Integer.valueOf(dealer_id),
				month == null || month.isEmpty() ? null :  Integer.valueOf(month), 
				year == null || year.isEmpty() ? null :  Integer.valueOf(year), 
				from_date == null || from_date.isEmpty() ? null : from_date, 
				to_date == null || to_date.isEmpty() ? null : to_date);
	    Map<String, Object> map = new HashMap<>();
	    map.put("enquirymastervehicletype", datalist);
	    return map;
	}

	@Override
	public Map<String, Object> getvehicleenquirybrandlist(String dealer_id, String month, String year, String from_date,
			String to_date, String vehicle_category_id) {
		List<Map<String,Object>> datalist = vehicleenquiryrepository.vehicleenquirybrandlist(Integer.valueOf(dealer_id),
				month == null || month.isEmpty() ? null :  Integer.valueOf(month), 
				year == null || year.isEmpty() ? null :  Integer.valueOf(year), 
				from_date == null || from_date.isEmpty() ? null : from_date, 
				to_date == null || to_date.isEmpty() ? null : to_date,
			 vehicle_category_id == null || vehicle_category_id.isEmpty() ? null :  Integer.valueOf(vehicle_category_id)
						);
	    Map<String, Object> map = new HashMap<>();
	    map.put("enquirymastervehiclebrand", datalist);
	    return map;
	}

	@Override
	public Map<String, Object> getvehicleenquirystatuslist(String dealer_id, String month, String year,
			String from_date, String to_date, String vehicle_category_id, String brand_id, String model_id,
			String manufacturing_year, String fuel_type) {
		    List<Map<String,Object>> datalist = vehicleenquiryrepository.vehicleenquirystatuslist(Integer.valueOf(dealer_id),
				month == null || month.isEmpty() ? null :  Integer.valueOf(month), 
				year == null || year.isEmpty() ? null :  Integer.valueOf(year), 
				from_date == null || from_date.isEmpty() ? null : from_date, 
				to_date == null || to_date.isEmpty() ? null : to_date,
			    vehicle_category_id == null || vehicle_category_id.isEmpty() ? null :  Integer.valueOf(vehicle_category_id),
				brand_id == null || brand_id.isEmpty() ? null :  Integer.valueOf(brand_id), 
				model_id == null || model_id.isEmpty() ? null :  model_id,
				manufacturing_year == null || manufacturing_year.isEmpty() ? null :  manufacturing_year,
				fuel_type == null || fuel_type.isEmpty() ? null :  fuel_type);
	    Map<String, Object> map = new HashMap<>();
	    map.put("enquirymastervehiclestatus", datalist);
	    return map;
	}

	@Override
	public Map<String, Object> getenquirymasterlist(String dealer_id, String month, String year, String from_date,
			String to_date, String vehicle_category_id, String brand_id, String model_id, String manufacturing_year,
			String fuel_type, String status_ids, String sub_status_ids,String page_no,String search) {
		   List<Map<String,Object>> datalist = vehicleenquiryrepository.enquirymasterlist(Integer.valueOf(dealer_id),
					month == null || month.isEmpty() ? null :  Integer.valueOf(month), 
					year == null || year.isEmpty() ? null :  Integer.valueOf(year), 
					from_date == null || from_date.isEmpty() ? null : from_date, 
					to_date == null || to_date.isEmpty() ? null : to_date,
				    vehicle_category_id == null || vehicle_category_id.isEmpty() ? null :  Integer.valueOf(vehicle_category_id),
					brand_id == null || brand_id.isEmpty() ? null :  Integer.valueOf(brand_id), 
					model_id == null || model_id.isEmpty() ? null :  model_id,
					manufacturing_year == null || manufacturing_year.isEmpty() ? null :  manufacturing_year,
					fuel_type == null || fuel_type.isEmpty() ? null :  fuel_type,
							status_ids == null || status_ids.isEmpty() ? null :  status_ids,
									sub_status_ids == null || sub_status_ids.isEmpty() ? null :  sub_status_ids,
											page_no == null || page_no.isEmpty() ? null :  Integer.valueOf(page_no),search);
		    Map<String, Object> map = new HashMap<>();
		    map.put("enquirymasterlist", datalist);
		    return map;
	}

	@Override
	public Map<String, Object> getallcarvehtypelist(String dealer_id, String month, String year, String from_date,
			String to_date) {
		List<Map<String,Object>> datalist = vehicleenquiryrepository.allcarvehypelist(Integer.valueOf(dealer_id),
				month == null || month.isEmpty() ? null :  Integer.valueOf(month), 
				year == null || year.isEmpty() ? null :  Integer.valueOf(year), 
				from_date == null || from_date.isEmpty() ? null : from_date, 
				to_date == null || to_date.isEmpty() ? null : to_date);
	    Map<String, Object> map = new HashMap<>();
	    map.put("allcarvehicletype", datalist);
	    return map;
	}

	@Override
	public Map<String, Object> getallcarvehbrandlist(String dealer_id, String month, String year, String from_date,
			String to_date, String vehicle_category_id) {
		List<Map<String,Object>> datalist = vehicleenquiryrepository.allcarvehbrandlist(Integer.valueOf(dealer_id),
				month == null || month.isEmpty() ? null :  Integer.valueOf(month), 
				year == null || year.isEmpty() ? null :  Integer.valueOf(year), 
				from_date == null || from_date.isEmpty() ? null : from_date, 
				to_date == null || to_date.isEmpty() ? null : to_date,
			 vehicle_category_id == null || vehicle_category_id.isEmpty() ? null :  Integer.valueOf(vehicle_category_id)
						);
	    Map<String, Object> map = new HashMap<>();
	    map.put("allcarvehiclebrand", datalist);
	    return map;
	}

	@Override
	public Map<String, Object> getallcarvehstatuslist(String dealer_id, String month, String year, String from_date,
			String to_date, String vehicle_category_id, String brand_id, String model_id, String manufacturing_year,
			String fuel_type) {
		  List<Map<String,Object>> datalist = vehicleenquiryrepository.allcarvehstatuslist(Integer.valueOf(dealer_id),
					month == null || month.isEmpty() ? null :  Integer.valueOf(month), 
					year == null || year.isEmpty() ? null :  Integer.valueOf(year), 
					from_date == null || from_date.isEmpty() ? null : from_date, 
					to_date == null || to_date.isEmpty() ? null : to_date,
				    vehicle_category_id == null || vehicle_category_id.isEmpty() ? null :  Integer.valueOf(vehicle_category_id),
					brand_id == null || brand_id.isEmpty() ? null :  brand_id, 
					model_id == null || model_id.isEmpty() ? null :  model_id,
					manufacturing_year == null || manufacturing_year.isEmpty() ? null :  manufacturing_year,
					fuel_type == null || fuel_type.isEmpty() ? null :  fuel_type);
		    Map<String, Object> map = new HashMap<>();
		    map.put("allcarvehiclestatus", datalist);
		    return map;
	}

}

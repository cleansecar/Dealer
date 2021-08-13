package com.autobrixusedcar.dealer.services;

import java.util.Map;
public interface VehicleEnquiryService {
	Map<String,Object> getvehicleenquirytypelist(String dealer_id,String month,String year,String from_date,String to_date);
	
	Map<String,Object> getvehicleenquirybrandlist(String dealer_id,String month,String year,String from_date,String to_date,String vehicle_category_id);
	
	Map<String,Object> getvehicleenquirystatuslist(String dealer_id,String month,String year,String from_date,String to_date,String vehicle_category_id,String brand_id,String model_id,String manufacturing_year,String fuel_type);

	Map<String,Object> getenquirymasterlist(String dealer_id,String month,String year,String from_date,String to_date,String vehicle_category_id,String brand_id,String model_id,String manufacturing_year,String fuel_type,String status_ids,String sub_status_ids,String page_no,String search);

	
    Map<String,Object> getallcarvehtypelist(String dealer_id,String month,String year,String from_date,String to_date);
	
	Map<String,Object> getallcarvehbrandlist(String dealer_id,String month,String year,String from_date,String to_date,String vehicle_category_id);
	
	Map<String,Object> getallcarvehstatuslist(String dealer_id,String month,String year,String from_date,String to_date,String vehicle_category_id,String brand_id,String model_id,String manufacturing_year,String fuel_type);

}

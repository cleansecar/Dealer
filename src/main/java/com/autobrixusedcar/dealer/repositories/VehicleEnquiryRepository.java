package com.autobrixusedcar.dealer.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autobrixusedcar.dealer.entities.BaseEntity;

public interface VehicleEnquiryRepository extends JpaRepository<BaseEntity, Long>{
	
	 @Query(value = "call uci_main_filter_vehicle_category_list(:dealer_id,:month,:year,:from_date,:to_date);", nativeQuery = true)
     List<Map<String,Object>> vehicleenquirytypelist(Integer dealer_id,Integer month,Integer year,String from_date,String to_date);
	 
	 @Query(value = "call uci_main_filter_brand_list(:dealer_id,:month,:year,:from_date,:to_date,:vehicle_category_id);", nativeQuery = true)
     List<Map<String,Object>> vehicleenquirybrandlist(Integer dealer_id,Integer month,Integer year,String from_date,String to_date,Integer vehicle_category_id);
	 
	 @Query(value = "call uci_main_filter_lead_status_counts(:dealer_id,:month,:year,:from_date,:to_date,:vehicle_category_id,:brand_id,:model_id,:manufacturing_year,:fuel_type);", nativeQuery = true)
     List<Map<String,Object>> vehicleenquirystatuslist(Integer dealer_id,Integer month,Integer year,String from_date,String to_date,Integer vehicle_category_id,Integer brand_id,String model_id,String manufacturing_year,String fuel_type);
	 
	 @Query(value = "call uci_enquiry_master_list(:dealer_id,:month,:year,:from_date,:to_date,:vehicle_category_id,:brand_id,:model_id,:manufacturing_year,:fuel_type,:status_ids,:sub_status_ids,:page_no,:search);", nativeQuery = true)
     List<Map<String,Object>> enquirymasterlist(Integer dealer_id,Integer month,Integer year,String from_date,String to_date,Integer vehicle_category_id,Integer brand_id,String model_id,String manufacturing_year,String fuel_type,String status_ids,String sub_status_ids,Integer page_no,String search);
	 
	 
	 @Query(value = "call uci_main_filter_vehicle_category_list(:dealer_id,:month,:year,:from_date,:to_date);", nativeQuery = true)
     List<Map<String,Object>> allcarvehypelist(Integer dealer_id,Integer month,Integer year,String from_date,String to_date);
	 
	 @Query(value = "call uci_main_vehicle_filter_brand_list(:dealer_id,:month,:year,:from_date,:to_date,:vehicle_category_id);", nativeQuery = true)
     List<Map<String,Object>> allcarvehbrandlist(Integer dealer_id,Integer month,Integer year,String from_date,String to_date,Integer vehicle_category_id);
	 
	 @Query(value = "call uci_main_vehicle_filter_lead_status_counts(:dealer_id,:month,:year,:from_date,:to_date,:vehicle_category_id,:brand_id,:model_id,:manufacturing_year,:fuel_type);", nativeQuery = true)
     List<Map<String,Object>> allcarvehstatuslist(Integer dealer_id,Integer month,Integer year,String from_date,String to_date,Integer vehicle_category_id,String brand_id,String model_id,String manufacturing_year,String fuel_type);

}  

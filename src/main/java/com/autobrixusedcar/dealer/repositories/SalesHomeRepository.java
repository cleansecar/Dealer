package com.autobrixusedcar.dealer.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.autobrixusedcar.dealer.entities.BaseEntity;

public interface SalesHomeRepository  extends JpaRepository<BaseEntity, Long> {
	
	 @Query(value="call  used_car_vehilce_list_for_dealer_sales(:dealerId)",nativeQuery = true)
	 List<Map<String, Object>> used_car_sales_vehicle_list(@Param("dealerId")String dealerId);
	 

}

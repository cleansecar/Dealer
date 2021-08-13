package com.autobrixusedcar.dealer.services;

import com.autobrixusedcar.dealer.dtos.DealerAddVehicleRequestDTO;
import com.autobrixusedcar.dealer.dtos.DeliverCarRequestDTO;

import java.util.Map;

public interface DeliverCarService {
    Map<String, Object> getleadAddress(String lead_id);
    void updateleadaddress(DeliverCarRequestDTO dto) throws JPAException;
    Map<String, Object> getpostvehdeliverycommitmentlist();
    void updatepostvehdeliverydetails(DeliverCarRequestDTO dto) throws JPAException;
    Map<String, Object> getvehicleexchangedata(String vehicle_id,String mobile_no);
    void updatevehicleexchangedata(DeliverCarRequestDTO dto) throws JPAException;

    Map<String, Object> getpaymenttypelist();

    Map<String, Object> getpaymentmodelist();

    Map<String, Object> getbanklist();

    void createleadpayment(DeliverCarRequestDTO dto) throws JPAException;

    void cancelleadpayment(DeliverCarRequestDTO dto) throws JPAException;

   // Map<String, Object> getpaymentlist();

   // Map<String,Object> getleaddata(DealerAddVehicleRequestDTO dto);
   Map<String, Object> getbaldetails(String lead_id);

    Map<String, Object> getleaddata(String lead_id,String status);

    Map<String, Object> getpincodedetails(String pincode);
}

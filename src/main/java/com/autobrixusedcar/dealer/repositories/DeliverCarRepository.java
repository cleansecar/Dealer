package com.autobrixusedcar.dealer.repositories;

import com.autobrixusedcar.dealer.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

public interface DeliverCarRepository extends JpaRepository<BaseEntity, Long>{

    @Query(value = "call uci_get_lead_address(:lead_id);", nativeQuery = true)
    Map<String,Object> getleadaddress(@Param("lead_id")Integer lead_id);

    @Modifying(flushAutomatically = true)
    @Transactional
    @Query(value ="call uci_update_lead_address(:lead_id,:address_line_1,:address_line_2,:landmark,:city,:state,:pincode); ",nativeQuery =true)
    void update_lead_address(
            @Param("lead_id")Integer lead_id,
            @Param("address_line_1")String address_line_1,
            @Param("address_line_2")String address_line_2,
            @Param("landmark")String landmark,
            @Param("city")String city,
            @Param("state")String state,
            @Param("pincode")String pincode);


    @Query(value = "call uci_get_vehicle_post_delivery_commitment_master_list();", nativeQuery = true)
    List<Map<String,Object>> postdeliverycommintment();

    @Modifying(flushAutomatically = true)
    @Transactional
    @Query(value ="call uci_update_vehicle_post_delivery_commitment_details(:vehicle_id,:lead_id,:commitment_id,:is_exists,:comments); ",nativeQuery =true)
    void update_postdelivery_commitments(
            @Param("vehicle_id")Integer vehicle_id,
            @Param("lead_id")Integer lead_id,
            @Param("commitment_id")Integer commitment_id,
            @Param("is_exists")String is_exists,
            @Param("comments")String comments);


    @Modifying(flushAutomatically = true)
    @Transactional
    @Query(value ="call uci_update_lead_kyc_details(:lead_id,:vehicle_id,:aadhar_front_image,:aadhar_rear_image,:pan_card_front_image,:pan_card_rear_image,:driving_licience_front_image,:driving_licience_rear_image,:passport_size_image); ",nativeQuery =true)
    void update_kyc_details(
            @Param("lead_id")Integer lead_id,
            @Param("vehicle_id")Integer vehicle_id,
            @Param("aadhar_front_image")String aadhar_front_image,
            @Param("aadhar_rear_image")String aadhar_rear_image,
            @Param("pan_card_front_image")String pan_card_front_image,
            @Param("pan_card_rear_image")String pan_card_rear_image,
            @Param("driving_licience_front_image")String driving_licience_front_image,
            @Param("driving_licience_rear_image")String driving_licience_rear_image,
            @Param("passport_size_image")String passport_size_image);


    @Modifying(flushAutomatically = true)
    @Transactional
    @Query(value ="call uci_update_vehicle_delivery_images(:dealer_id,:vehicle_id,:image_1,:image_2,:image_3,:image_4); ",nativeQuery =true)
    void update_postdelivery_images(
            @Param("dealer_id")Integer dealer_id,
            @Param("vehicle_id")Integer vehicle_id,
            @Param("image_1")String image_1,
            @Param("image_2")String image_2,
            @Param("image_3")String image_3,
            @Param("image_4")String image_4
            );

    @Query(value = "call uci_get_customer_vehicle_exchange_data(:vehicle_id,:mobile_no);", nativeQuery = true)
    Map<String,Object> getexchangedata(@Param("vehicle_id")Integer vehicle_id,@Param("mobile_no")String mobile_no);

    @Modifying(flushAutomatically = true)
    @Transactional
    @Query(value ="call uci_update_customer_vehicle_exchange_data(:exchange_id,:vehicle_id," +
            ":customer_name,:customer_no,:model_id," +
            ":vehicle_make,:vehicle_model,:fuel_type,:vehicle_no,:ownership,:odometer," +
            ":manufacturing_year,:color,:price,:transmission_type,:lead_id); ",nativeQuery =true)
    void update_vehicle_exchangedata(
            @Param("exchange_id")Integer exchange_id,
            @Param("vehicle_id")Integer vehicle_id,
            @Param("customer_name")String customer_name,
            @Param("customer_no")String customer_no,
            @Param("model_id")Integer model_id,
            @Param("vehicle_make")String vehicle_make,
            @Param("vehicle_model")String vehicle_model,
            @Param("fuel_type")String fuel_type,
            @Param("vehicle_no")String vehicle_no,
            @Param("ownership")String ownership,
            @Param("odometer")String odometer,
            @Param("manufacturing_year")String manufacturing_year,
            @Param("color")String color,
            @Param("price")Double price,
            @Param("transmission_type")String transmission_type,
            @Param("lead_id")Integer lead_id
    );

    @Query(value = "call uci_get_payment_type_list();", nativeQuery = true)
    List<Map<String,Object>> paymenttypelist();

    @Query(value = "call uci_get_payment_mode_list();", nativeQuery = true)
    List<Map<String,Object>> paymentmodelist();

    @Query(value = "call uci_get_banks_list();", nativeQuery = true)
    List<Map<String,Object>> banklist();

    @Modifying(flushAutomatically = true)
    @Transactional
    @Query(value ="call uci_create_lead_payment(:vehicle_id,:lead_id,:payment_type_id,:payment_mode_id,:applied_amount,:final_amount,:reference_no,:bank_id,:cheque_no,:cheque_status,:loan_status); ",nativeQuery =true)
    void create_lead_payment(
            @Param("vehicle_id")Integer vehicle_id,
            @Param("lead_id")Integer lead_id,
            @Param("payment_type_id")Integer payment_type_id,
            @Param("payment_mode_id")Integer payment_mode_id,
            @Param("applied_amount")Double applied_amount,
            @Param("final_amount")Double final_amount,
            @Param("reference_no")String reference_no,
            @Param("bank_id")Integer bank_id,
            @Param("cheque_no")String cheque_no,
            @Param("cheque_status")String cheque_status,
            @Param("loan_status")String loan_status
    );

    @Modifying(flushAutomatically = true)
    @Transactional
    @Query(value ="call uci_cancel_lead_payment(:payment_id); ",nativeQuery =true)
    void cancel_lead_payment(
            @Param("payment_id")Integer payment_id
    );

    @Query(value = "call uci_get_lead_deal_data(:lead_id);", nativeQuery = true)
    Map<String,Object> getleaddata(@Param("lead_id")Integer lead_id);

    @Query(value = "call uci_get_lead_payments_list(:lead_id,:status);", nativeQuery = true)
    List<Map<String,Object>> getleadpaymentlist(@Param("lead_id")Integer lead_id,@Param("status")String status);

    @Query(value = "call uci_get_city_state_by_pincode(:pincode);",nativeQuery = true)
    Map<String,Object>getpicodedetails(@Param("pincode")String pincode);


}

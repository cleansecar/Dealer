package com.autobrixusedcar.dealer.serviceimpl;

import com.autobrixusedcar.dealer.dtos.DeliverCarRequestDTO;
import com.autobrixusedcar.dealer.repositories.DeliverCarRepository;
import com.autobrixusedcar.dealer.repositories.VehicleEnquiryRepository;
import com.autobrixusedcar.dealer.services.DeliverCarService;
import com.autobrixusedcar.dealer.services.JPAException;
import com.autobrixusedcar.dealer.services.VehicleEnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DeliverCarServiceImpl implements DeliverCarService {
	@Autowired
	private DeliverCarRepository delivercarrepository;
	@Override
	public Map<String, Object> getleadAddress(String lead_id) {
		Map<String, Object> map = new HashMap<>();
		Map<String,Object> leadaddress = delivercarrepository.getleadaddress(Integer.valueOf(lead_id));
		map.put("getleadaddress", leadaddress);
		return map;
	}
	@Override
	public void updateleadaddress(DeliverCarRequestDTO dto) throws JPAException {
		delivercarrepository.update_lead_address(Integer.valueOf(dto.getLead_id()),
				dto.getAddress_line_1() == null || dto.getAddress_line_1().isEmpty() ? null : dto.getAddress_line_1(),
				dto.getAddress_line_2() == null || dto.getAddress_line_2().isEmpty() ? null : dto.getAddress_line_2(),
				dto.getLandmark() == null || dto.getLandmark().isEmpty() ? null : dto.getLandmark(),
				dto.getCity()== null || dto.getCity().isEmpty() ? null : dto.getCity(),
				dto.getState() == null || dto.getState().isEmpty() ? null : dto.getState(),
				dto.getPincode() == null || dto.getPincode() .isEmpty() ? null : dto.getPincode() );

		return;
	}
	@Override
	public Map<String, Object> getpostvehdeliverycommitmentlist() {
		List<Map<String,Object>> datalist = delivercarrepository.postdeliverycommintment();
		Map<String, Object> map = new HashMap<>();
		map.put("commitmentlist", datalist);
		return map;
	}

	@Override
	public void updatepostvehdeliverydetails(DeliverCarRequestDTO dto) throws JPAException {
		List<Map<String,Object>> data = dto.getCommitmentarr();
		for (Map<String, Object> map : data) {
			delivercarrepository.update_postdelivery_commitments(Integer.valueOf(dto.getVehicle_id()),
					Integer.valueOf(dto.getLead_id()),
					Integer.valueOf(dto.getCommitment_id()),
					dto.getIs_exists(),
					dto.getComments() == null || dto.getComments().isEmpty() ? null : dto.getComments()
			);
		}
		delivercarrepository.update_kyc_details(Integer.valueOf(dto.getLead_id()),
				Integer.valueOf(dto.getVehicle_id()),
				dto.getAadhar_front_image() == null || dto.getAadhar_front_image().isEmpty() ? null : dto.getAadhar_front_image(),
				dto.getAadhar_rear_image() == null || dto.getAadhar_rear_image() .isEmpty() ? null : dto.getAadhar_rear_image(),
				dto.getPan_card_front_image() == null || dto.getPan_card_front_image() .isEmpty() ? null : dto.getPan_card_front_image(),
				dto.getPan_card_rear_image() == null || dto.getPan_card_rear_image() .isEmpty() ? null : dto.getPan_card_rear_image(),
				dto.getDriving_licience_front_image() == null || dto.getDriving_licience_front_image() .isEmpty() ? null : dto.getDriving_licience_front_image(),
				dto.getDriving_licience_rear_image() == null || dto.getDriving_licience_rear_image().isEmpty() ? null : dto.getDriving_licience_rear_image(),
				dto.getPassport_size_image() == null || dto.getPassport_size_image().isEmpty() ? null : dto.getPassport_size_image()

		);
		delivercarrepository.update_postdelivery_images(Integer.valueOf(dto.getDealer_id()),
				Integer.valueOf(dto.getVehicle_id()),
				dto.getPostdelvehimage1() == null || dto.getPostdelvehimage1().isEmpty() ? null : dto.getPostdelvehimage1(),
				dto.getPostdelvehimage2() == null || dto.getPostdelvehimage2().isEmpty() ? null : dto.getPostdelvehimage2(),
				dto.getPostdelvehimage3() == null || dto.getPostdelvehimage3().isEmpty() ? null : dto.getPostdelvehimage3(),
				dto.getPostdelvehimage4() == null || dto.getPostdelvehimage4().isEmpty() ? null : dto.getPostdelvehimage4()

		);

		return;
	}

	@Override
	public Map<String, Object> getvehicleexchangedata(String vehicle_id, String mobile_no) {
		Map<String,Object> map = delivercarrepository.getexchangedata(Integer.valueOf(vehicle_id),mobile_no);
		map.put("getvehicleexchangedata", map);
		return map;
	}

	@Override
	public void updatevehicleexchangedata(DeliverCarRequestDTO dto) throws JPAException {
		delivercarrepository.update_vehicle_exchangedata(
				dto.getExchange_id() == null || dto.getExchange_id().isEmpty() ? null : Integer.valueOf(dto.getExchange_id()),
				dto.getVehicle_id() == null || dto.getVehicle_id().isEmpty() ? null : Integer.valueOf(dto.getVehicle_id()),
				dto.getCustomer_name() == null || dto.getCustomer_name() .isEmpty() ? null : dto.getCustomer_name() ,
				dto.getCustomer_no()== null || dto.getCustomer_no().isEmpty() ? null : dto.getCustomer_no(),
				dto.getModel_id()== null || dto.getModel_id().isEmpty() ? null :Integer.valueOf(dto.getModel_id()),
				dto.getVehicle_make() == null || dto.getVehicle_make().isEmpty() ? null : dto.getVehicle_make(),
				dto.getVehicle_model()== null || dto.getVehicle_model().isEmpty() ? null : dto.getVehicle_model(),
				dto.getFuel_type()== null || dto.getFuel_type().isEmpty() ? null : dto.getFuel_type(),
				dto.getVehicle_no()== null || dto.getVehicle_no().isEmpty() ? null : dto.getVehicle_no(),
				dto.getOwnership()== null || dto.getOwnership().isEmpty() ? null : dto.getOwnership(),
				dto.getOdometer()== null || dto.getOdometer().isEmpty() ? null : dto.getOdometer(),
				dto.getManufacturing_year()== null || dto.getManufacturing_year().isEmpty() ? null : dto.getManufacturing_year(),
				dto.getColor()== null || dto.getColor().isEmpty() ? null : dto.getColor(),
				dto.getPrice()== null || dto.getPrice().isEmpty() ? null : Double.valueOf(dto.getPrice()),
				dto.getTransmission_type()== null || dto.getTransmission_type().isEmpty() ? null : dto.getTransmission_type(),
				dto.getLead_id() == null || dto.getLead_id().isEmpty() ? null : Integer.valueOf(dto.getLead_id())
				);


		return;
	}

	@Override
	public Map<String, Object> getpaymenttypelist() {
		List<Map<String,Object>> datalist = delivercarrepository.paymenttypelist();
		Map<String, Object> map = new HashMap<>();
		map.put("getpaymenttypelist", datalist);
		return map;
	}

	@Override
	public Map<String, Object> getpaymentmodelist() {
		List<Map<String,Object>> datalist = delivercarrepository.paymentmodelist();
		Map<String, Object> map = new HashMap<>();
		map.put("getpaymentmodelist", datalist);
		return map;
	}

	@Override
	public Map<String, Object> getbanklist() {
		List<Map<String,Object>> datalist = delivercarrepository.banklist();
		Map<String, Object> map = new HashMap<>();
		map.put("getbanklist", datalist);
		return map;
	}

	@Override
	public void createleadpayment(DeliverCarRequestDTO dto) throws JPAException {
		delivercarrepository.create_lead_payment(Integer.valueOf(dto.getVehicle_id()),Integer.valueOf(dto.getLead_id()),
				Integer.valueOf(dto.getPaymenttypeid()),Integer.valueOf(dto.getPaymentmodeid()),
				Double.valueOf(dto.getAppliedamount()),
				Double.valueOf(dto.getFinalamount()),
				dto.getRefno() == null || dto.getRefno() .isEmpty() ? null : dto.getRefno() ,
				dto.getBankid()== null || dto.getBankid().isEmpty() ? null : Integer.valueOf(dto.getBankid()),
				dto.getChequeno() == null || dto.getChequeno().isEmpty() ? null : dto.getChequeno(),
				dto.getChequestatus() == null || dto.getChequestatus() .isEmpty() ? null : dto.getChequestatus() ,
				dto.getLoanstatus()== null || dto.getLoanstatus().isEmpty() ? null : dto.getLoanstatus());

		return;
	}

	@Override
	public void cancelleadpayment(DeliverCarRequestDTO dto) throws JPAException {
		delivercarrepository.cancel_lead_payment(Integer.valueOf(dto.getPaymentid()));

		return;
	}

	@Override
	public Map<String, Object> getbaldetails(String lead_id) {
		Map<String, Object> map = new HashMap<>();
		Map<String,Object> baldetails= delivercarrepository.getleaddata(Integer.valueOf(lead_id));
		map.put("getbaldetails", baldetails);
		return map;
	}

	@Override
	public Map<String, Object> getleaddata(String lead_id,String status) {

		Map<String,Object> leaddata = delivercarrepository.getleaddata(Integer.valueOf(lead_id));
		List<Map<String,Object>> paymentlist = delivercarrepository.getleadpaymentlist(Integer.valueOf(lead_id),status);
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> mapmain = new HashMap<>();
		map.put("getleaddata", leaddata);
		map.put("getleadpaymentlist", paymentlist);
		mapmain.put("leadpaymentdetails",map);
		return mapmain;


	}

	@Override
	public Map<String, Object> getpincodedetails(String pincode) {
		Map<String, Object> map = new HashMap<>();
		Map<String,Object> pincodedetails = delivercarrepository.getpicodedetails(pincode);
		map.put("getpincodedata", pincodedetails);
		return map;
	}
}

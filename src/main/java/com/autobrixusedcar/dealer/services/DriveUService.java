package com.autobrixusedcar.dealer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class DriveUService {

    @Autowired
    private RestTemplate restTemplate;

    public Map<String, Object> createBooking() {

        String url = "http://b2b.driveubox.com/affiliate/create-b2b-booking/";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> data = new HashMap<>();
        data.put("identity_hash", "jsqbSeb5wQyeGH9rcErdqImGwn0=");
        data.put("client_booking_id", "cb6b51ee-56ed");
        data.put("client_slug", "demo_b2b");
        data.put("city", "Bangalore");
        data.put("car_type", "manual");
        data.put("pickup_datetime", "20/11/2020 10:30");
        data.put("pickup_address", "Big Bazaar, Kathreguppe, Banashankari 3rd Stage, Banashankari, Bengaluru, Karnataka");
        data.put("pickup_longitude", 77.550853);
        data.put("pickup_latitude", 12.926611);
        data.put("customer_name", "Rohit");
        data.put("customer_mobile", "9900990099");
        data.put("drop_address", "RMZ Ecospace, Marathahalli - Sarjapur Outer Ring Road, Devarabisanahalli, Bengaluru, Karnataka");
        data.put("drop_longitude", 77.680934);
        data.put("drop_latitude", 12.927725);
        data.put("drop_location_contact", "8800880088");
        data.put("vehicle_registration_number", "KA05JA0001");

        HttpEntity<Object> requestEntity = new HttpEntity<>(data, headers);

        ResponseEntity<HashMap> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, HashMap.class);

        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("Status Code: "+statusCode);

        Map<String, Object> result = responseEntity.getBody();
        System.out.println("result: "+result);

        return result;
    }

    public Map<String, Object> cancelBooking() {

        String url = "http://b2b.driveubox.com/affiliate/cancel-b2b-booking/";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> data = new HashMap<>();
        data.put("identity_hash", "jsqbSeb5wQyeGH9rcErdqImGwn0=");
        data.put("client_slug", "demo_b2b");
        data.put("client_booking_id", "cb6b51ee-56ed");
        data.put("driveu_booking_id", "E99DDF8A");
        data.put("pickup_datetime", "20/11/2020 10:30");

        HttpEntity<Object> requestEntity = new HttpEntity<>(data, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("Status Code: "+statusCode);

        String result = responseEntity.getBody();
        System.out.println("result: "+result);

        return new HashMap<>();
    }
}

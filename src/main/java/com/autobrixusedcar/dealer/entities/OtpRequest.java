package com.autobrixusedcar.dealer.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "otp_request_tbl")
public class OtpRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone_no;
    private String otp_code;
    private String is_active = "Y";
    private LocalDate requested_on;
    private String is_verified;
    private LocalDate verified_on;

    public OtpRequest() {
    }

    public OtpRequest(String phone_no, String otp_code, String is_active,
                      String is_verified) {
        this.phone_no = phone_no;
        this.otp_code = otp_code;
        this.is_active = is_active;
        this.is_verified = is_verified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getOtp_code() {
        return otp_code;
    }

    public void setOtp_code(String otp_code) {
        this.otp_code = otp_code;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    public LocalDate getRequested_on() {
        return requested_on;
    }

    public void setRequested_on(LocalDate requested_on) {
        this.requested_on = requested_on;
    }

    public String getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(String is_verified) {
        this.is_verified = is_verified;
    }

    public LocalDate getVerified_on() {
        return verified_on;
    }

    public void setVerified_on(LocalDate verified_on) {
        this.verified_on = verified_on;
    }
}

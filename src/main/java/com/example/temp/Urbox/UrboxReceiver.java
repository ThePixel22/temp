package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UrboxReceiver
 */
public class UrboxReceiver {

    @JsonProperty("address")
    String address;

    @JsonProperty("phone")
    String phone;

    @JsonProperty("email")
    String email;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public UrboxReceiver(String address, String phone, String email) {
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}


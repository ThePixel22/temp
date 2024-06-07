package com.example.temp.Urbox;

public class Office {
    String address;

    String latitude;

    String longtitude;

    String isApply;
    String city_id;
    String title_city;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getIsApply() {
        return isApply;
    }

    public void setIsApply(String isApply) {
        this.isApply = isApply;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getTitle_city() {
        return title_city;
    }

    public void setTitle_city(String title_city) {
        this.title_city = title_city;
    }

    public Office() {
    }

    public Office(String address, String latitude, String longtitude, String isApply, String city_id, String title_city) {
        this.address = address;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.isApply = isApply;
        this.city_id = city_id;
        this.title_city = title_city;
    }
}

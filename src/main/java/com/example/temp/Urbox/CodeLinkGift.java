package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CodeLinkGift
 */
public class CodeLinkGift {

    @JsonProperty("cart_detail_id")
    String cartDetailId;

    @JsonProperty("code")
    String code;

    @JsonProperty("pin")
    Integer pin;

    @JsonProperty("serial")
    String serial;

    @JsonProperty("priceId")
    String priceId;

    @JsonProperty("price")
    Integer price;

    @JsonProperty("code_display")
    String codeDisplay;

    @JsonProperty("code_display_type")
    String codeDisplayType;

    @JsonProperty("link")
    String link;

    @JsonProperty("token")
    String token;

    @JsonProperty("code_image")
    String codeImage;

    @JsonProperty("expired")
    String expired;

    @JsonProperty("estimateDelivery")
    String estimateDelivery;

    @JsonProperty("ttemail")
    String ttemail;

    @JsonProperty("ttphone")
    String ttphone;

    @JsonProperty("city_id")
    Integer cityId;

    @JsonProperty("district_id")
    Integer districtId;

    @JsonProperty("ward_id")
    Integer wardId;

    @JsonProperty("ttaddress")
    String ttaddress;

    @JsonProperty("delivery_note")
    String deliveryNote;

    public void setCartDetailId(String cartDetailId) {
        this.cartDetailId = cartDetailId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setCodeDisplay(String codeDisplay) {
        this.codeDisplay = codeDisplay;
    }

    public void setCodeDisplayType(String codeDisplayType) {
        this.codeDisplayType = codeDisplayType;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setCodeImage(String codeImage) {
        this.codeImage = codeImage;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public void setEstimateDelivery(String estimateDelivery) {
        this.estimateDelivery = estimateDelivery;
    }

    public void setTtemail(String ttemail) {
        this.ttemail = ttemail;
    }

    public void setTtphone(String ttphone) {
        this.ttphone = ttphone;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    public void setTtaddress(String ttaddress) {
        this.ttaddress = ttaddress;
    }

    public void setDeliveryNote(String deliveryNote) {
        this.deliveryNote = deliveryNote;
    }

    public String getCartDetailId() {
        return cartDetailId;
    }

    public String getCode() {
        return code;
    }

    public Integer getPin() {
        return pin;
    }

    public String getSerial() {
        return serial;
    }

    public String getPriceId() {
        return priceId;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCodeDisplay() {
        return codeDisplay;
    }

    public String getCodeDisplayType() {
        return codeDisplayType;
    }

    public String getLink() {
        return link;
    }

    public String getToken() {
        return token;
    }

    public String getCodeImage() {
        return codeImage;
    }

    public String getExpired() {
        return expired;
    }

    public String getEstimateDelivery() {
        return estimateDelivery;
    }

    public String getTtemail() {
        return ttemail;
    }

    public String getTtphone() {
        return ttphone;
    }

    public Integer getCityId() {
        return cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public Integer getWardId() {
        return wardId;
    }

    public String getTtaddress() {
        return ttaddress;
    }

    public String getDeliveryNote() {
        return deliveryNote;
    }
}


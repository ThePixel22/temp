package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UrboxOrderGiftDetail
 */
public class UrboxOrderGiftDetail {

    @JsonProperty("link")
    String link;

    @JsonProperty("gift_id")
    String gift_id;

    @JsonProperty("priceId")
    String priceId;

    @JsonProperty("using_time")
    String using_time;

    @JsonProperty("delivery")
    String delivery;

    @JsonProperty("deliveryCode")
    String deliveryCode;

    @JsonProperty("estimateDelivery")
    String estimateDelivery;

    @JsonProperty("delivery_note")
    String delivery_note;

    @JsonProperty("topup")
    String topup;

    @JsonProperty("code")
    String code;

    @JsonProperty("expired")
    String expired;

    @JsonProperty("code_display")
    String code_display;

    @JsonProperty("code_display_type")
    String code_display_type;

    public void setLink(String link) {
        this.link = link;
    }

    public void setGift_id(String gift_id) {
        this.gift_id = gift_id;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }

    public void setUsing_time(String using_time) {
        this.using_time = using_time;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    public void setEstimateDelivery(String estimateDelivery) {
        this.estimateDelivery = estimateDelivery;
    }

    public void setDelivery_note(String delivery_note) {
        this.delivery_note = delivery_note;
    }

    public void setTopup(String topup) {
        this.topup = topup;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public void setCode_display(String code_display) {
        this.code_display = code_display;
    }

    public void setCode_display_type(String code_display_type) {
        this.code_display_type = code_display_type;
    }

    public String getLink() {
        return link;
    }

    public String getGift_id() {
        return gift_id;
    }

    public String getPriceId() {
        return priceId;
    }

    public String getUsing_time() {
        return using_time;
    }

    public String getDelivery() {
        return delivery;
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public String getEstimateDelivery() {
        return estimateDelivery;
    }

    public String getDelivery_note() {
        return delivery_note;
    }

    public String getTopup() {
        return topup;
    }

    public String getCode() {
        return code;
    }

    public String getExpired() {
        return expired;
    }

    public String getCode_display() {
        return code_display;
    }

    public String getCode_display_type() {
        return code_display_type;
    }
}


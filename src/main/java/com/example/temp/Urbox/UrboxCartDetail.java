package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UrboxOrderDetail
 */
public class UrboxCartDetail {

    @JsonProperty("id")
    String id;

    @JsonProperty("campaign_code")
    String campaignCode;

    @JsonProperty("linkCart")
    String linkCart;

    @JsonProperty("money_ship")
    String moneyShip;

    @JsonProperty("money_total")
    String moneyTotal;

    @JsonProperty("created")
    String created;

    @JsonProperty("pay_time")
    String payTime;

    @JsonProperty("pay_status")
    String payStatus;

    @JsonProperty("pay_status_code")
    String payStatusCode;

    @JsonProperty("customer")
    String customer;

    @JsonProperty("item_quantity")
    String itemQuantity;

    @JsonProperty("receiver")
    List<UrboxReceiver> receiver;

    @JsonProperty("detail")
    List<UrboxOrderGiftDetail> detail;

    public void setId(String id) {
        this.id = id;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public void setLinkCart(String linkCart) {
        this.linkCart = linkCart;
    }

    public void setMoneyShip(String moneyShip) {
        this.moneyShip = moneyShip;
    }

    public void setMoneyTotal(String moneyTotal) {
        this.moneyTotal = moneyTotal;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public void setPayStatusCode(String payStatusCode) {
        this.payStatusCode = payStatusCode;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setReceiver(List<UrboxReceiver> receiver) {
        this.receiver = receiver;
    }

    public void setDetail(List<UrboxOrderGiftDetail> detail) {
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public String getLinkCart() {
        return linkCart;
    }

    public String getMoneyShip() {
        return moneyShip;
    }

    public String getMoneyTotal() {
        return moneyTotal;
    }

    public String getCreated() {
        return created;
    }

    public String getPayTime() {
        return payTime;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public String getPayStatusCode() {
        return payStatusCode;
    }

    public String getCustomer() {
        return customer;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public List<UrboxReceiver> getReceiver() {
        return receiver;
    }

    public List<UrboxOrderGiftDetail> getDetail() {
        return detail;
    }
}


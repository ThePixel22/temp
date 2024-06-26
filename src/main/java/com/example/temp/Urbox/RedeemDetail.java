package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RedeemDetail {
    @JsonProperty("pay")
    Integer pay;

    @JsonProperty("transaction_id")
    String transactionId;

    @JsonProperty("campaign_code")
    String campaignCode;

    @JsonProperty("linkCart")
    String linkCart;

    @JsonProperty("linkCombo")
    String linkCombo;

    @JsonProperty("LinkShippingInfo")
    String LinkShippingInfo;

    @JsonProperty("cart")
    UrboxCart cart;

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public String getLinkCart() {
        return linkCart;
    }

    public void setLinkCart(String linkCart) {
        this.linkCart = linkCart;
    }

    public String getLinkCombo() {
        return linkCombo;
    }

    public void setLinkCombo(String linkCombo) {
        this.linkCombo = linkCombo;
    }

    public String getLinkShippingInfo() {
        return LinkShippingInfo;
    }

    public void setLinkShippingInfo(String linkShippingInfo) {
        LinkShippingInfo = linkShippingInfo;
    }

    public UrboxCart getCart() {
        return cart;
    }

    public void setCart(UrboxCart cart) {
        this.cart = cart;
    }


}

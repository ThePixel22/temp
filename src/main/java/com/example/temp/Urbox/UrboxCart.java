package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UrboxCart
 */
public class UrboxCart {

    @JsonProperty("id")
    String id;

    @JsonProperty("cartNo")
    String cartNo;

    @JsonProperty("money_total")
    Integer moneyTotal;

    @JsonProperty("money_ship")
    String moneyShip;

    @JsonProperty("link_gift")
    List<String> linkGift;

    @JsonProperty("code_link_gift")
    List<CodeLinkGift> codeLinkGift;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCartNo() {
        return cartNo;
    }

    public void setCartNo(String cartNo) {
        this.cartNo = cartNo;
    }

    public Integer getMoneyTotal() {
        return moneyTotal;
    }

    public void setMoneyTotal(Integer moneyTotal) {
        this.moneyTotal = moneyTotal;
    }

    public String getMoneyShip() {
        return moneyShip;
    }

    public void setMoneyShip(String moneyShip) {
        this.moneyShip = moneyShip;
    }

    public List<String> getLinkGift() {
        return linkGift;
    }

    public void setLinkGift(List<String> linkGift) {
        this.linkGift = linkGift;
    }

    public List<CodeLinkGift> getCodeLinkGift() {
        return codeLinkGift;
    }

    public void setCodeLinkGift(List<CodeLinkGift> codeLinkGift) {
        this.codeLinkGift = codeLinkGift;
    }


}


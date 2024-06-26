package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GatewayUrboxRedeemRes extends GatewayUrboxRes {

    @JsonProperty("Data")
    RedeemDetail data;

    public RedeemDetail getData() {
        return data;
    }

    public void setData(RedeemDetail data) {
        this.data = data;
    }


}

package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GatewayUrboxCartDetailRes extends GatewayUrboxRes {

    @JsonProperty("Data")
    UrboxCartDetail data;

    public UrboxCartDetail getData() {
        return data;
    }

    public void setData(UrboxCartDetail data) {
        this.data = data;
    }
}

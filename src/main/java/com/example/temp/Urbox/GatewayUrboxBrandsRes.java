package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GatewayUrboxBrandsRes extends GatewayUrboxRes {

    @JsonProperty("Data")
    BrandListResponse data;

    public BrandListResponse getData() {
        return data;
    }

    public void setData(BrandListResponse data) {
        this.data = data;
    }
}

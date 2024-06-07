package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GatewayUrboxProductsRes extends GatewayUrboxRes {

    @JsonProperty("Data")
    ProductListResponse data;

    public ProductListResponse getData() {
        return data;
    }

    public void setData(ProductListResponse data) {
        this.data = data;
    }
}

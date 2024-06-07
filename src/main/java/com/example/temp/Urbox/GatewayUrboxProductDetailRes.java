package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GatewayUrboxProductDetailRes extends GatewayUrboxRes {

    @JsonProperty("Data")
    ProductDetail data;

    public ProductDetail getData() {
        return data;
    }

    public void setData(ProductDetail data) {
        this.data = data;
    }


}

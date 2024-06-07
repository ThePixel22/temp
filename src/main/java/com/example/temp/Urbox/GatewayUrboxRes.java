package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class GatewayUrboxRes {
    @JsonProperty("ResponseID")
    private String responseID = null;

    @JsonProperty("ResponseCode")
    private Integer responseCode = null;

    @JsonProperty("ResponseMesage")
    private String responseMesage = null;

    @JsonProperty("Content")
    Map<String, Object> content = new HashMap<>();


    public String getResponseID() {
        return responseID;
    }

    public void setResponseID(String responseID) {
        this.responseID = responseID;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMesage() {
        return responseMesage;
    }

    public void setResponseMesage(String responseMesage) {
        this.responseMesage = responseMesage;
    }
}

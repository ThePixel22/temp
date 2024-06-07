package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class UrboxBrandsBody {
    @JsonProperty("RequestID")
    private String requestID = null;

    @JsonProperty("ServiceID")
    private String serviceID = null;

    @JsonProperty("FunctionName")
    private String functionName = null;

    @JsonProperty("Parameter")
    Map<String, Object> parameter = new HashMap<>();

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}

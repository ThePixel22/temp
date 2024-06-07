package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductListResponse {
    List<Product> items;

    Integer totalPage;

    Integer totalResult;


    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public Integer getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(Integer totalResult) {
        this.totalResult = totalResult;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public ProductListResponse(List<Product> items, Integer totalPage, Integer totalResult) {
        this.items = items;
        this.totalPage = totalPage;
        this.totalResult = totalResult;
    }
}

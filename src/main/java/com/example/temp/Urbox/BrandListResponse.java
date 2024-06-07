package com.example.temp.Urbox;

import com.example.temp.Urbox.Brand;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BrandListResponse {
    List<Brand> items;

    @JsonProperty("brand_count")
    Integer brandCount;

    String textTitle;

    Integer totalPage;

    public List<Brand> getItems() {
        return items;
    }

    public void setItems(List<Brand> items) {
        this.items = items;
    }

    public Integer getBrandCount() {
        return brandCount;
    }

    public void setBrandCount(Integer brandCount) {
        this.brandCount = brandCount;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public BrandListResponse(List<Brand> items, Integer brandCount, String textTitle, Integer totalPage) {
        this.items = items;
        this.brandCount = brandCount;
        this.textTitle = textTitle;
        this.totalPage = totalPage;
    }

    public BrandListResponse() {
    }
}

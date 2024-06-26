package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brand {
    String id;
    String title;

    String images;

    @JsonProperty("cat_id")
    String catId;

    @JsonProperty("cat_title")
    String catTitle;

    @JsonProperty("gift_count")
    Integer giftCount;

    @JsonProperty("parent_cat_id")
    Integer parentCatId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatTitle() {
        return catTitle;
    }

    public void setCatTitle(String catTitle) {
        this.catTitle = catTitle;
    }

    public Integer getGiftCount() {
        return giftCount;
    }

    public void setGiftCount(Integer giftCount) {
        this.giftCount = giftCount;
    }

    public Integer getParentCatId() {
        return parentCatId;
    }

    public void setParentCatId(Integer parentCatId) {
        this.parentCatId = parentCatId;
    }

    public Brand() {
    }

    public Brand(String id, String title, String images, String catId, String catTitle, Integer giftCount, Integer parentCatId) {
        this.id = id;
        this.title = title;
        this.images = images;
        this.catId = catId;
        this.catTitle = catTitle;
        this.giftCount = giftCount;
        this.parentCatId = parentCatId;
    }
}

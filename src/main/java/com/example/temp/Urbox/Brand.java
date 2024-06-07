package com.example.temp.Urbox;

public class Brand {
    String id;
    String title;

    String images;

    String catId;

    String catTitle;

    Integer giftCount;

    String parentCatId;

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

    public String getParentCatId() {
        return parentCatId;
    }

    public void setParentCatId(String parentCatId) {
        this.parentCatId = parentCatId;
    }

    public Brand() {
    }

    public Brand(String id, String title, String images, String catId, String catTitle, Integer giftCount, String parentCatId) {
        this.id = id;
        this.title = title;
        this.images = images;
        this.catId = catId;
        this.catTitle = catTitle;
        this.giftCount = giftCount;
        this.parentCatId = parentCatId;
    }
}

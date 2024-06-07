package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductDetail {
    @JsonProperty("id")
    String id;

    @JsonProperty("brand")
    String brand;

    @JsonProperty("cat_id")
    String catId;

    @JsonProperty("brand_id")
    String brandId;

    @JsonProperty("code_display")
    String codeDisplay;

    @JsonProperty("parent_cat_id")
    String parentCatId;

    @JsonProperty("gift_id")
    String giftId;

    @JsonProperty("title")
    String title;

    @JsonProperty("type")
    String type;

    @JsonProperty("price")
    String price;

    @JsonProperty("view")
    String view;

    @JsonProperty("quantity")
    String quantity;

    @JsonProperty("usage_check")
    String usageCheck;

    @JsonProperty("image")
    String image;

    @JsonProperty("images")
    List<String> images;

    @JsonProperty("images_rectangle")
    List<String> imagesRectangle;

    @JsonProperty("expire_duration")
    String expireDuration;

    @JsonProperty("brandImage")
    String brandImage;

    @JsonProperty("brand_online")
    String brandOnline;

    @JsonProperty("content")
    String content;

    @JsonProperty("note")
    String note;

    List<Office> office;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getCodeDisplay() {
        return codeDisplay;
    }

    public void setCodeDisplay(String codeDisplay) {
        this.codeDisplay = codeDisplay;
    }

    public String getParentCatId() {
        return parentCatId;
    }

    public void setParentCatId(String parentCatId) {
        this.parentCatId = parentCatId;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUsageCheck() {
        return usageCheck;
    }

    public void setUsageCheck(String usageCheck) {
        this.usageCheck = usageCheck;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getImagesRectangle() {
        return imagesRectangle;
    }

    public void setImagesRectangle(List<String> imagesRectangle) {
        this.imagesRectangle = imagesRectangle;
    }

    public String getExpireDuration() {
        return expireDuration;
    }

    public void setExpireDuration(String expireDuration) {
        this.expireDuration = expireDuration;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    public String getBrandOnline() {
        return brandOnline;
    }

    public void setBrandOnline(String brandOnline) {
        this.brandOnline = brandOnline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Office> getOffice() {
        return office;
    }

    public void setOffice(List<Office> office) {
        this.office = office;
    }

    public ProductDetail() {
    }

}

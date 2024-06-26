package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product {
    @JsonProperty("id")
    String id;

    @JsonProperty("brand")
    String brand;

    @JsonProperty("cat_id")
    String catId;

    @JsonProperty("brand_id")
    String brandId;

    @JsonProperty("cat_title")
    String catTitle;

    @JsonProperty("gift_id")
    String giftId;

    @JsonProperty("title")
    String title;

    @JsonProperty("type")
    String type;

    @JsonProperty("price")
    String price;

    @JsonProperty("point")
    String point;

    @JsonProperty("view")
    String view;

    @JsonProperty("quantity")
    String quantity;

    @JsonProperty("stock")
    Integer stock;

    @JsonProperty("image")
    String image;

   /* @JsonProperty("images")
    UrboxImages images;

    @JsonProperty("images_rectangle")
    UrboxImages imagesRectangle;*/

    /*public UrboxImages getImages() {
        return images;
    }

    public void setImages(UrboxImages images) {
        this.images = images;
    }

    public UrboxImages getImagesRectangle() {
        return imagesRectangle;
    }

    public void setImagesRectangle(UrboxImages imagesRectangle) {
        this.imagesRectangle = imagesRectangle;
    }*/

    @JsonProperty("images")
    List<String> images;

    @JsonProperty("images_rectangle")
    List<String> imagesRectangle;



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

    @JsonProperty("expire_duration")
    String expireDuration;

    @JsonProperty("code_display")
    String codeDisplay;

    @JsonProperty("code_display_type")
    Integer codeDisplayType;

    @JsonProperty("price_promo")
    Integer pricePromo;

    @JsonProperty("start_promo")
    Integer startPromo;

    @JsonProperty("end_promo")
    Integer endPromo;

    @JsonProperty("is_promo")
    Integer isPromo;

    @JsonProperty("is_unfix")
    String isUnfix;



    List<Office> office;

    @JsonProperty("brandLogoLoyalty")
    String brandLogoLoyalty;

    @JsonProperty("brandImage")
    String brandImage;

    @JsonProperty("brand_name")
    String brandName;

    @JsonProperty("brand_online")
    String brandOnline;

    @JsonProperty("parent_cat_id")
    String parentCatId;

    @JsonProperty("usage_check")
    Integer usageCheck;

    @JsonProperty("content")
    String content;

    @JsonProperty("note")
    String note;

    @JsonProperty("code_quantity")
    String codeQuantity;


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

    public String getCatTitle() {
        return catTitle;
    }

    public void setCatTitle(String catTitle) {
        this.catTitle = catTitle;
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

    public String getIsUnfix() {
        return isUnfix;
    }

    public void setIsUnfix(String isUnfix) {
        this.isUnfix = isUnfix;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }



    public String getExpireDuration() {
        return expireDuration;
    }

    public void setExpireDuration(String expireDuration) {
        this.expireDuration = expireDuration;
    }

    public String getCodeDisplay() {
        return codeDisplay;
    }

    public void setCodeDisplay(String codeDisplay) {
        this.codeDisplay = codeDisplay;
    }

    public Integer getCodeDisplayType() {
        return codeDisplayType;
    }

    public void setCodeDisplayType(Integer codeDisplayType) {
        this.codeDisplayType = codeDisplayType;
    }

    public Integer getPricePromo() {
        return pricePromo;
    }

    public void setPricePromo(Integer pricePromo) {
        this.pricePromo = pricePromo;
    }

    public Integer getStartPromo() {
        return startPromo;
    }

    public void setStartPromo(Integer startPromo) {
        this.startPromo = startPromo;
    }

    public Integer getEndPromo() {
        return endPromo;
    }

    public void setEndPromo(Integer endPromo) {
        this.endPromo = endPromo;
    }

    public Integer getIsPromo() {
        return isPromo;
    }

    public void setIsPromo(Integer isPromo) {
        this.isPromo = isPromo;
    }

    public List<Office> getOffice() {
        return office;
    }

    public void setOffice(List<Office> office) {
        this.office = office;
    }

    public String getBrandLogoLoyalty() {
        return brandLogoLoyalty;
    }

    public void setBrandLogoLoyalty(String brandLogoLoyalty) {
        this.brandLogoLoyalty = brandLogoLoyalty;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandOnline() {
        return brandOnline;
    }

    public void setBrandOnline(String brandOnline) {
        this.brandOnline = brandOnline;
    }

    public String getParentCatId() {
        return parentCatId;
    }

    public void setParentCatId(String parentCatId) {
        this.parentCatId = parentCatId;
    }

    public Integer getUsageCheck() {
        return usageCheck;
    }

    public void setUsageCheck(Integer usageCheck) {
        this.usageCheck = usageCheck;
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

    public String getCodeQuantity() {
        return codeQuantity;
    }

    public void setCodeQuantity(String codeQuantity) {
        this.codeQuantity = codeQuantity;
    }

    public Product() {
    }

}

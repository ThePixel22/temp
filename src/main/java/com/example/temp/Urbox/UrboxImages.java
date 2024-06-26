package com.example.temp.Urbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * UrboxImages
 */
public class UrboxImages {
    @JsonProperty("0")
    private String image0 = null;

    @JsonProperty("80")
    private String image80 = null;

    @JsonProperty("160")
    private String image160 = null;

    @JsonProperty("320")
    private String image320 = null;

    @JsonProperty("640")
    private String image640 = null;

    @JsonProperty("square")
    private String imageSquare = null;

    public List<String> getListImage () {
        List<String> images = new ArrayList<>();
        images.add(image0);
        images.add(image80);
        images.add(image160);
        images.add(image320);
        images.add(image640);
        images.add(imageSquare);
        return  images;
    }

    public String getImage0() {
        return image0;
    }

    public void setImage0(String image0) {
        this.image0 = image0;
    }

    public String getImage80() {
        return image80;
    }

    public void setImage80(String image80) {
        this.image80 = image80;
    }

    public String getImage160() {
        return image160;
    }

    public void setImage160(String image160) {
        this.image160 = image160;
    }

    public String getImage320() {
        return image320;
    }

    public void setImage320(String image320) {
        this.image320 = image320;
    }

    public String getImage640() {
        return image640;
    }

    public void setImage640(String image640) {
        this.image640 = image640;
    }

    public String getImageSquare() {
        return imageSquare;
    }

    public void setImageSquare(String imageSquare) {
        this.imageSquare = imageSquare;
    }

    public UrboxImages(String image0, String image80, String image160, String image320, String image640, String imageSquare) {
        this.image0 = image0;
        this.image80 = image80;
        this.image160 = image160;
        this.image320 = image320;
        this.image640 = image640;
        this.imageSquare = imageSquare;
    }
}


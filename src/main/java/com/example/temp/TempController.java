package com.example.temp;

import com.example.temp.Urbox.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TempController {

    public static final String UrboxGetBrandList = "UrboxGetBrandList";

    public static final String UrboxGetGiftList = "UrboxGetGiftList";

    public static final String UrboxGetGiftDetail = "UrboxGetGiftDetail";
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


    @GetMapping("/temp")
    public BrandListResponse listResponse() {

        Brand brand = new Brand("1","title","images","catID","catTitle",10,"parentCatId");
        List<Brand> items = new ArrayList<>();
        items.add(brand);

        BrandListResponse listResponse = new BrandListResponse(items, 1, "textTile", 1);
        return listResponse;
    }

    @PostMapping("/urbox")
    public GatewayUrboxRes urboxListResponse(@RequestBody UrboxBrandsBody urboxBrandsBody) {
        if(urboxBrandsBody.getFunctionName().equals(UrboxGetBrandList)) {
            return urboxGetBrandList();
        } else if (urboxBrandsBody.getFunctionName().equals(UrboxGetGiftList)) {
            return urboxGetGiftList();
        } else if (urboxBrandsBody.getFunctionName().equals(UrboxGetGiftDetail)) {
            return urboxGetGiftDetail();
        }
        return null;

    }

    private GatewayUrboxBrandsRes urboxGetBrandList() {
        Brand brand = new Brand("1","title","images","catID","catTitle",10,"parentCatId");
        List<Brand> items = new ArrayList<>();
        items.add(brand);

        BrandListResponse listResponse = new BrandListResponse(items, 1, "textTile", 1);

        GatewayUrboxBrandsRes gatewayUrboxBrandsRes = new GatewayUrboxBrandsRes();

        gatewayUrboxBrandsRes.setData(listResponse);
        gatewayUrboxBrandsRes.setResponseID("a9ec0482-30ba-4e03-8990-839cfd239737");
        gatewayUrboxBrandsRes.setResponseCode(0);
        gatewayUrboxBrandsRes.setResponseMesage("SUCCESS");
        return gatewayUrboxBrandsRes;
    }

    private GatewayUrboxProductsRes urboxGetGiftList() {
        Office office = new Office("kim dien", "0.323", "0.234", "2", "34", "Hai duong" );

        List<Office> offices = new ArrayList<>();
        offices.add(office);

        Product product = new Product();
        product.setId("123");
        product.setTitle("title");
        product.setBrand("Brand");
        product.setBrand_id("BRandID");
        product.setCat_id("cat id");
        product.setCat_title("CAT title");

        product.setOffice(offices);

        List<Product> items = new ArrayList<>();
        items.add(product);

        ProductListResponse listResponse = new ProductListResponse(items, 1, 1);

        GatewayUrboxProductsRes gatewayUrboxProductsRes = new GatewayUrboxProductsRes();

        gatewayUrboxProductsRes.setData(listResponse);
        gatewayUrboxProductsRes.setResponseID("a9ec0482-30ba-4e03-8990-839cfd239737");
        gatewayUrboxProductsRes.setResponseCode(0);
        gatewayUrboxProductsRes.setResponseMesage("SUCCESS");
        return gatewayUrboxProductsRes;
    }

    private GatewayUrboxProductDetailRes urboxGetGiftDetail() {
        Office office = new Office("kim dien", "0.323", "0.234", "2", "34", "Hai duong" );

        List<Office> offices = new ArrayList<>();
        offices.add(office);

        List<String> images = Arrays.asList("image1", "iamge2");
        List<String> imagerectangle = Arrays.asList("image3", "iamge4");

        ProductDetail product = new ProductDetail();
        product.setId("Id");
        product.setBrand("brand");
        product.setCatId("90");
        product.setBrandId("brand_id");
        product.setCodeDisplay("code_display");
        product.setParentCatId("parent_cat_id");
        product.setGiftId("gift_id");
        product.setTitle("title");
        product.setType("9");
        product.setPrice("price");
        product.setView("view");
        product.setQuantity("quantity");
        product.setUsageCheck("usage_check");
        product.setImage("image");
        product.setImages(images);
        product.setImagesRectangle(imagerectangle);
        product.setExpireDuration("01010001");
        product.setBrandImage("brandImage");
        product.setBrandOnline("brand_online");
        product.setContent("content");
        product.setNote("note");

        product.setOffice(offices);

        GatewayUrboxProductDetailRes gatewayUrboxProductDetailRes = new GatewayUrboxProductDetailRes();

        gatewayUrboxProductDetailRes.setData(product);
        gatewayUrboxProductDetailRes.setResponseID("a9ec0482-30ba-4e03-8990-839cfd239737");
        gatewayUrboxProductDetailRes.setResponseCode(0);
        gatewayUrboxProductDetailRes.setResponseMesage("SUCCESS");

        return gatewayUrboxProductDetailRes;
    }

}

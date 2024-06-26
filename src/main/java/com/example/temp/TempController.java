package com.example.temp;

import com.example.temp.Urbox.*;
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

    public static final String UrboxRedeemEVoucher = "UrboxRedeemEVoucher";

    public static final String UrboxRedeemPhysicalGift = "UrboxRedeemPhysicalGift";

    public static final String UrboxGetCartDetail = "UrboxGetCartDetail";

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


    @GetMapping("/temp")
    public BrandListResponse listResponse() {

        Brand brand = new Brand("1","title","images","catID","catTitle",10,123);
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
        } else if (urboxBrandsBody.getFunctionName().equals(UrboxRedeemEVoucher)) {
            return urboxRedeemEVoucher();
        } else if (urboxBrandsBody.getFunctionName().equals(UrboxRedeemPhysicalGift)) {
            return urboxRedeemEVoucher();
        } else if (urboxBrandsBody.getFunctionName().equals(UrboxGetCartDetail)) {
            return urboxGetCartDetail();
        }
        return null;

    }

    private GatewayUrboxBrandsRes urboxGetBrandList() {
        Brand brand = new Brand("1","title","images","catID","catTitle",10,123);
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
        Office office = new Office("47 Nguyễn Hữu Thọ, TT.Bến Lức, H.Bến Lức, T.Long An",
                "0.00000", "0.00000", "2", "37", "Long An" );
        UrboxImages i1 = new UrboxImages("https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/1667294628_6360e5a44fd8e.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/80/1667294628_6360e5a44fd8e.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/160/1667294628_6360e5a44fd8e.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/320/1667294628_6360e5a44fd8e.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/640/1667294628_6360e5a44fd8e.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/square/1667294628_6360e5a44fd8e.png");

        UrboxImages is = new UrboxImages("https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/1667294628_6360e5aad2d34.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/80/1667294628_6360e5aad2d34.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/160/1667294628_6360e5aad2d34.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/320/1667294628_6360e5aad2d34.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/640/1667294628_6360e5aad2d34.png",
                "https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/square/1667294628_6360e5aad2d34.png");

        List<Office> offices = new ArrayList<>();
        offices.add(office);

        Product product = new Product();
        product.setId("4871");
        product.setBrand("531");
        product.setBrandId("531");
        product.setCatId("10");
        product.setCatTitle("Nhà Hàng");
        product.setGiftId("2392");
        product.setTitle("[UrBox Voucher] KFC Combo Gà Rán 6A ");
        product.setType("10");
        product.setPrice("99000");
        product.setPoint("99000");
        product.setView("767");
        product.setQuantity("9617");
        product.setStock(1);
        product.setImage("https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/640/1667294628_6360e5a44fd8e.png");
        product.setImages(new ArrayList<>());
        product.setImagesRectangle(new ArrayList<>());
        //product.setImages(i1);
        //product.setImagesRectangle(is);
        product.setExpireDuration("60 ngày");
        product.setCodeDisplay("Barcode 128");
        product.setCodeDisplayType(2);
        product.setPricePromo(0);
        product.setStartPromo(0);
        product.setEndPromo(0);
        product.setIsPromo(1);
        product.setIsUnfix("1");
        product.setOffice(offices);
        product.setBrandLogoLoyalty("https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/160/1667293902_6360e2cea56f4.png");
        product.setBrandImage("https://632466.sgp1.digitaloceanspaces.com/_img_server/2022/11/01/640/1667293902_6360e2cea56f4.png");
        product.setBrandName("KFC");
        product.setBrandOnline("1");
        product.setParentCatId("8");
        product.setUsageCheck(1);
        product.setContent("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        product.setNote("<ul><li><span style=\\\"font-weight: bolder;\\\">Combo bao gồm:&nbsp;</span></li><li><span style=\\\"font-weight: bolder;\\\">02 x Miếng Gà Rán</span></li><li><span style=\\\"font-weight: bolder;\\\">02 x Xiên Gà Tenderods</span></li><li><span style=\\\"font-weight: bolder;\\\">01 x Kem Cone Vani</span></li><li><span style=\\\"font-weight: bolder;\\\">01 x ly Pepsi (vừa)</span></li><li>eGift áp dụng trực tiếp tại hệ thống cửa hàng KFC trên toàn quốc.</li><li>Vui lòng xuất trình đường link nhận quà có chứa mã eGift cho nhân viên tại quầy trước khi thanh toán để được áp dụng eGift.</li><li>eGift được sử dụng tất cả các ngày trong tuần, bao gồm cả ngày Lễ, Tết.</li><li>Có thể sử dụng nhiều mã eGift trên cùng 1 hoá đơn; eGift sẽ không được hoàn lại tiền thừa và không có giá trị quy đổi thành tiền mặt.</li><li>eGift được xuất ra sẽ không được đổi trả dưới mọi hình thức.</li><li>eGift chỉ áp dụng cho phần ăn định sẵn, không thể quy đổi ra tiền mặt, không được hoàn trả hay bán lại.&nbsp;</li><li>eGift không áp dụng cùng các chương trình khuyến mãi khác</li><li>Khách hàng có trách nhiệm bảo mật thông tin eGift sau khi đặt mua. UrBox sẽ không chịu trách nhiệm hoàn trả các eGift bị mất hoặc ở trạng thái “Đã sử dụng” sau thời gian eGift được xuất ra với bất kì lý do gì.</li><li>UrBox không chịu trách nhiệm đối với chất lượng của sản phẩm hoặc dịch vụ được cung cấp cũng như đối với các tranh chấp về sau giữa khách hàng và KFC</li><li>UrBox có quyền sửa chữa hoặc thay đổi điều khoản và điều kiện mà không thông báo trước.</li><li>Quý khách vui lòng liên hệ&nbsp;<span style=\\\"font-weight: bolder;\\\">Hotline UrBox: 1900 299 232</span>&nbsp;(từ 8h-22h hàng ngày, bao gồm Lễ Tết) để được hỗ trợ.</li></ul>\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t");
        product.setCodeQuantity("9617");



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

        UrboxImages images = new UrboxImages("i0","i80","i160","i320","i640", "is");
        UrboxImages imagerectangle = new UrboxImages("i0","i80","i160","i320","i640", "is");

        ProductDetail product = new ProductDetail();
        product.setId("4871");
        product.setBrand("531");
        product.setCatId("10");
        product.setBrandId("531");
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

    private GatewayUrboxRedeemRes urboxRedeemEVoucher() {
        CodeLinkGift codeLinkGift = new CodeLinkGift( );
         codeLinkGift.setCartDetailId("cartId");
         codeLinkGift.setCode("Code");
         codeLinkGift. setPin(334234);
         codeLinkGift. setSerial("serial");
         codeLinkGift. setPriceId( "priceId");
         codeLinkGift. setPrice(1231);
         codeLinkGift. setCodeDisplay("codeDisplay");
         codeLinkGift. setCodeDisplayType("codeDisplayType");
         codeLinkGift. setLink("link");
         codeLinkGift. setToken("token");
         codeLinkGift. setCodeImage("codeImage");
         codeLinkGift. setExpired("12062024");
         codeLinkGift. setEstimateDelivery("estimateDelivery");
         codeLinkGift. setTtemail("ttemail");
         codeLinkGift. setTtphone("ttphone");
         codeLinkGift. setCityId(1);
         codeLinkGift. setDistrictId(12);
         codeLinkGift. setWardId(123);
         codeLinkGift. setTtaddress("ttaddress");
         codeLinkGift.setDeliveryNote("deliveryNote");

         List<CodeLinkGift> a = Arrays.asList(codeLinkGift);

        UrboxCart urboxCart = new UrboxCart();
        urboxCart.setCartNo("cartNo");
        urboxCart.setId("Id");
        urboxCart.setLinkGift(new ArrayList<>());
        urboxCart.setMoneyShip("moneyShip");
        urboxCart.setMoneyTotal(3432);
        urboxCart.setCodeLinkGift(a);

        RedeemDetail redeemDetail = new RedeemDetail();
        redeemDetail.setCampaignCode("CampaignCode");
        redeemDetail.setPay(898);
        redeemDetail.setTransactionId("32423424");
        redeemDetail.setLinkCart("linkCart");
        redeemDetail.setLinkCombo("linkCombo");
        redeemDetail.setLinkShippingInfo("LinkShippingInfo");
        redeemDetail.setCart(urboxCart);

        GatewayUrboxRedeemRes gatewayUrboxRedeemRes = new GatewayUrboxRedeemRes();

        gatewayUrboxRedeemRes.setData(redeemDetail);
        gatewayUrboxRedeemRes.setResponseID("a9ec0482-30ba-4e03-8990-839cfd239737");
        gatewayUrboxRedeemRes.setResponseCode(0);
        gatewayUrboxRedeemRes.setResponseMesage("SUCCESS");

        return gatewayUrboxRedeemRes;
    }

    private GatewayUrboxCartDetailRes urboxGetCartDetail() {
        UrboxReceiver urboxReceiver = new UrboxReceiver("address","phone9239","email");
        List<UrboxReceiver> urboxReceivers = Arrays.asList(urboxReceiver);

        UrboxOrderGiftDetail urboxOrderGiftDetail = new UrboxOrderGiftDetail();
        urboxOrderGiftDetail.setLink("link");
        urboxOrderGiftDetail.setGift_id("giftId");
        urboxOrderGiftDetail.setPriceId("priceId");
        urboxOrderGiftDetail.setUsing_time("usingTime");
        urboxOrderGiftDetail.setDelivery("delivery");
        urboxOrderGiftDetail.setDeliveryCode("deliveryCode");
        urboxOrderGiftDetail.setEstimateDelivery("estimateDelivery");
        urboxOrderGiftDetail.setDelivery_note("deliveryNote");
        urboxOrderGiftDetail.setTopup("topup");
        urboxOrderGiftDetail.setCode("code");
        urboxOrderGiftDetail.setExpired("expired");
        urboxOrderGiftDetail.setCode_display("codeDisplay");
        urboxOrderGiftDetail.setCode_display_type("codeDisplayType");
        List<UrboxOrderGiftDetail> details = Arrays.asList(urboxOrderGiftDetail);

        UrboxCartDetail urboxCartDetail = new UrboxCartDetail();
        urboxCartDetail.setId("id");
        urboxCartDetail.setCampaignCode("campaignCode");
        urboxCartDetail.setLinkCart("linkCart");
        urboxCartDetail.setMoneyShip("moneyShip");
        urboxCartDetail.setMoneyTotal("moneyTotal");
        urboxCartDetail.setCreated("created");
        urboxCartDetail.setPayTime("payTime");
        urboxCartDetail.setPayStatus("payStatus");
        urboxCartDetail.setPayStatusCode("payStatusCode");
        urboxCartDetail.setCustomer("customer");
        urboxCartDetail.setItemQuantity("itemQuantity");
        urboxCartDetail.setReceiver(urboxReceivers);
        urboxCartDetail.setDetail(details);

        GatewayUrboxCartDetailRes gatewayUrboxCartDetailRes = new GatewayUrboxCartDetailRes();
        gatewayUrboxCartDetailRes.setData(urboxCartDetail);
        gatewayUrboxCartDetailRes.setResponseID("a9ec0482-30ba-4e03-8990-839cfd239737");
        gatewayUrboxCartDetailRes.setResponseCode(0);
        gatewayUrboxCartDetailRes.setResponseMesage("SUCCESS");
        return gatewayUrboxCartDetailRes;
    }

}

package com.kdu.demo.dto.Capture;

import java.io.Serializable;

public class CaptureTransactionRequest implements Serializable {

    private String commerce_code;
    private String buy_order;
    private String authorization_code;
    private Integer capture_amount;

    public CaptureTransactionRequest() {
    }

    public CaptureTransactionRequest(String commerce_code, String buy_order, String authorization_code,
                                     Integer capture_amount) {
        this.commerce_code = commerce_code;
        this.buy_order = buy_order;
        this.authorization_code = authorization_code;
        this.capture_amount = capture_amount;
    }

    public String getCommerce_code() {
        return commerce_code;
    }

    public void setCommerce_code(String commerce_code) {
        this.commerce_code = commerce_code;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    public String getAuthorization_code() {
        return authorization_code;
    }

    public void setAuthorization_code(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    public Integer getCapture_amount() {
        return capture_amount;
    }

    public void setCapture_amount(Integer capture_amount) {
        this.capture_amount = capture_amount;
    }

    @Override
    public String toString() {
        return "CapturaTransactionRequest{" +
                "commerce_code='" + commerce_code + '\'' +
                ", buy_order='" + buy_order + '\'' +
                ", authorization_code='" + authorization_code + '\'' +
                ", capture_amount=" + capture_amount +
                '}';
    }
}

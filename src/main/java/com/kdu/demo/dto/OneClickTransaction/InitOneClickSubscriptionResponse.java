package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class InitOneClickSubscriptionResponse implements Serializable {

    private String token;
    private String url_webpay;

    public InitOneClickSubscriptionResponse() {
    }

    public InitOneClickSubscriptionResponse(String token, String url_webpay) {
        this.token = token;
        this.url_webpay = url_webpay;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl_webpay() {
        return url_webpay;
    }

    public void setUrl_webpay(String url_webpay) {
        this.url_webpay = url_webpay;
    }

    @Override
    public String toString() {
        return "InitSubscriptionResponse{" +
                "token='" + token + '\'' +
                ", url_webpay='" + url_webpay + '\'' +
                '}';
    }
}

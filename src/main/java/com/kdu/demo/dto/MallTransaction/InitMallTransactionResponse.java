package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;

public class InitMallTransactionResponse implements Serializable {

    private String token;
    private String url;

    public InitMallTransactionResponse() {
    }

    public InitMallTransactionResponse(String token, String url) {
        this.token = token;
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "InitMallTransactionResponse{" +
                "token='" + token + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

package com.kdu.demo.dto.CaptureTransaction;

import java.io.Serializable;

public class CaptureTransactionResponse implements Serializable {

    private String token;
    private String authorization_code;
    private String authorization_date;
    private String captured_amount;

    public CaptureTransactionResponse() {
    }

    public CaptureTransactionResponse(String token, String authorization_code, String authorization_date,
                                      String captured_amount) {
        this.token = token;
        this.authorization_code = authorization_code;
        this.authorization_date = authorization_date;
        this.captured_amount = captured_amount;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAuthorization_code() {
        return authorization_code;
    }

    public void setAuthorization_code(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    public String getAuthorization_date() {
        return authorization_date;
    }

    public void setAuthorization_date(String authorization_date) {
        this.authorization_date = authorization_date;
    }

    public String getCaptured_amount() {
        return captured_amount;
    }

    public void setCaptured_amount(String captured_amount) {
        this.captured_amount = captured_amount;
    }

    @Override
    public String toString() {
        return "CapturaTransactionResponse{" +
                "token='" + token + '\'' +
                ", authorization_code='" + authorization_code + '\'' +
                ", authorization_date='" + authorization_date + '\'' +
                ", captured_amount='" + captured_amount + '\'' +
                '}';
    }
}

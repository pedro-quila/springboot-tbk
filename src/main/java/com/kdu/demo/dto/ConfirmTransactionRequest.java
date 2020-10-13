package com.kdu.demo.dto;

import java.io.Serializable;

public class ConfirmTransactionRequest implements Serializable {

    private String token;

    public ConfirmTransactionRequest() {
    }

    public ConfirmTransactionRequest(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "ConfirmTransactionRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

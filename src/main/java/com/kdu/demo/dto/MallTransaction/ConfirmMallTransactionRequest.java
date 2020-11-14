package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;

public class ConfirmMallTransactionRequest implements Serializable {

    private String token;

    public ConfirmMallTransactionRequest() {
    }

    public ConfirmMallTransactionRequest(String token) {
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
        return "ConfirmMallTransactionRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

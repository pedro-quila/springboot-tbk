package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;

public class CompleteTransactionStateRequest implements Serializable {

    private String token;

    public CompleteTransactionStateRequest() {
    }

    public CompleteTransactionStateRequest(String token) {
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
        return "CompleteTransactionStateRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

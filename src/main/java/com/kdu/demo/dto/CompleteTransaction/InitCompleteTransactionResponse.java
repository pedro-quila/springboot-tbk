package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;

public class InitCompleteTransactionResponse implements Serializable {

    private String token;

    public InitCompleteTransactionResponse() {
    }

    public InitCompleteTransactionResponse(String token) {
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
        return "InitCompleteTransactionResponse{" +
                "token='" + token + '\'' +
                '}';
    }
}

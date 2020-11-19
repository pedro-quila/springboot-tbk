package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;

public class InitMallCompleteTransactionResponse implements Serializable {

    private String token;

    public InitMallCompleteTransactionResponse() {
    }

    public InitMallCompleteTransactionResponse(String token) {
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
        return "InitMallCompleteTransactionResponse{" +
                "token='" + token + '\'' +
                '}';
    }
}

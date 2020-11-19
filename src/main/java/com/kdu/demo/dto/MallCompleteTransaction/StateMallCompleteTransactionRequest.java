package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;

public class StateMallCompleteTransactionRequest implements Serializable {

    private InitMallCompleteTransactionResponse token;

    public StateMallCompleteTransactionRequest() {
    }

    public StateMallCompleteTransactionRequest(InitMallCompleteTransactionResponse token) {
        this.token = token;
    }

    public InitMallCompleteTransactionResponse getToken() {
        return token;
    }

    public void setToken(InitMallCompleteTransactionResponse token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "MallCompleteTransactionStateRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

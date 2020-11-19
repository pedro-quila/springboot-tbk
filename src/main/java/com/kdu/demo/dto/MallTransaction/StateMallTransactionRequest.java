package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;

public class StateMallTransactionRequest implements Serializable {

    private InitMallTransactionResponse token;

    public StateMallTransactionRequest() {
    }

    public StateMallTransactionRequest(InitMallTransactionResponse token) {
        this.token = token;
    }

    public InitMallTransactionResponse getToken() {
        return token;
    }

    public void setToken(InitMallTransactionResponse token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "MallTransactionStateRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

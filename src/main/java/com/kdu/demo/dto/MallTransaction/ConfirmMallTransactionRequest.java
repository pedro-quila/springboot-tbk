package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;

public class ConfirmMallTransactionRequest implements Serializable {

    private InitMallTransactionResponse token;

    public ConfirmMallTransactionRequest() {
    }

    public ConfirmMallTransactionRequest(InitMallTransactionResponse token) {
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
        return "ConfirmMallTransactionRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

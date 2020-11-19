package com.kdu.demo.dto.NormalTransaction;

import java.io.Serializable;

public class StateTransactionRequest implements Serializable {

    private InitTransactionResponse token;

    public StateTransactionRequest() {
    }

    public StateTransactionRequest(InitTransactionResponse token) {
        this.token = token;
    }

    public InitTransactionResponse getToken() {
        return token;
    }

    public void setToken(InitTransactionResponse token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "ConfirmTransactionRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

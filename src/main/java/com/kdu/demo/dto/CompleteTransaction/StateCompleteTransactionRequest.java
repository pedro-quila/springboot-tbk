package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;

public class StateCompleteTransactionRequest implements Serializable {

    private InitCompleteTransactionResponse token;

    public StateCompleteTransactionRequest() {
    }

    public StateCompleteTransactionRequest(InitCompleteTransactionResponse token) {
        this.token = token;
    }

    public InitCompleteTransactionResponse getToken() {
        return token;
    }

    public void setToken(InitCompleteTransactionResponse token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "CompleteTransactionStateRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

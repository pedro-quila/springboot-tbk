package com.kdu.demo.dto.NormalTransaction;

import java.io.Serializable;

public class TransactionStateRequest implements Serializable {

    private String token;

    public TransactionStateRequest() {
    }

    public TransactionStateRequest(String token) {
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

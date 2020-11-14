package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;

public class MallTransactionStateRequest implements Serializable {

    private String token;

    public MallTransactionStateRequest() {
    }

    public MallTransactionStateRequest(String token) {
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
        return "MallTransactionStateRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class FinishOneClickInscriptionRequest implements Serializable {

    private String token;

    public FinishOneClickInscriptionRequest() {
    }

    public FinishOneClickInscriptionRequest(String token) {
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
        return "FinishSubscriptionRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}

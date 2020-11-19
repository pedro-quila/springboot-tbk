package com.kdu.demo.dto.NormalTransaction;

import java.io.Serializable;

public class RefundTransactionRequest implements Serializable {

    private InitTransactionResponse token;
    private Integer amount;

    public RefundTransactionRequest(InitTransactionResponse token, Integer amount) {
        this.token = token;
        this.amount = amount;
    }

    public RefundTransactionRequest() {
    }

    public InitTransactionResponse getToken() {
        return token;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setToken(InitTransactionResponse token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "RefundTransactionRequest{" +
                "token='" + token + '\'' +
                ", amount=" + amount +
                '}';
    }
}

package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;

public class RefundCompleteTransactionRequest implements Serializable {

    private InitCompleteTransactionResponse token;
    private Integer amount;

    public RefundCompleteTransactionRequest() {
    }

    public RefundCompleteTransactionRequest(InitCompleteTransactionResponse token, Integer amount) {
        this.token = token;
        this.amount = amount;
    }

    public InitCompleteTransactionResponse getToken() {
        return token;
    }

    public void setToken(InitCompleteTransactionResponse token) {
        this.token = token;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RefundCompleteTransactionRequest{" +
                "token='" + token + '\'' +
                ", amount=" + amount +
                '}';
    }
}

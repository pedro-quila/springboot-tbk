package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;

public class QuotaCompleteTransactionRequest implements Serializable {

    private String token;
    private Integer installments_number;

    public QuotaCompleteTransactionRequest() {
    }

    public QuotaCompleteTransactionRequest(String token, Integer installments_number) {
        this.token = token;
        this.installments_number = installments_number;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getInstallments_number() {
        return installments_number;
    }

    public void setInstallments_number(Integer installments_number) {
        this.installments_number = installments_number;
    }

    @Override
    public String toString() {
        return "QuotaCompleteTransactionRequest{" +
                "token='" + token + '\'' +
                ", installments_number=" + installments_number +
                '}';
    }
}

package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;

public class QuotaMallCompleteTransactionRequest implements Serializable {

    private InitMallCompleteTransactionResponse token;
    private Integer installments_number;
    private String buy_order;
    private Integer commerce_code;

    public QuotaMallCompleteTransactionRequest() {
    }

    public QuotaMallCompleteTransactionRequest(InitMallCompleteTransactionResponse token, Integer installments_number,
                                               String buy_order, Integer commerce_code) {
        this.token = token;
        this.installments_number = installments_number;
        this.buy_order = buy_order;
        this.commerce_code = commerce_code;
    }

    public InitMallCompleteTransactionResponse getToken() {
        return token;
    }

    public void setToken(InitMallCompleteTransactionResponse token) {
        this.token = token;
    }

    public Integer getInstallments_number() {
        return installments_number;
    }

    public void setInstallments_number(Integer installments_number) {
        this.installments_number = installments_number;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    public Integer getCommerce_code() {
        return commerce_code;
    }

    public void setCommerce_code(Integer commerce_code) {
        this.commerce_code = commerce_code;
    }

    @Override
    public String toString() {
        return "QuotaMallCompleteTransactionRequest{" +
                "token='" + token + '\'' +
                ", installments_number=" + installments_number +
                ", buy_order='" + buy_order + '\'' +
                ", commerce_code=" + commerce_code +
                '}';
    }
}

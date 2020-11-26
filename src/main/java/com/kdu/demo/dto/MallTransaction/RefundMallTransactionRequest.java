package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;

public class RefundMallTransactionRequest implements Serializable {

    private InitMallTransactionResponse token;
    private String buy_order;
    private Integer commerce_code;
    private Integer amount;

    public RefundMallTransactionRequest() {
    }

    public RefundMallTransactionRequest(InitMallTransactionResponse token, String buy_order, Integer commerce_code, Integer amount) {
        this.token = token;
        this.buy_order = buy_order;
        this.commerce_code = commerce_code;
        this.amount = amount;
    }

    public InitMallTransactionResponse getToken() {
        return token;
    }

    public void setToken(InitMallTransactionResponse token) {
        this.token = token;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RefundMallTransactionRequest{" +
                "token='" + token + '\'' +
                "buy_order='" + buy_order + '\'' +
                ", commerce_code=" + commerce_code +
                ", amount=" + amount +
                '}';
    }
}

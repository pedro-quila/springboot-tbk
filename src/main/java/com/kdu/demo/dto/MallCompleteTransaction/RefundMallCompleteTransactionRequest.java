package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;

public class RefundMallCompleteTransactionRequest implements Serializable {

    private String buy_order;
    private Integer commerce_code;
    private Integer amount;

    public RefundMallCompleteTransactionRequest() {
    }

    public RefundMallCompleteTransactionRequest(String buy_order, Integer commerce_code, Integer amount) {
        this.buy_order = buy_order;
        this.commerce_code = commerce_code;
        this.amount = amount;
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
        return "RefundMallCompleteTransactionRequest{" +
                "buy_order='" + buy_order + '\'' +
                ", commerce_code=" + commerce_code +
                ", amount=" + amount +
                '}';
    }
}

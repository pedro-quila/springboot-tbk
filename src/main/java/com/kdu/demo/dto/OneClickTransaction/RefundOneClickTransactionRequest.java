package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class RefundOneClickTransactionRequest implements Serializable {

    private String buy_order;
    private Integer amount;

    public RefundOneClickTransactionRequest() {
    }

    public RefundOneClickTransactionRequest(String buy_order, Integer amount) {
        this.buy_order = buy_order;
        this.amount = amount;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RefundOneClickTransactionResponse{" +
                "buy_order='" + buy_order + '\'' +
                ", amount=" + amount +
                '}';
    }
}

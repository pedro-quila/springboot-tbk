package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;

public class MallTransactionDetails implements Serializable {

    private Integer amount;
    private String commerce_code;
    private String buy_order;

    public MallTransactionDetails() {
    }

    public MallTransactionDetails(Integer amount, String commerce_code, String buy_order) {
        this.amount = amount;
        this.commerce_code = commerce_code;
        this.buy_order = buy_order;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCommerce_code() {
        return commerce_code;
    }

    public void setCommerce_code(String commerce_code) {
        this.commerce_code = commerce_code;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    @Override
    public String toString() {
        return "MallTransactionDetails{" +
                "amount=" + amount +
                ", commerce_code='" + commerce_code + '\'' +
                ", buy_order='" + buy_order + '\'' +
                '}';
    }
}

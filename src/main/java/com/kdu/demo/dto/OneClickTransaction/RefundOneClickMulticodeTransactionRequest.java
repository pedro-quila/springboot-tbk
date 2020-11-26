package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class RefundOneClickMulticodeTransactionRequest implements Serializable {

    private Integer commerce_code;
    private String detail_buy_order;
    private Integer amount;

    public RefundOneClickMulticodeTransactionRequest() {
    }

    public RefundOneClickMulticodeTransactionRequest(Integer commerce_code, String detail_buy_order, Integer amount) {
        this.commerce_code = commerce_code;
        this.detail_buy_order = detail_buy_order;
        this.amount = amount;
    }

    public Integer getCommerce_code() {
        return commerce_code;
    }

    public void setCommerce_code(Integer commerce_code) {
        this.commerce_code = commerce_code;
    }

    public String getDetail_buy_order() {
        return detail_buy_order;
    }

    public void setDetail_buy_order(String detail_buy_order) {
        this.detail_buy_order = detail_buy_order;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RefundOneClickMulticodeTransactionRequest{" +
                "commerce_code=" + commerce_code +
                ", detail_buy_order='" + detail_buy_order + '\'' +
                ", amount=" + amount +
                '}';
    }
}

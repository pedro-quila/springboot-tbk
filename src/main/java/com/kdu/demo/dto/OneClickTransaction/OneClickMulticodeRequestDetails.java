package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class OneClickMulticodeRequestDetails implements Serializable {

    private Integer commerce_code;
    private String buy_order;
    private Integer amount;
    private Integer installments_number;

    public OneClickMulticodeRequestDetails() {
    }

    public OneClickMulticodeRequestDetails(Integer commerce_code, String buy_order, Integer amount, Integer installments_number) {
        this.commerce_code = commerce_code;
        this.buy_order = buy_order;
        this.amount = amount;
        this.installments_number = installments_number;
    }

    public Integer getCommerce_code() {
        return commerce_code;
    }

    public void setCommerce_code(Integer commerce_code) {
        this.commerce_code = commerce_code;
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

    public Integer getInstallments_number() {
        return installments_number;
    }

    public void setInstallments_number(Integer installments_number) {
        this.installments_number = installments_number;
    }

    @Override
    public String toString() {
        return "OneClickMulticodeDetails{" +
                "commerce_code=" + commerce_code +
                ", buy_order='" + buy_order + '\'' +
                ", amount=" + amount +
                ", installments_number=" + installments_number +
                '}';
    }
}

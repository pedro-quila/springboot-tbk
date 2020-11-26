package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class OneClickMulticodeResponseDetails implements Serializable {

    private Integer amount;
    private String status;
    private String authorization_code;
    private String payment_type_code;
    private Integer response_code;
    private Integer installments_number;
    private Integer installments_amount;
    private String commerce_code;
    private String buy_order;

    public OneClickMulticodeResponseDetails() {
    }

    public OneClickMulticodeResponseDetails(Integer amount, String status, String authorization_code,
                                            String payment_type_code, Integer response_code, Integer installments_number,
                                            Integer installments_amount, String commerce_code, String buy_order) {
        this.amount = amount;
        this.status = status;
        this.authorization_code = authorization_code;
        this.payment_type_code = payment_type_code;
        this.response_code = response_code;
        this.installments_number = installments_number;
        this.installments_amount = installments_amount;
        this.commerce_code = commerce_code;
        this.buy_order = buy_order;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthorization_code() {
        return authorization_code;
    }

    public void setAuthorization_code(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    public String getPayment_type_code() {
        return payment_type_code;
    }

    public void setPayment_type_code(String payment_type_code) {
        this.payment_type_code = payment_type_code;
    }

    public Integer getResponse_code() {
        return response_code;
    }

    public void setResponse_code(Integer response_code) {
        this.response_code = response_code;
    }

    public Integer getInstallments_number() {
        return installments_number;
    }

    public void setInstallments_number(Integer installments_number) {
        this.installments_number = installments_number;
    }

    public Integer getInstallments_amount() {
        return installments_amount;
    }

    public void setInstallments_amount(Integer installments_amount) {
        this.installments_amount = installments_amount;
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
        return "OneClickMulticodeResponseDetails{" +
                "amount=" + amount +
                ", status='" + status + '\'' +
                ", authorization_code='" + authorization_code + '\'' +
                ", payment_type_code='" + payment_type_code + '\'' +
                ", response_code=" + response_code +
                ", installments_number=" + installments_number +
                ", installments_amount=" + installments_amount +
                ", commerce_code='" + commerce_code + '\'' +
                ", buy_order='" + buy_order + '\'' +
                '}';
    }
}

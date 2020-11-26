package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class AuthorizeOneClickPaymentRequest implements Serializable {

    private String username;
    private String tbk_user;
    private Integer amount;
    private String buy_order;

    public AuthorizeOneClickPaymentRequest() {
    }

    public AuthorizeOneClickPaymentRequest(String username, String tbk_user, Integer amount, String buy_order) {
        this.username = username;
        this.tbk_user = tbk_user;
        this.amount = amount;
        this.buy_order = buy_order;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTbk_user() {
        return tbk_user;
    }

    public void setTbk_user(String tbk_user) {
        this.tbk_user = tbk_user;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    @Override
    public String toString() {
        return "AuthorizePaymentRequest{" +
                "username='" + username + '\'' +
                ", tbk_user='" + tbk_user + '\'' +
                ", amount=" + amount +
                ", buy_order='" + buy_order + '\'' +
                '}';
    }
}

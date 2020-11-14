package com.kdu.demo.dto.CompleteTransaction;

import com.kdu.demo.dto.MallTransaction.InitMallTransactionRequest;

import java.io.Serializable;

public class InitCompleteTransactionRequest implements Serializable {

    private String buy_order;
    private Integer session_id;
    private Integer amount;
    private String car_number;
    private Integer cvv;
    private String card_expiration_date;

    public InitCompleteTransactionRequest() {
    }

    public InitCompleteTransactionRequest(String buy_order, Integer session_id, Integer amount, String car_number,
                                          Integer cvv, String card_expiration_date) {
        this.buy_order = buy_order;
        this.session_id = session_id;
        this.amount = amount;
        this.car_number = car_number;
        this.cvv = cvv;
        this.card_expiration_date = card_expiration_date;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getCard_expiration_date() {
        return card_expiration_date;
    }

    public void setCard_expiration_date(String card_expiration_date) {
        this.card_expiration_date = card_expiration_date;
    }

    @Override
    public String toString() {
        return "InitCompleteTransactionRequest{" +
                "buy_order='" + buy_order + '\'' +
                ", session_id=" + session_id +
                ", amount=" + amount +
                ", car_number='" + car_number + '\'' +
                ", cvv=" + cvv +
                ", card_expiration_date='" + card_expiration_date + '\'' +
                '}';
    }
}

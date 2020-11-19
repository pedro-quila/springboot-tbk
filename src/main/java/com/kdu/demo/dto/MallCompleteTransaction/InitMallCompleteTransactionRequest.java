package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;
import java.util.ArrayList;

public class InitMallCompleteTransactionRequest implements Serializable {

    private String buy_order;
    private Integer session_id;
    private String card_number;
    private String card_expiration_date;
    private ArrayList<InitMallCompleteTransactionDetails> details;

    public InitMallCompleteTransactionRequest() {
    }

    public InitMallCompleteTransactionRequest(String buy_order, Integer session_id, String card_number,
                                              String card_expiration_date,
                                              ArrayList<InitMallCompleteTransactionDetails> details) {
        this.buy_order = buy_order;
        this.session_id = session_id;
        this.card_number = card_number;
        this.card_expiration_date = card_expiration_date;
        this.details = details;
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

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getCard_expiration_date() {
        return card_expiration_date;
    }

    public void setCard_expiration_date(String card_expiration_date) {
        this.card_expiration_date = card_expiration_date;
    }

    public ArrayList<InitMallCompleteTransactionDetails> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<InitMallCompleteTransactionDetails> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "InitMallCompleteTransactionRequest{" +
                "buy_order='" + buy_order + '\'' +
                ", session_id=" + session_id +
                ", card_number='" + card_number + '\'' +
                ", card_expiration_date='" + card_expiration_date + '\'' +
                ", details=" + details +
                '}';
    }
}

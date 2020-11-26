package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;
import java.util.Date;

public class StateOneClickMulticodeTransactionResponse implements Serializable {

    private Integer buy_order;
    private Integer session_id;
    private CardDetailOneClickTransaction card_detail;
    private Date expiration_date;
    private Date accounting_date;
    private Date transaction_date;
    private OneClickMulticodeResponseDetails details;

    public StateOneClickMulticodeTransactionResponse() {
    }

    public StateOneClickMulticodeTransactionResponse(Integer buy_order, Integer session_id,
                                                     CardDetailOneClickTransaction card_detail, Date expiration_date,
                                                     Date accounting_date, Date transaction_date,
                                                     OneClickMulticodeResponseDetails details) {
        this.buy_order = buy_order;
        this.session_id = session_id;
        this.card_detail = card_detail;
        this.expiration_date = expiration_date;
        this.accounting_date = accounting_date;
        this.transaction_date = transaction_date;
        this.details = details;
    }

    public Integer getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(Integer buy_order) {
        this.buy_order = buy_order;
    }

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public CardDetailOneClickTransaction getCard_detail() {
        return card_detail;
    }

    public void setCard_detail(CardDetailOneClickTransaction card_detail) {
        this.card_detail = card_detail;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public Date getAccounting_date() {
        return accounting_date;
    }

    public void setAccounting_date(Date accounting_date) {
        this.accounting_date = accounting_date;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public OneClickMulticodeResponseDetails getDetails() {
        return details;
    }

    public void setDetails(OneClickMulticodeResponseDetails details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "StateOneClickMulticodeTransactionResponse{" +
                "buy_order=" + buy_order +
                ", session_id=" + session_id +
                ", card_detail=" + card_detail +
                ", expiration_date=" + expiration_date +
                ", accounting_date=" + accounting_date +
                ", transaction_date=" + transaction_date +
                ", details=" + details +
                '}';
    }
}

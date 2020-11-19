package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class StateMallCompleteTransactionResponse implements Serializable {

    private Integer buy_order;
    private Integer session_id;
    private CardDetailMallCompleteTransaction card_detail;
    private Date expiration_date;
    private Date accounting_date;
    private Date transaction_date;
    private ArrayList<ConfirmMallCompleteTransactionDetails> details;

    public StateMallCompleteTransactionResponse() {
    }

    public StateMallCompleteTransactionResponse(Integer buy_order, Integer session_id,
                                                CardDetailMallCompleteTransaction card_detail, Date expiration_date,
                                                Date accounting_date, Date transaction_date,
                                                ArrayList<ConfirmMallCompleteTransactionDetails> details) {
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

    public CardDetailMallCompleteTransaction getCard_detail() {
        return card_detail;
    }

    public void setCard_detail(CardDetailMallCompleteTransaction card_detail) {
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

    public ArrayList<ConfirmMallCompleteTransactionDetails> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<ConfirmMallCompleteTransactionDetails> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "MallCompleteTransactionStateResponse{" +
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

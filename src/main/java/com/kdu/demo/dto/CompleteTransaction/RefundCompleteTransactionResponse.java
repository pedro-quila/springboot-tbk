package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;
import java.util.Date;

public class RefundCompleteTransactionResponse implements Serializable {

    private String type;
    private String authorization_code;
    private Date authorization_date;
    private Integer nullified_amount;
    private Integer balance;

    public RefundCompleteTransactionResponse() {
    }

    public RefundCompleteTransactionResponse(String type, String authorization_code, Date authorization_date,
                                             Integer nullified_amount, Integer balance) {
        this.type = type;
        this.authorization_code = authorization_code;
        this.authorization_date = authorization_date;
        this.nullified_amount = nullified_amount;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthorization_code() {
        return authorization_code;
    }

    public void setAuthorization_code(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    public Date getAuthorization_date() {
        return authorization_date;
    }

    public void setAuthorization_date(Date authorization_date) {
        this.authorization_date = authorization_date;
    }

    public Integer getNullified_amount() {
        return nullified_amount;
    }

    public void setNullified_amount(Integer nullified_amount) {
        this.nullified_amount = nullified_amount;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "RefundCompleteTransactionResponse{" +
                "type='" + type + '\'' +
                ", authorization_code='" + authorization_code + '\'' +
                ", authorization_date=" + authorization_date +
                ", nullified_amount=" + nullified_amount +
                ", balance=" + balance +
                '}';
    }
}

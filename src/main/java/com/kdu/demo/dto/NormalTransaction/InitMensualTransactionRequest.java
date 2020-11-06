package com.kdu.demo.dto.NormalTransaction;

import com.kdu.demo.dto.NormalTransaction.DetailMensualTransaction;

import java.io.Serializable;

public class InitMensualTransactionRequest implements Serializable {

    private String buy_order;
    private String session_id;
    private Integer amount;
    private String return_url;
    private DetailMensualTransaction wpm_detail;


    public InitMensualTransactionRequest() {
    }

    public InitMensualTransactionRequest(String buy_order, String session_id, Integer amount, String return_url,
                                         DetailMensualTransaction wpm_detail) {
        this.buy_order = buy_order;
        this.session_id = session_id;
        this.amount = amount;
        this.return_url = return_url;
        this.wpm_detail = wpm_detail;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public DetailMensualTransaction getWpm_detail() {
        return wpm_detail;
    }

    public void setWpm_detail(DetailMensualTransaction wpm_detail) {
        this.wpm_detail = wpm_detail;
    }

    @Override
    public String toString() {
        return "InitMensualTransactionRequest{" +
                "buy_order='" + buy_order + '\'' +
                ", session_id='" + session_id + '\'' +
                ", amount=" + amount +
                ", return_url='" + return_url + '\'' +
                ", wpm_detail=" + wpm_detail +
                '}';
    }
}

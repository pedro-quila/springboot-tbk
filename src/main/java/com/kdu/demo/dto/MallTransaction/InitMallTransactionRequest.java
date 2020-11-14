package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;
import java.util.ArrayList;

public class InitMallTransactionRequest implements Serializable {

    private String buy_order;
    private Integer session_id;
    private String return_url;
    private ArrayList<InitMallTransactionDetails> details;

    public InitMallTransactionRequest() {
    }

    public InitMallTransactionRequest(String buy_order, Integer session_id, String return_url,
                                      ArrayList<InitMallTransactionDetails> details) {
        this.buy_order = buy_order;
        this.session_id = session_id;
        this.return_url = return_url;
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

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public ArrayList<InitMallTransactionDetails> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<InitMallTransactionDetails> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "InitMallTransactionRequest{" +
                "buy_order='" + buy_order + '\'' +
                ", session_id=" + session_id +
                ", return_url='" + return_url + '\'' +
                ", details=" + details +
                '}';
    }
}

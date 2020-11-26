package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;
import java.util.ArrayList;

public class AuthorizeOneClickMulticodeRequest implements Serializable {

    private String username;
    private String tbk_user;
    private String buy_order;
    private ArrayList<OneClickMulticodeRequestDetails> details;

    public AuthorizeOneClickMulticodeRequest() {
    }

    public AuthorizeOneClickMulticodeRequest(String username, String tbk_user, String buy_order,
                                             ArrayList<OneClickMulticodeRequestDetails> details) {
        this.username = username;
        this.tbk_user = tbk_user;
        this.buy_order = buy_order;
        this.details = details;
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

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    public ArrayList<OneClickMulticodeRequestDetails> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<OneClickMulticodeRequestDetails> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "AuthorizeOneClickMulticodeRequest{" +
                "username='" + username + '\'' +
                ", tbk_user='" + tbk_user + '\'' +
                ", buy_order='" + buy_order + '\'' +
                ", details=" + details +
                '}';
    }
}

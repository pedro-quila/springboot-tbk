package com.kdu.demo.dto;

import java.io.Serializable;

public class InitMensualTransactionRequest implements Serializable {

    private String buy_order;
    private String session_id;
    private Integer amount;
    private String return_url;
    private String service_id;
    private String card_holder_id;
    private String card_holder_name;
    private String card_holder_last_name1;
    private String card_holder_last_name2;
    private String card_holder_mail;
    private String cellphone_number;
    private String expiration_date;
    private String commerce_mail;
    private Boolean uf_flag;

    public InitMensualTransactionRequest() {
    }

    public InitMensualTransactionRequest(String buy_order, String session_id, Integer amount, String return_url,
                                         String service_id, String card_holder_id, String card_holder_name,
                                         String card_holder_last_name1, String card_holder_last_name2, String card_holder_mail,
                                         String cellphone_number, String expiration_date, String commerce_mail, Boolean uf_flag) {
        this.buy_order = buy_order;
        this.session_id = session_id;
        this.amount = amount;
        this.return_url = return_url;
        this.service_id = service_id;
        this.card_holder_id = card_holder_id;
        this.card_holder_name = card_holder_name;
        this.card_holder_last_name1 = card_holder_last_name1;
        this.card_holder_last_name2 = card_holder_last_name2;
        this.card_holder_mail = card_holder_mail;
        this.cellphone_number = cellphone_number;
        this.expiration_date = expiration_date;
        this.commerce_mail = commerce_mail;
        this.uf_flag = uf_flag;
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

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getCard_holder_id() {
        return card_holder_id;
    }

    public void setCard_holder_id(String card_holder_id) {
        this.card_holder_id = card_holder_id;
    }

    public String getCard_holder_name() {
        return card_holder_name;
    }

    public void setCard_holder_name(String card_holder_name) {
        this.card_holder_name = card_holder_name;
    }

    public String getCard_holder_last_name1() {
        return card_holder_last_name1;
    }

    public void setCard_holder_last_name1(String card_holder_last_name1) {
        this.card_holder_last_name1 = card_holder_last_name1;
    }

    public String getCard_holder_last_name2() {
        return card_holder_last_name2;
    }

    public void setCard_holder_last_name2(String card_holder_last_name2) {
        this.card_holder_last_name2 = card_holder_last_name2;
    }

    public String getCard_holder_mail() {
        return card_holder_mail;
    }

    public void setCard_holder_mail(String card_holder_mail) {
        this.card_holder_mail = card_holder_mail;
    }

    public String getCellphone_number() {
        return cellphone_number;
    }

    public void setCellphone_number(String cellphone_number) {
        this.cellphone_number = cellphone_number;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getCommerce_mail() {
        return commerce_mail;
    }

    public void setCommerce_mail(String commerce_mail) {
        this.commerce_mail = commerce_mail;
    }

    public Boolean getUf_flag() {
        return uf_flag;
    }

    public void setUf_flag(Boolean uf_flag) {
        this.uf_flag = uf_flag;
    }

    @Override
    public String toString() {
        return "InitTransactionRequest{" +
                "buy_order='" + buy_order + '\'' +
                ", session_id='" + session_id + '\'' +
                ", amount=" + amount +
                ", return_url='" + return_url + '\'' +
                ", service_id='" + service_id + '\'' +
                ", card_holder_id='" + card_holder_id + '\'' +
                ", card_holder_name='" + card_holder_name + '\'' +
                ", card_holder_last_name1='" + card_holder_last_name1 + '\'' +
                ", card_holder_last_name2='" + card_holder_last_name2 + '\'' +
                ", card_holder_mail='" + card_holder_mail + '\'' +
                ", cellphone_number='" + cellphone_number + '\'' +
                ", expiration_date='" + expiration_date + '\'' +
                ", commerce_mail='" + commerce_mail + '\'' +
                ", uf_flag=" + uf_flag +
                '}';
    }
}

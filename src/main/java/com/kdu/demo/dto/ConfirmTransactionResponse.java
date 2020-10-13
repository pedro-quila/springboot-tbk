package com.kdu.demo.dto;

import java.io.Serializable;
import java.util.Date;

public class ConfirmTransactionResponse implements Serializable {

    private Integer vci;
    private Integer amount;
    private String status;
    private String buy_order;
    private String card_number;
    private Date accounting_date;
    private Date transaction_date;
    private String authorization_code;
    private String payment_type_code;
    private Integer response_code;
    private Integer installments_amount;
    private Integer installments_number;

    public ConfirmTransactionResponse() {
    }

    public ConfirmTransactionResponse(Integer vci, Integer amount, String status, String buy_order, String card_number,
                                      Date accounting_date, Date transaction_date, String authorization_code,
                                      String payment_type_code, Integer response_code, Integer installments_amount,
                                      Integer installments_number) {
        this.vci = vci;
        this.amount = amount;
        this.status = status;
        this.buy_order = buy_order;
        this.card_number = card_number;
        this.accounting_date = accounting_date;
        this.transaction_date = transaction_date;
        this.authorization_code = authorization_code;
        this.payment_type_code = payment_type_code;
        this.response_code = response_code;
        this.installments_amount = installments_amount;
        this.installments_number = installments_number;
    }

    public Integer getVci() {
        return vci;
    }

    public void setVci(Integer vci) {
        this.vci = vci;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
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

    public String getAuthorization_code() {
        return authorization_code;
    }

    public void setAuthorization_code(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    public String getPayment_type_code() {
        return payment_type_code;
    }

    public void setPayment_type_code(String payment_type_code) {
        this.payment_type_code = payment_type_code;
    }

    public Integer getResponse_code() {
        return response_code;
    }

    public void setResponse_code(Integer response_code) {
        this.response_code = response_code;
    }

    public Integer getInstallments_amount() {
        return installments_amount;
    }

    public void setInstallments_amount(Integer installments_amount) {
        this.installments_amount = installments_amount;
    }

    public Integer getInstallments_number() {
        return installments_number;
    }

    public void setInstallments_number(Integer installments_number) {
        this.installments_number = installments_number;
    }

    @Override
    public String toString() {
        return "ConfirmTransactionResponse{" +
                "vci=" + vci +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", buy_order='" + buy_order + '\'' +
                ", card_number='" + card_number + '\'' +
                ", accounting_date=" + accounting_date +
                ", transaction_date=" + transaction_date +
                ", authorization_code='" + authorization_code + '\'' +
                ", payment_type_code='" + payment_type_code + '\'' +
                ", response_code=" + response_code +
                ", installments_amount=" + installments_amount +
                ", installments_number=" + installments_number +
                '}';
    }
}

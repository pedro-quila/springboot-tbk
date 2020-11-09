package com.kdu.demo.dto.NormalTransaction;

import java.io.Serializable;
import java.util.Date;

public class TransactionStateResponse implements Serializable {

    private Integer vci;
    private Integer amount;
    private String status;
    private String buy_order;
    private String session_id;
    private DetailCardTransaction card_detail;
    private Date accounting_date;
    private Date transaction_date;
    private String authorization_code;
    private String payment_type_code;
    private Integer response_code;
    private Integer installments_number;
    private Integer installments_amount;

    public TransactionStateResponse() {
    }

    public TransactionStateResponse(Integer vci, Integer amount, String status, String buy_order, String session_id,
                                    DetailCardTransaction card_detail, Date accounting_date, Date transaction_date,
                                    String authorization_code, String payment_type_code, Integer response_code,
                                    Integer installments_number, Integer installments_amount) {
        this.vci = vci;
        this.amount = amount;
        this.status = status;
        this.buy_order = buy_order;
        this.session_id = session_id;
        this.card_detail = card_detail;
        this.accounting_date = accounting_date;
        this.transaction_date = transaction_date;
        this.authorization_code = authorization_code;
        this.payment_type_code = payment_type_code;
        this.response_code = response_code;
        this.installments_number = installments_number;
        this.installments_amount = installments_amount;
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

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public DetailCardTransaction getCard_detail() {
        return card_detail;
    }

    public void setCard_detail(DetailCardTransaction card_detail) {
        this.card_detail = card_detail;
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

    public Integer getInstallments_number() {
        return installments_number;
    }

    public void setInstallments_number(Integer installments_number) {
        this.installments_number = installments_number;
    }

    public Integer getInstallments_amount() {
        return installments_amount;
    }

    public void setInstallments_amount(Integer installments_amount) {
        this.installments_amount = installments_amount;
    }

    @Override
    public String toString() {
        return "TransactionStateResponse{" +
                "vci=" + vci +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", buy_order='" + buy_order + '\'' +
                ", session_id='" + session_id + '\'' +
                ", card_detail=" + card_detail +
                ", accounting_date=" + accounting_date +
                ", transaction_date=" + transaction_date +
                ", authorization_code='" + authorization_code + '\'' +
                ", payment_type_code='" + payment_type_code + '\'' +
                ", response_code=" + response_code +
                ", installments_number=" + installments_number +
                ", installments_amount=" + installments_amount +
                '}';
    }
}

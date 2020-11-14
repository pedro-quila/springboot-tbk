package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;

public class ConfirmCompleteTransactionRequest implements Serializable {

    private String token;
    private Integer id_query_installments;
    private Integer deferred_period_index;
    private Integer grace_period;

    public ConfirmCompleteTransactionRequest() {
    }

    public ConfirmCompleteTransactionRequest(String token, Integer id_query_installments, Integer deferred_period_index, Integer grace_period) {
        this.token = token;
        this.id_query_installments = id_query_installments;
        this.deferred_period_index = deferred_period_index;
        this.grace_period = grace_period;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getId_query_installments() {
        return id_query_installments;
    }

    public void setId_query_installments(Integer id_query_installments) {
        this.id_query_installments = id_query_installments;
    }

    public Integer getDeferred_period_index() {
        return deferred_period_index;
    }

    public void setDeferred_period_index(Integer deferred_period_index) {
        this.deferred_period_index = deferred_period_index;
    }

    public Integer getGrace_period() {
        return grace_period;
    }

    public void setGrace_period(Integer grace_period) {
        this.grace_period = grace_period;
    }

    @Override
    public String toString() {
        return "ConfirmCompleteTransactionRequest{" +
                "token='" + token + '\'' +
                ", id_query_installments=" + id_query_installments +
                ", deferred_period_index=" + deferred_period_index +
                ", grace_period=" + grace_period +
                '}';
    }
}

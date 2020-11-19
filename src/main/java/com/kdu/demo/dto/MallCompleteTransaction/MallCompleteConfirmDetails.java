package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;

public class MallCompleteConfirmDetails implements Serializable {

    private Integer commerce_code;
    private String buy_order;
    private Integer id_query_installments;
    private Integer deferred_period_index;
    private Boolean grace_period;

    public MallCompleteConfirmDetails() {
    }

    public MallCompleteConfirmDetails(Integer commerce_code, String buy_order, Integer id_query_installments,
                                      Integer deferred_period_index, Boolean grace_period) {
        this.commerce_code = commerce_code;
        this.buy_order = buy_order;
        this.id_query_installments = id_query_installments;
        this.deferred_period_index = deferred_period_index;
        this.grace_period = grace_period;
    }

    public Integer getCommerce_code() {
        return commerce_code;
    }

    public void setCommerce_code(Integer commerce_code) {
        this.commerce_code = commerce_code;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
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

    public Boolean getGrace_period() {
        return grace_period;
    }

    public void setGrace_period(Boolean grace_period) {
        this.grace_period = grace_period;
    }

    @Override
    public String toString() {
        return "MallCompleteConfirmDetails{" +
                "commerce_code=" + commerce_code +
                ", buy_order='" + buy_order + '\'' +
                ", id_query_installments=" + id_query_installments +
                ", deferred_period_index=" + deferred_period_index +
                ", grace_period=" + grace_period +
                '}';
    }
}

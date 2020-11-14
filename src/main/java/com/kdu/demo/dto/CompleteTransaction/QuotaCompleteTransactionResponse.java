package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;
import java.util.ArrayList;

public class QuotaCompleteTransactionResponse implements Serializable {

    private String installments_amount;
    private Integer id_query_installments;
    private ArrayList<DeferredPeriodsCompleteTransaction> deferred_periods;

    public QuotaCompleteTransactionResponse() {
    }

    public QuotaCompleteTransactionResponse(String installments_amount, Integer id_query_installments,
                                            ArrayList<DeferredPeriodsCompleteTransaction> deferred_periods) {
        this.installments_amount = installments_amount;
        this.id_query_installments = id_query_installments;
        this.deferred_periods = deferred_periods;
    }

    public String getInstallments_amount() {
        return installments_amount;
    }

    public void setInstallments_amount(String installments_amount) {
        this.installments_amount = installments_amount;
    }

    public Integer getId_query_installments() {
        return id_query_installments;
    }

    public void setId_query_installments(Integer id_query_installments) {
        this.id_query_installments = id_query_installments;
    }

    public ArrayList<DeferredPeriodsCompleteTransaction> getDeferred_periods() {
        return deferred_periods;
    }

    public void setDeferred_periods(ArrayList<DeferredPeriodsCompleteTransaction> deferred_periods) {
        this.deferred_periods = deferred_periods;
    }

    @Override
    public String toString() {
        return "QuotaCompleteTransactionResponse{" +
                "installments_amount='" + installments_amount + '\'' +
                ", id_query_installments=" + id_query_installments +
                ", deferred_periods=" + deferred_periods +
                '}';
    }
}

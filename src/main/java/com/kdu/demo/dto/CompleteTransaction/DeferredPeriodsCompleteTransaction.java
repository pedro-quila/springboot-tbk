package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;

public class DeferredPeriodsCompleteTransaction implements Serializable {

    private Integer amount;
    private Integer period;

    public DeferredPeriodsCompleteTransaction() {
    }

    public DeferredPeriodsCompleteTransaction(Integer amount, Integer period) {
        this.amount = amount;
        this.period = period;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "DeferredPeriodsCompleteTransaction{" +
                "amount=" + amount +
                ", period=" + period +
                '}';
    }
}

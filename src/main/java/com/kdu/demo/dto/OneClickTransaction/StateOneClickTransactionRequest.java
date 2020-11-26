package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class StateOneClickTransactionRequest implements Serializable {

    private String buy_order;

    public StateOneClickTransactionRequest() {
    }

    public StateOneClickTransactionRequest(String buy_order) {
        this.buy_order = buy_order;
    }

    public String getBuy_order() {
        return buy_order;
    }

    public void setBuy_order(String buy_order) {
        this.buy_order = buy_order;
    }

    @Override
    public String toString() {
        return "StateOneClickTransactionRequest{" +
                "buy_order='" + buy_order + '\'' +
                '}';
    }
}

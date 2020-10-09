package com.kdu.demo.dto;

import java.io.Serializable;

public class RequestInitTransaction implements Serializable {

    private int amount;
    private String sessionId;
    private String buyOrder;

    public RequestInitTransaction() {
    }

    public RequestInitTransaction(int amount, String sessionId, String buyOrder) {
        this.amount = amount;
        this.sessionId = sessionId;
        this.buyOrder = buyOrder;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getBuyOrder() {
        return buyOrder;
    }

    public void setBuyOrder(String buyOrder) {
        this.buyOrder = buyOrder;
    }

    @Override
    public String toString() {
        return "RequestInitTransaction{" +
                "amount=" + amount +
                ", sessionId='" + sessionId + '\'' +
                ", buyOrder='" + buyOrder + '\'' +
                '}';
    }
}

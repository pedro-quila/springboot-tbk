package com.kdu.demo.dto.NormalTransaction;

import java.io.Serializable;

public class DetailCardTransaction implements Serializable {

    private String card_number;

    public DetailCardTransaction(String card_number) {
        this.card_number = card_number;
    }

    public DetailCardTransaction() {
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    @Override
    public String toString() {
        return "DetailConfirmTransactionResponse{" +
                "card_number='" + card_number + '\'' +
                '}';
    }
}

package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class CardDetailOneClickTransaction implements Serializable {

    private String card_number;

    public CardDetailOneClickTransaction() {
    }

    public CardDetailOneClickTransaction(String card_number) {
        this.card_number = card_number;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    @Override
    public String toString() {
        return "CardDetailOneClickTransaction{" +
                "card_number='" + card_number + '\'' +
                '}';
    }
}

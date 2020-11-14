package com.kdu.demo.dto.CompleteTransaction;

import java.io.Serializable;

public class CardDetailCompleteTransaction implements Serializable {

    private String card_number;

    public CardDetailCompleteTransaction() {
    }

    public CardDetailCompleteTransaction(String card_number) {
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
        return "CardDetailCompleteTransaction{" +
                "card_number='" + card_number + '\'' +
                '}';
    }
}

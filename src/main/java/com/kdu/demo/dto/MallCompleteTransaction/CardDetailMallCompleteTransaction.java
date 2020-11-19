package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;

public class CardDetailMallCompleteTransaction implements Serializable {

    private String card_number;

    public CardDetailMallCompleteTransaction() {
    }

    public CardDetailMallCompleteTransaction(String card_number) {
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
        return "CardDetailMallComplete{" +
                "card_number='" + card_number + '\'' +
                '}';
    }
}

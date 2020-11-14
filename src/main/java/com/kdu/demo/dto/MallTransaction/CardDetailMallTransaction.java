package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;

public class CardDetailMallTransaction implements Serializable {

    private String card_number;

    public CardDetailMallTransaction() {
    }

    public CardDetailMallTransaction(String card_number) {
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
        return "DetailCardMallTransaction{" +
                "card_number='" + card_number + '\'' +
                '}';
    }
}

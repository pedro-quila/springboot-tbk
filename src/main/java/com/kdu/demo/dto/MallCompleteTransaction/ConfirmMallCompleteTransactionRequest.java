package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;
import java.util.ArrayList;

public class ConfirmMallCompleteTransactionRequest implements Serializable {

    private InitMallCompleteTransactionResponse token;
    private ArrayList<MallCompleteConfirmDetails> details;

    public ConfirmMallCompleteTransactionRequest() {
    }

    public ConfirmMallCompleteTransactionRequest(InitMallCompleteTransactionResponse token,
                                                 ArrayList<MallCompleteConfirmDetails> details) {
        this.token = token;
        this.details = details;
    }

    public InitMallCompleteTransactionResponse getToken() {
        return token;
    }

    public void setToken(InitMallCompleteTransactionResponse token) {
        this.token = token;
    }

    public ArrayList<MallCompleteConfirmDetails> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<MallCompleteConfirmDetails> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ConfirmMallCompleteTransactionRequest{" +
                "token='" + token + '\'' +
                ", details=" + details +
                '}';
    }
}

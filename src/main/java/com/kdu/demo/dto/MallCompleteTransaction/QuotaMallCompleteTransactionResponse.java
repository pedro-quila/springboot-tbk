package com.kdu.demo.dto.MallCompleteTransaction;

import java.io.Serializable;
import java.util.ArrayList;

public class QuotaMallCompleteTransactionResponse implements Serializable {

    private String installments_amount;
    private Integer id_query_installments;
    private ArrayList<DeferredPeriodsMallCompleteTransaction> deferred_periods;
}

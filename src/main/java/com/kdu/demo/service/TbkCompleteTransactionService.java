package com.kdu.demo.service;

import com.kdu.demo.dto.CompleteTransaction.*;

public interface TbkCompleteTransactionService {

    InitCompleteTransactionResponse initTransaction(InitCompleteTransactionRequest request);
    QuotaCompleteTransactionResponse quotaTransaction(QuotaCompleteTransactionRequest request);
    ConfirmCompleteTransactionResponse confirmTransaction(ConfirmCompleteTransactionRequest request);
    StateCompleteTransactionResponse stateTransaction(StateCompleteTransactionRequest request);
    RefundCompleteTransactionResponse refundTransaction(RefundCompleteTransactionRequest request);
}

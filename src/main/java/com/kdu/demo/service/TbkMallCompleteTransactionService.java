package com.kdu.demo.service;

import com.kdu.demo.dto.MallCompleteTransaction.*;

public interface TbkMallCompleteTransactionService {

    InitMallCompleteTransactionResponse initTransaction(InitMallCompleteTransactionRequest request);
    QuotaMallCompleteTransactionResponse quotaTransaction(QuotaMallCompleteTransactionRequest request);
    ConfirmMallCompleteTransactionResponse confirmTransaction(ConfirmMallCompleteTransactionRequest request);
    StateMallCompleteTransactionResponse stateTransaction(StateMallCompleteTransactionRequest request);
    RefundMallCompleteTransactionResponse refundTransaction(RefundMallCompleteTransactionRequest request);
}

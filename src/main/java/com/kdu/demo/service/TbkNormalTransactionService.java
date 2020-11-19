package com.kdu.demo.service;

import com.kdu.demo.dto.NormalTransaction.*;

public interface TbkNormalTransactionService {

    InitTransactionResponse initTransaction(InitTransactionRequest request);
    InitTransactionResponse initMensualTransaction(InitMensualTransactionRequest request);
    ConfirmTransactionResponse confirmTransaction(ConfirmTransactionRequest request);
    StateTransactionResponse transactionState(StateTransactionRequest request);
    RefundTransactionResponse refundTransaction(RefundTransactionRequest request);
}

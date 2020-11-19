package com.kdu.demo.service;

import com.kdu.demo.dto.MallTransaction.*;

public interface TbkMallTransactionService {

    InitMallTransactionResponse initTransaction(InitMallTransactionRequest request);
    ConfirmMallTransactionResponse confirmTransaction(ConfirmMallTransactionRequest request);
    StateMallTransactionResponse stateTransaction(StateMallTransactionRequest request);
    RefundMallTransactionResponse refundTransaction(RefundMallTransactionRequest request);

}

package com.kdu.demo.service;

import com.kdu.demo.dto.MallTransaction.*;

public interface TbkMallTransactionService {

    InitMallTransactionResponse initMallTransaction (InitMallTransactionRequest initMallTransactionRequest);
    ConfirmMallTransactionResponse confirmMallTransaction (ConfirmMallTransactionRequest confirmMallTransactionRequest);
    MallTransactionStateResponse mallTransactionState (MallTransactionStateRequest mallTransactionStateRequest);
    RefundMallTransactionResponse refundMallTransaction (RefundMallTransactionRequest refundMallTransactionRequest);
}

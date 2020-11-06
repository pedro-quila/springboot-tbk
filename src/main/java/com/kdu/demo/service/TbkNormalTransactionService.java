package com.kdu.demo.service;


import com.kdu.demo.dto.NormalTransaction.*;

public interface TbkNormalTransactionService {

    InitTransactionResponse initTransaction(InitTransactionRequest initTransactionRequest);
    InitTransactionResponse initMensualTransaction(InitMensualTransactionRequest initMensualTransactionRequest);
    ConfirmTransactionResponse confirmTransaction(ConfirmTransactionRequest confirmTransactionRequest);
}

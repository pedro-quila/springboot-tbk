package com.kdu.demo.service;


import com.kdu.demo.dto.InitTransactionRequest;
import com.kdu.demo.dto.InitTransactionResponse;

public interface TbkNormalTransactionService {

    InitTransactionResponse initTransaction(InitTransactionRequest initTransactionRequest);
}

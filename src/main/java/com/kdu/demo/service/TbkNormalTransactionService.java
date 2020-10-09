package com.kdu.demo.service;

import com.kdu.demo.dto.RequestInitTransaction;
import com.kdu.demo.dto.ResponseInitTransaction;

public interface TbkNormalTransactionService {

    ResponseInitTransaction initTransaction(RequestInitTransaction requestInitTransaction);
}

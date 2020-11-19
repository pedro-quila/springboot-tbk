package com.kdu.demo.service;

import com.kdu.demo.dto.CaptureTransaction.*;

public interface TbkCaptureTransactionService {

    CaptureTransactionResponse captureTransaction(CaptureTransactionRequest request);

}

package com.kdu.demo.service;

import com.kdu.demo.dto.OneClickTransaction.*;

public interface TbkOneClickTransactionService {

    InitOneClickInscriptionResponse initOCInscription (InitOneClickInscriptionRequest request);
    FinishOneClickInscriptionResponse finishOCInscription (FinishOneClickInscriptionRequest request);
    AuthorizeOneClickPaymentResponse authorizeOCPayment (AuthorizeOneClickPaymentRequest request);
    StateOneClickTransactionResponse stateOCTransaction (StateOneClickTransactionRequest request);
    RefundOneClickTransactionResponse refundOCTransaction (RefundOneClickTransactionRequest request);
    AuthorizeOneClickMulticodeResponse authorizeOCMulticode (AuthorizeOneClickMulticodeRequest request);
    StateOneClickMulticodeTransactionResponse stateOCMulticode (StateOneClickMulticodeTransactionRequest request);
    RefundOneClickMulticodeTransactionResponse refundOCMulticode (RefundOneClickMulticodeTransactionRequest request);
    DeleteOneClickUserResponse deleteUser (DeleteOneClickUserRequest request);
}

package com.kdu.demo.service.impl;

import com.kdu.demo.components.RequestDetails;
import com.kdu.demo.components.RestResponseErrorHandler;
import com.kdu.demo.components.TransbankRestClient;
import com.kdu.demo.dto.NormalTransaction.*;
import com.kdu.demo.service.TbkNormalTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class TbkNormalTransactionServiceImpl implements TbkNormalTransactionService {

    @Value("${urlTbkWebPay}")
    private String urlTbkWebPay;

    @Autowired
    private TransbankRestClient<InitTransactionRequest, InitTransactionResponse> transbankRestClientInitNormal;

    @Autowired
    private TransbankRestClient<InitMensualTransactionRequest, InitTransactionResponse> transbankRestClientInitMensual;

    @Autowired
    private TransbankRestClient<ConfirmTransactionRequest, ConfirmTransactionResponse> transbankRestClientConfirm;

    @Autowired
    private TransbankRestClient<TransactionStateRequest, TransactionStateResponse> transbankRestClientState;

    @Autowired
    private TransbankRestClient<RefundTransactionRequest, RefundTransactionResponse> transbankRestClientRefund;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    @Override
    public InitTransactionResponse initTransaction(InitTransactionRequest initTransactionRequest) {
        return transbankRestClientInitNormal.execute(
                new RequestDetails(
                        urlTbkWebPay,
                        HttpMethod.POST),
                initTransactionRequest,
                restResponseErrorHandler,
                InitTransactionResponse.class);
    }

    @Override
    public InitTransactionResponse initMensualTransaction(InitMensualTransactionRequest initMensualTransactionRequest) {
        return transbankRestClientInitMensual.execute(
                new RequestDetails(
                        urlTbkWebPay,
                        HttpMethod.POST),
                initMensualTransactionRequest,
                restResponseErrorHandler,
                InitTransactionResponse.class);
    }

    @Override
    public ConfirmTransactionResponse confirmTransaction(ConfirmTransactionRequest confirmTransactionRequest) {
        return transbankRestClientConfirm.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(confirmTransactionRequest.getToken()),
                        HttpMethod.PUT),
                confirmTransactionRequest,
                restResponseErrorHandler,
                ConfirmTransactionResponse.class);
    }

    @Override
    public TransactionStateResponse transactionState(TransactionStateRequest transactionStateRequest){
        return transbankRestClientState.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(transactionStateRequest.getToken()),
                        HttpMethod.GET),
                transactionStateRequest,
                restResponseErrorHandler,
                TransactionStateResponse.class);
    }

    @Override
    public RefundTransactionResponse refundTransaction(RefundTransactionRequest refundTransactionRequest){
        return transbankRestClientRefund.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(refundTransactionRequest.getToken()).concat("/refund"),
                        HttpMethod.PUT),
                refundTransactionRequest,
                restResponseErrorHandler,
                RefundTransactionResponse.class);
    }
}

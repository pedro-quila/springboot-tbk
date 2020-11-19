package com.kdu.demo.service.impl;

import com.kdu.demo.components.*;
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
    private TransbankRestClient<StateTransactionRequest, StateTransactionResponse> transbankRestStateClient;

    @Autowired
    private TransbankRestClient<RefundTransactionRequest, RefundTransactionResponse> transbankRestClientRefund;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    @Override
    public InitTransactionResponse initTransaction(InitTransactionRequest request) {
        return transbankRestClientInitNormal.execute(
                new RequestDetails(
                        urlTbkWebPay,
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                InitTransactionResponse.class);
    }

    @Override
    public InitTransactionResponse initMensualTransaction(InitMensualTransactionRequest request) {
        return transbankRestClientInitMensual.execute(
                new RequestDetails(
                        urlTbkWebPay,
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                InitTransactionResponse.class);
    }

    @Override
    public ConfirmTransactionResponse confirmTransaction(ConfirmTransactionRequest request) {
        return transbankRestClientConfirm.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(
                                request.getToken().getToken()),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                ConfirmTransactionResponse.class);
    }

    @Override
    public StateTransactionResponse transactionState(StateTransactionRequest request){
        return transbankRestStateClient.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(
                                request.getToken().getToken()),
                        HttpMethod.GET),
                request,
                restResponseErrorHandler,
                StateTransactionResponse.class);
    }

    @Override
    public RefundTransactionResponse refundTransaction(RefundTransactionRequest request){
        return transbankRestClientRefund.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(
                                request.getToken().getToken())
                                .concat("/refund"),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                RefundTransactionResponse.class);
    }
}

package com.kdu.demo.service.impl;

import com.kdu.demo.components.RequestDetails;
import com.kdu.demo.components.RestResponseErrorHandler;
import com.kdu.demo.components.TransbankRestClient;
import com.kdu.demo.dto.MallTransaction.*;
import com.kdu.demo.service.TbkMallTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class TbkMallTransactionServiceImpl implements TbkMallTransactionService {

    @Value("${urlTbkWebPay}")
    private String urlTbkWebPay;

    @Autowired
    private TransbankRestClient<InitMallTransactionRequest, InitMallTransactionResponse> restClientInitMall;

    @Autowired
    private TransbankRestClient<ConfirmMallTransactionRequest, ConfirmMallTransactionResponse> restClientConfirmMall;

    @Autowired
    private TransbankRestClient<MallTransactionStateRequest, MallTransactionStateResponse> restClientMallState;

    @Autowired
    private TransbankRestClient<RefundMallTransactionRequest, RefundMallTransactionResponse> restClientRefundMall;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    @Override
    public InitMallTransactionResponse initMallTransaction(
            InitMallTransactionRequest initMallTransactionRequest) {
        return restClientInitMall.execute(
                new RequestDetails(urlTbkWebPay, HttpMethod.POST),
                initMallTransactionRequest,
                restResponseErrorHandler,
                InitMallTransactionResponse.class);
    }

    @Override
    public ConfirmMallTransactionResponse confirmMallTransaction(
            ConfirmMallTransactionRequest confirmMallTransactionRequest) {
        return restClientConfirmMall.execute(
                new RequestDetails(urlTbkWebPay.concat(confirmMallTransactionRequest.getToken()), HttpMethod.PUT),
                confirmMallTransactionRequest,
                restResponseErrorHandler,
                ConfirmMallTransactionResponse.class);
    }

    @Override
    public MallTransactionStateResponse mallTransactionState(
            MallTransactionStateRequest mallTransactionStateRequest) {
        return restClientMallState.execute(
                new RequestDetails(urlTbkWebPay.concat(mallTransactionStateRequest.getToken()), HttpMethod.GET),
                mallTransactionStateRequest,
                restResponseErrorHandler,
                MallTransactionStateResponse.class);
    }

    @Override
    public RefundMallTransactionResponse refundMallTransaction(
            RefundMallTransactionRequest refundMallTransactionRequest) {
        return restClientRefundMall.execute(
                new RequestDetails(urlTbkWebPay.concat(
                        (refundMallTransactionRequest.getToken()).toString()).concat("/refund"), HttpMethod.PUT),
                refundMallTransactionRequest,
                restResponseErrorHandler,
                RefundMallTransactionResponse.class);
    }
}

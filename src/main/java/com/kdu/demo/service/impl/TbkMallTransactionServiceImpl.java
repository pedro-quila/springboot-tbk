package com.kdu.demo.service.impl;

import com.kdu.demo.components.*;
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
    private TransbankRestClient<StateMallTransactionRequest, StateMallTransactionResponse> restClientStateMall;

    @Autowired
    private TransbankRestClient<RefundMallTransactionRequest, RefundMallTransactionResponse> restClientRefundMall;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;


    @Override
    public InitMallTransactionResponse initTransaction(InitMallTransactionRequest request) {
        return restClientInitMall.execute(
                new RequestDetails(
                        urlTbkWebPay,
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                InitMallTransactionResponse.class);
    }

    @Override
    public ConfirmMallTransactionResponse confirmTransaction(ConfirmMallTransactionRequest request) {
        return restClientConfirmMall.execute(
                new RequestDetails(
                        urlTbkWebPay.concat("/"+request.getToken().getToken()),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                ConfirmMallTransactionResponse.class);
    }

    @Override
    public StateMallTransactionResponse stateTransaction(StateMallTransactionRequest request) {
        return restClientStateMall.execute(
                new RequestDetails(
                        urlTbkWebPay.concat("/"+request.getToken().getToken()),
                        HttpMethod.GET),
                request,
                restResponseErrorHandler,
                StateMallTransactionResponse.class);
    }

    @Override
    public RefundMallTransactionResponse refundTransaction(RefundMallTransactionRequest request) {
        return restClientRefundMall.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(
                                "/"+request.getToken().getToken())
                                .concat("/refund"),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                RefundMallTransactionResponse.class);
    }
}

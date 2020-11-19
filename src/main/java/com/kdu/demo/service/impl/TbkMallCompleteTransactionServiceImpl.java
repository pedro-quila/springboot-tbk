package com.kdu.demo.service.impl;

import com.kdu.demo.components.*;
import com.kdu.demo.dto.MallCompleteTransaction.*;
import com.kdu.demo.service.TbkMallCompleteTransactionService;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Service
public class TbkMallCompleteTransactionServiceImpl implements TbkMallCompleteTransactionService{

    @Value("${urlTbkWebPay}")
    private String urlTbkWebPay;

    @Autowired
    private TransbankRestClient<InitMallCompleteTransactionRequest, InitMallCompleteTransactionResponse>
            restClientInitMallComplete;

    @Autowired
    private TransbankRestClient<ConfirmMallCompleteTransactionRequest, ConfirmMallCompleteTransactionResponse>
            restClientConfirmMallComplete;

    @Autowired
    private TransbankRestClient<QuotaMallCompleteTransactionRequest, QuotaMallCompleteTransactionResponse>
            restClientQuotaMallComplete;

    @Autowired
    private TransbankRestClient<StateMallCompleteTransactionRequest, StateMallCompleteTransactionResponse>
            restClientStateMallComplete;

    @Autowired
    private TransbankRestClient<RefundMallCompleteTransactionRequest, RefundMallCompleteTransactionResponse>
            restClientRefundMallComplete;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    @Override
    public InitMallCompleteTransactionResponse initTransaction(InitMallCompleteTransactionRequest request){
        return restClientInitMallComplete.execute(
                new RequestDetails(
                        urlTbkWebPay,
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                InitMallCompleteTransactionResponse.class);
    }

    @Override
    public QuotaMallCompleteTransactionResponse quotaTransaction(QuotaMallCompleteTransactionRequest request) {
        return restClientQuotaMallComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(
                                request.getToken().getToken())
                                .concat("/installments"),
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                QuotaMallCompleteTransactionResponse.class);
    }

    @Override
    public ConfirmMallCompleteTransactionResponse confirmTransaction(ConfirmMallCompleteTransactionRequest request) {
        return restClientConfirmMallComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(
                                request.getToken().getToken()),
                                HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                ConfirmMallCompleteTransactionResponse.class);
    }

    @Override
    public StateMallCompleteTransactionResponse stateTransaction(StateMallCompleteTransactionRequest request) {
        return restClientStateMallComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(request.getToken().getToken()),
                        HttpMethod.GET),
                request,
                restResponseErrorHandler,
                StateMallCompleteTransactionResponse.class);
    }

    @Override
    public RefundMallCompleteTransactionResponse refundTransaction(RefundMallCompleteTransactionRequest request) {
        return restClientRefundMallComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(request.getBuy_order()),HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                RefundMallCompleteTransactionResponse.class);
    }
}

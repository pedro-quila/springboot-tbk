package com.kdu.demo.service.impl;

import com.kdu.demo.components.*;
import com.kdu.demo.dto.CompleteTransaction.*;
import com.kdu.demo.service.TbkCompleteTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class TbkCompleteTransactionServiceImpl implements TbkCompleteTransactionService {

    @Value("${urlTbkWebPay}")
    private String urlTbkWebPay;

    @Autowired
    private TransbankRestClient<InitCompleteTransactionRequest, InitCompleteTransactionResponse>
            restClientInitComplete;

    @Autowired
    private TransbankRestClient<QuotaCompleteTransactionRequest, QuotaCompleteTransactionResponse>
            restClientQuotaComplete;

    @Autowired
    private TransbankRestClient<ConfirmCompleteTransactionRequest, ConfirmCompleteTransactionResponse>
            restClientConfirmComplete;

    @Autowired
    private TransbankRestClient<StateCompleteTransactionRequest, StateCompleteTransactionResponse>
            restClientStateComplete;

    @Autowired
    private TransbankRestClient<RefundCompleteTransactionRequest, RefundCompleteTransactionResponse>
            restClientRefundComplete;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;


    @Override
    public InitCompleteTransactionResponse initTransaction(InitCompleteTransactionRequest request) {
        return restClientInitComplete.execute(
                new RequestDetails(
                        urlTbkWebPay,
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                InitCompleteTransactionResponse.class);
    }

    @Override
    public QuotaCompleteTransactionResponse quotaTransaction(QuotaCompleteTransactionRequest request) {
        return restClientQuotaComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(request.getToken().getToken())
                                .concat("/installments"),
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                QuotaCompleteTransactionResponse.class);
    }

    @Override
    public ConfirmCompleteTransactionResponse confirmTransaction(ConfirmCompleteTransactionRequest request) {
        return restClientConfirmComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(request.getToken().getToken()),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                ConfirmCompleteTransactionResponse.class);
    }

    @Override
    public StateCompleteTransactionResponse stateTransaction(StateCompleteTransactionRequest request) {
        return restClientStateComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(request.getToken().getToken()),
                        HttpMethod.GET),
                request,
                restResponseErrorHandler,
                StateCompleteTransactionResponse.class);
    }

    @Override
    public RefundCompleteTransactionResponse refundTransaction(RefundCompleteTransactionRequest request) {
        return restClientRefundComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(request.getToken().getToken()).
                                concat("/refund"),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                RefundCompleteTransactionResponse.class);
    }
}

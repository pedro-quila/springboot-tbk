package com.kdu.demo.service.impl;

import com.kdu.demo.components.RequestDetails;
import com.kdu.demo.components.RestResponseErrorHandler;
import com.kdu.demo.components.TransbankRestClient;
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
    private TransbankRestClient<InitCompleteTransactionRequest, InitCompleteTransactionResponse> restClientInitComplete;

    @Autowired
    private TransbankRestClient<QuotaCompleteTransactionRequest, QuotaCompleteTransactionResponse> restClientQuotaComplete;

    @Autowired
    private TransbankRestClient<ConfirmCompleteTransactionRequest, ConfirmCompleteTransactionResponse> restClientConfirmComplete;

    @Autowired
    private TransbankRestClient<CompleteTransactionStateRequest, CompleteTransactionStateResponse> restClientCompleteState;

    @Autowired
    private TransbankRestClient<RefundCompleteTransactionRequest, RefundCompleteTransactionResponse> restClientRefundComplete;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    @Override
    public InitCompleteTransactionResponse initCompleteTransaction(
            InitCompleteTransactionRequest initCompleteTransactionRequest) {
        return restClientInitComplete.execute(
                new RequestDetails(urlTbkWebPay,
                        HttpMethod.POST),
                initCompleteTransactionRequest,
                restResponseErrorHandler,
                InitCompleteTransactionResponse.class);
    }

    @Override
    public QuotaCompleteTransactionResponse quotaCompleteTransaction(
            QuotaCompleteTransactionRequest quotaCompleteTransactionRequest) {
        return restClientQuotaComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(quotaCompleteTransactionRequest.getToken()).concat("/installments"),
                        HttpMethod.POST),
                quotaCompleteTransactionRequest,
                restResponseErrorHandler,
                QuotaCompleteTransactionResponse.class);
    }

    @Override
    public ConfirmCompleteTransactionResponse confirmCompleteTransaction(
            ConfirmCompleteTransactionRequest confirmCompleteTransactionRequest) {
        return restClientConfirmComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(confirmCompleteTransactionRequest.getToken()),
                        HttpMethod.PUT),
                confirmCompleteTransactionRequest,
                restResponseErrorHandler,
                ConfirmCompleteTransactionResponse.class);
    }

    @Override
    public CompleteTransactionStateResponse completeTransactionState(
            CompleteTransactionStateRequest completeTransactionStateRequest) {
        return restClientCompleteState.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(completeTransactionStateRequest.getToken()),
                        HttpMethod.GET),
                completeTransactionStateRequest,
                restResponseErrorHandler,
                CompleteTransactionStateResponse.class);
    }

    @Override
    public RefundCompleteTransactionResponse refundCompleteTransaction(
            RefundCompleteTransactionRequest refundCompleteTransactionRequest) {
        return restClientRefundComplete.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(refundCompleteTransactionRequest.getToken()).concat("/refund"),
                        HttpMethod.PUT),
                refundCompleteTransactionRequest,
                restResponseErrorHandler,
                RefundCompleteTransactionResponse.class);
    }
}

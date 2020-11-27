package com.kdu.demo.service.impl;

import com.kdu.demo.components.RequestDetails;
import com.kdu.demo.components.RestResponseErrorHandler;
import com.kdu.demo.components.TransbankRestClient;
import com.kdu.demo.dto.OneClickTransaction.*;
import com.kdu.demo.service.TbkOneClickTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class TbkOneClickTransactionServiceImpl implements TbkOneClickTransactionService {

    @Value("${urlTbkOneClickI}")
    private String urlTbkOneClickI;

    @Value("${urlTbkOneClickT}")
    private String urlTbkOneClickT;

    @Autowired
    private TransbankRestClient<InitOneClickInscriptionRequest, InitOneClickInscriptionResponse>
            restClientInitOCInscription;

    @Autowired
    private TransbankRestClient<FinishOneClickInscriptionRequest, FinishOneClickInscriptionResponse>
            restClientFinishOCInscription;

    @Autowired
    private TransbankRestClient<AuthorizeOneClickPaymentRequest, AuthorizeOneClickPaymentResponse>
            restClientAuthorizeOCPayment;

    @Autowired
    private TransbankRestClient<StateOneClickTransactionRequest, StateOneClickTransactionResponse>
            restClientStateOCTransaction;

    @Autowired
    private TransbankRestClient<RefundOneClickTransactionRequest, RefundOneClickTransactionResponse>
            restClientRefundOCTransaction;

    @Autowired
    private TransbankRestClient<AuthorizeOneClickMulticodeRequest, AuthorizeOneClickMulticodeResponse>
            restClientAuthorizeOCMulticode;

    @Autowired
    private TransbankRestClient<StateOneClickMulticodeTransactionRequest, StateOneClickMulticodeTransactionResponse>
            restClientStateOCMulticode;

    @Autowired
    private TransbankRestClient<RefundOneClickMulticodeTransactionRequest, RefundOneClickMulticodeTransactionResponse>
            restClientRefundOCMulticode;

    @Autowired
    private TransbankRestClient<DeleteOneClickUserRequest, DeleteOneClickUserResponse> restClientDeleteUserOC;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    @Override
    public InitOneClickInscriptionResponse initOCInscription(InitOneClickInscriptionRequest request) {
        return restClientInitOCInscription.execute(
                new RequestDetails(
                        urlTbkOneClickI,
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                InitOneClickInscriptionResponse.class);
    }

    @Override
    public FinishOneClickInscriptionResponse finishOCInscription(FinishOneClickInscriptionRequest request) {
        return restClientFinishOCInscription.execute(
                new RequestDetails(
                        urlTbkOneClickI.concat("/"+request.getToken()),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                FinishOneClickInscriptionResponse.class);
    }

    @Override
    public AuthorizeOneClickPaymentResponse authorizeOCPayment(AuthorizeOneClickPaymentRequest request) {
        return restClientAuthorizeOCPayment.execute(
                new RequestDetails(
                        urlTbkOneClickT,
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                AuthorizeOneClickPaymentResponse.class);
    }

    @Override
    public StateOneClickTransactionResponse stateOCTransaction(StateOneClickTransactionRequest request) {
        return restClientStateOCTransaction.execute(
                new RequestDetails(
                        urlTbkOneClickT.concat("/"+request.getBuy_order()),
                        HttpMethod.GET),
                request,
                restResponseErrorHandler,
                StateOneClickTransactionResponse.class);
    }

    @Override
    public RefundOneClickTransactionResponse refundOCTransaction(RefundOneClickTransactionRequest request) {
        return restClientRefundOCTransaction.execute(
                new RequestDetails(
                        urlTbkOneClickT.concat("/"+request.getBuy_order()).concat("/refund"),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                RefundOneClickTransactionResponse.class);
    }

    @Override
    public AuthorizeOneClickMulticodeResponse authorizeOCMulticode(AuthorizeOneClickMulticodeRequest request) {
        return restClientAuthorizeOCMulticode.execute(
                new RequestDetails(
                        urlTbkOneClickT,
                        HttpMethod.POST),
                request,
                restResponseErrorHandler,
                AuthorizeOneClickMulticodeResponse.class);
    }

    @Override
    public StateOneClickMulticodeTransactionResponse stateOCMulticode(StateOneClickMulticodeTransactionRequest request) {
        return restClientStateOCMulticode.execute(
                new RequestDetails(
                        urlTbkOneClickT.concat("/"+request.getBuy_order()),
                        HttpMethod.GET),
                request,
                restResponseErrorHandler,
                StateOneClickMulticodeTransactionResponse.class);
    }

    @Override
    public RefundOneClickMulticodeTransactionResponse refundOCMulticode(RefundOneClickMulticodeTransactionRequest request) {
        return restClientRefundOCMulticode.execute(
                new RequestDetails(
                        urlTbkOneClickT.concat(
                                "/"+request.getDetail_buy_order())
                                .concat("/refund"),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                RefundOneClickMulticodeTransactionResponse.class);
    }

    @Override
    public DeleteOneClickUserResponse deleteUser(DeleteOneClickUserRequest request) {
        return restClientDeleteUserOC.execute(
                new RequestDetails(
                        urlTbkOneClickI,
                        HttpMethod.DELETE),
                request,
                restResponseErrorHandler,
                DeleteOneClickUserResponse.class);
    }
}

package com.kdu.demo.service.impl;

import com.kdu.demo.components.RequestDetails;
import com.kdu.demo.components.RestResponseErrorHandler;
import com.kdu.demo.components.TransbankRestClient;
import com.kdu.demo.dto.*;
import com.kdu.demo.service.TbkNormalTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class TbkNormalTransactionServiceImpl implements TbkNormalTransactionService {


    @Value("${initPost}")
    private String urlInitPost;

    @Value("${confPut}")
    private String urlConfirmPut;

    @Autowired
    private TransbankRestClient<ConfirmTransactionRequest, ConfirmTransactionResponse> transbankRestClientConfirm;

    @Autowired
    private TransbankRestClient<InitTransactionRequest, InitTransactionResponse> transbankRestClientInit;

    @Autowired
    private TransbankRestClient<InitMensualTransactionRequest, InitTransactionResponse> transbankRestClientInitMensual;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    @Override
    public InitTransactionResponse initTransaction(InitTransactionRequest initTransactionRequest) {

            return transbankRestClientInit.execute(
                    new RequestDetails
                            (urlInitPost,HttpMethod.POST), initTransactionRequest, restResponseErrorHandler,
                    InitTransactionResponse.class);

    }

    @Override
    public InitTransactionResponse initMensualTransaction(InitMensualTransactionRequest initMensualTransactionRequest) {

        return transbankRestClientInitMensual.execute(
                new RequestDetails
                        (urlInitPost,HttpMethod.POST), initMensualTransactionRequest, restResponseErrorHandler,
                InitTransactionResponse.class);

    }

    @Override
    public ConfirmTransactionResponse confirmTransaction(ConfirmTransactionRequest confirmTransactionRequest) {
            return transbankRestClientConfirm.execute(
                    new RequestDetails
                            (urlConfirmPut.concat(confirmTransactionRequest.getToken()),
                                    HttpMethod.POST), confirmTransactionRequest, restResponseErrorHandler, ConfirmTransactionResponse.class);

    }
}

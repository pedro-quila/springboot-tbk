package com.kdu.demo.service.impl;

import com.kdu.demo.components.RequestDetails;
import com.kdu.demo.components.RestResponseErrorHandler;
import com.kdu.demo.components.TransbankRestClient;
import com.kdu.demo.dto.ConfirmTransactionRequest;
import com.kdu.demo.dto.ConfirmTransactionResponse;
import com.kdu.demo.dto.InitTransactionRequest;
import com.kdu.demo.dto.InitTransactionResponse;
import com.kdu.demo.service.TbkNormalTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TbkNormalTransactionServiceImpl implements TbkNormalTransactionService {

    Logger logger = LoggerFactory.getLogger(TbkNormalTransactionServiceImpl.class);

    @Value("${initPost}")
    private String urlInitPost;

    @Value("${confPut}")
    private String urlConfirmPut;

    @Autowired
    private TransbankRestClient<ConfirmTransactionRequest, ConfirmTransactionResponse> transbankRestClientConfirm;

    @Autowired
    private TransbankRestClient<InitTransactionRequest, InitTransactionResponse> transbankRestClientInit;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    @Override
    public InitTransactionResponse initTransaction(InitTransactionRequest initTransactionRequest) {
        try {
            return transbankRestClientInit.execute(
                    new RequestDetails
                            (urlInitPost,HttpMethod.POST), initTransactionRequest, restResponseErrorHandler,
                    InitTransactionResponse.class);
        } catch (Exception e) {
            logger.error("Excepcion ", e);
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Falla al iniciar init transaction", e);
        }
    }

    @Override
    public ConfirmTransactionResponse confirmTransaction(ConfirmTransactionRequest confirmTransactionRequest) {
        try {
            return transbankRestClientConfirm.execute(
                    new RequestDetails
                            (urlConfirmPut.concat(confirmTransactionRequest.getToken()),
                                    HttpMethod.POST), confirmTransactionRequest, restResponseErrorHandler, ConfirmTransactionResponse.class);
        } catch (Exception e) {
            logger.error("Excepcion ", e);
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Falla al iniciar init transaction", e);
        }
    }
}

package com.kdu.demo.service.impl;

import com.kdu.demo.components.RequestDetails;
import com.kdu.demo.components.RestResponseErrorHandler;
import com.kdu.demo.components.TransbankRestClient;
import com.kdu.demo.dto.InitTransactionRequest;
import com.kdu.demo.dto.InitTransactionResponse;
import com.kdu.demo.service.TbkNormalTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TbkNormalTransactionServiceImpl implements TbkNormalTransactionService {

    Logger logger = LoggerFactory.getLogger(TbkNormalTransactionServiceImpl.class);

    @Autowired
    private TransbankRestClient<InitTransactionRequest, InitTransactionResponse> transbankRestClient;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    @Override
    public InitTransactionResponse initTransaction(InitTransactionRequest initTransactionRequest) {
        try {
            return transbankRestClient.execute(
                    new RequestDetails
                            ("https://webpay3gint.transbank.cl/rswebpaytransaction/api/webpay/v1/init_transaction",
                                    HttpMethod.POST), initTransactionRequest, restResponseErrorHandler, InitTransactionResponse.class);
        } catch (Exception e) {
            logger.error("Excepcion ", e);
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Falla al iniciar init transaction", e);
        }
    }
}

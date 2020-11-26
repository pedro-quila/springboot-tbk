package com.kdu.demo.service.impl;

import com.kdu.demo.components.*;
import com.kdu.demo.dto.CaptureTransaction.*;
import com.kdu.demo.service.TbkCaptureTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class TbkCaptureTransactionServiceImpl implements TbkCaptureTransactionService {

    @Value("${urlTbkWebPay}")
    private String urlTbkWebPay;

    @Autowired
    TransbankRestClient<CaptureTransactionRequest, CaptureTransactionResponse> restClientCapture;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    //corregir concatenación
    @Override
    public CaptureTransactionResponse captureTransaction(CaptureTransactionRequest request){
        return restClientCapture.execute(
                new RequestDetails(
                        urlTbkWebPay.concat(request.getAuthorization_code()),
                        HttpMethod.PUT),
                request,
                restResponseErrorHandler,
                CaptureTransactionResponse.class);

    }
}

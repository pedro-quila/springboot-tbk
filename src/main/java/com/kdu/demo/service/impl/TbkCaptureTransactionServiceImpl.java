package com.kdu.demo.service.impl;

import com.kdu.demo.components.RequestDetails;
import com.kdu.demo.components.RestResponseErrorHandler;
import com.kdu.demo.components.TransbankRestClient;
import com.kdu.demo.dto.Capture.CaptureTransactionRequest;
import com.kdu.demo.dto.Capture.CaptureTransactionResponse;
import com.kdu.demo.service.TbkCaptureTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class TbkCaptureTransactionServiceImpl implements TbkCaptureTransactionService {

    @Value("${putCapture}")
    private String urlCapturePut;

    @Autowired
    TransbankRestClient<CaptureTransactionRequest, CaptureTransactionResponse> transbankRestClientCapture;

    @Autowired
    private RestResponseErrorHandler restResponseErrorHandler;

    //corregir concatenación
    @Override
    public CaptureTransactionResponse captureTransaction(CaptureTransactionRequest captureTransactionRequest){
        return transbankRestClientCapture.execute(
                new RequestDetails(urlCapturePut.concat(
                        captureTransactionRequest.getAuthorization_code()),
                        HttpMethod.PUT),
                captureTransactionRequest,
                restResponseErrorHandler,
                CaptureTransactionResponse.class);

    }
}

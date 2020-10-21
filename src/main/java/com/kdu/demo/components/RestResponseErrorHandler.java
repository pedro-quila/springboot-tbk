package com.kdu.demo.components;

import com.kdu.demo.controller.TbkNormalTransactionController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.server.ResponseStatusException;


import java.io.IOException;

@Component
public class RestResponseErrorHandler implements ResponseErrorHandler {

    Logger logger = LoggerFactory.getLogger(RestResponseErrorHandler.class);

    @Override
    public boolean hasError(ClientHttpResponse httpResponse)
            throws IOException {

        return (
                httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR
                        || httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR);
    }

    @Override
    public void handleError(ClientHttpResponse httpResponse)
            throws IOException {

        if (httpResponse.getStatusCode()
                .series() == HttpStatus.Series.SERVER_ERROR) {
            logger.error("Falla al iniciar transaccion, server error");
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Falla al iniciar init transaction, server error");
            // handle SERVER_ERROR
        } else if (httpResponse.getStatusCode()
                .series() == HttpStatus.Series.CLIENT_ERROR) {
            
            // handle CLIENT_ERROR
            if (httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
                logger.error("Falla al iniciar transaccion, not found");
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Falla al iniciar init transaction, not found");
            }

            // handle CLIENT_ERROR
            if (httpResponse.getStatusCode() == HttpStatus.UNAUTHORIZED) {
                logger.error("Error en autenticación, unauthorized");
                throw new ResponseStatusException(
                        HttpStatus.UNAUTHORIZED, "Error en autenticación");
            }
        }
    }
}

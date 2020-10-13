package com.kdu.demo.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@Component
public class TransbankRestClient<T, V> {

    @Value("${apikey}")
    private String APIKEY;

    @Value("${secret}")
    private String SECRET;

    private final RestTemplate restTemplate = new RestTemplate();

    public V execute(RequestDetails requestDetails, T requestClass, ResponseErrorHandler errorHandler, Class<V> responseClass) {

            restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
            restTemplate.setErrorHandler(errorHandler);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Tbk-Api-Key-Id", APIKEY);
            headers.add("Tbk-Api-Key-Secret", SECRET);
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<T> entity = new HttpEntity<T>(requestClass, headers);
            ResponseEntity<V> response = restTemplate.exchange(requestDetails.getUrl(), requestDetails.getRequestType(),
                    entity, responseClass);
            return response.getBody();
        }
    }



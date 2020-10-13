package com.kdu.demo.components;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@Component
public class TransbankRestClient<T, V> {

        private final RestTemplate restTemplate = new RestTemplate();


        public V execute(RequestDetails requestDetails, T requestClass, ResponseErrorHandler errorHandler, Class<V> responseClass) {

            restTemplate.setErrorHandler(errorHandler);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Tbk-Api-Key-Id", "597026007976");
            headers.add("Tbk-Api-Key-Secret", "asdsadasdasdsad");
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<T> entity = new HttpEntity<T>(requestClass, headers);
            ResponseEntity<V> response = restTemplate.exchange(requestDetails.getUrl(), requestDetails.getRequestType(),
                    entity, responseClass);
            return response.getBody();
        }
    }



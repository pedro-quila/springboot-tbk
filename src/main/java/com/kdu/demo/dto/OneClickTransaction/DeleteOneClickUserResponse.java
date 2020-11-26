package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class DeleteOneClickUserResponse implements Serializable {

    private Integer http_status_code;

    public DeleteOneClickUserResponse() {
    }

    public DeleteOneClickUserResponse(Integer http_status_code) {
        this.http_status_code = http_status_code;
    }

    public Integer getHttp_status_code() {
        return http_status_code;
    }

    public void setHttp_status_code(Integer http_status_code) {
        this.http_status_code = http_status_code;
    }

    @Override
    public String toString() {
        return "DeleteOneClickUserResponse{" +
                "http_status_code=" + http_status_code +
                '}';
    }
}

package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class InitOneClickInscriptionRequest implements Serializable {

    private String username;
    private String email;
    private String response_url;

    public InitOneClickInscriptionRequest() {
    }

    public InitOneClickInscriptionRequest(String username, String email, String response_url) {
        this.username = username;
        this.email = email;
        this.response_url = response_url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResponse_url() {
        return response_url;
    }

    public void setResponse_url(String response_url) {
        this.response_url = response_url;
    }

    @Override
    public String toString() {
        return "InitSubscription{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", response_url='" + response_url + '\'' +
                '}';
    }
}

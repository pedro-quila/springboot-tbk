package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class DeleteOneClickUserRequest implements Serializable {

    private String tbk_user;
    private String username;

    public DeleteOneClickUserRequest() {
    }

    public DeleteOneClickUserRequest(String tbk_user, String username) {
        this.tbk_user = tbk_user;
        this.username = username;
    }

    public String getTbk_user() {
        return tbk_user;
    }

    public void setTbk_user(String tbk_user) {
        this.tbk_user = tbk_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "DeleteOneClickUserRequest{" +
                "tbk_user='" + tbk_user + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

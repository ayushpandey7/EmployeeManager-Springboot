package com.test.employeemanager.model;

import io.jsonwebtoken.Claims;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    private final String status;
    private final String jwt;
    private final Claims data;


    public AuthenticationResponse(String status, String jwt, Claims data) {
        this.status = status;
        this.jwt = jwt;
        this.data = data;
    }

    public String getJwt() {
        return jwt;
    }

    public String getStatus(){
        return status;
    }

    public Claims getData(){
        return data;
    }
}

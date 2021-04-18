package com.test.employeemanager.model;

public class FailureAuthenticationResponse {

    private final String status;
    private final String reason;

    public FailureAuthenticationResponse(String status, String reason) {
        this.status = status;
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }
}

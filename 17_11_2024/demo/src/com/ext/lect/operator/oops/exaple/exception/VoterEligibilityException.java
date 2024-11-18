package com.ext.lect.operator.oops.exaple.exception;

public class VoterEligibilityException extends RuntimeException{//unched
    private int statusCode;  //100, 200, 300

    //age issue 100, age<10, 10-16> 200, 16-18>300
    public VoterEligibilityException(String message) {
        super(message);

    }

    public VoterEligibilityException(String message, int statusCode) {
        this(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}

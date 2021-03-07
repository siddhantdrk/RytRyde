package com.example.rytryde.data.model;

public class Login {
    private Boolean success;
    private LoggedInUser data ;
    private String message;

    public LoggedInUser getData() {
        return data;
    }

    public void setData(LoggedInUser data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

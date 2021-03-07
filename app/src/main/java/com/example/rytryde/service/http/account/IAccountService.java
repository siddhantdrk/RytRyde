package com.example.rytryde.service.http.account;

import okhttp3.Response;

public interface IAccountService {

    Response login(String email, String password);
}

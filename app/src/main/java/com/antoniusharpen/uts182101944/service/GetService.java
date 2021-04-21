package com.antoniusharpen.uts182101944.service;

import com.antoniusharpen.uts182101944.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}

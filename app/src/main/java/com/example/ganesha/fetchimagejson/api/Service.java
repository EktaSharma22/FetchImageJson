package com.example.ganesha.fetchimagejson.api;

import com.example.ganesha.fetchimagejson.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

  //  @GET("/search/users?q=tom+repos:>42+followers:>1000")
    Call<ItemResponse> getItems();
}

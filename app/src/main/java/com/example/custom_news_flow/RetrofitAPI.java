package com.example.custom_news_flow;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET
    Call<NewsModal> getAllNews(@Url String url);
    @GET
    Call<NewsModal> grtNewsByCategory(@Url String url);
}

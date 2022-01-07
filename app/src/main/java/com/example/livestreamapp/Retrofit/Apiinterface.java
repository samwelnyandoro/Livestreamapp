package com.example.livestreamapp.Retrofit;


import static com.example.livestreamapp.Retrofit.RetrofitClient.BASE_URL;

import android.database.Observable;

import com.example.livestreamapp.Model.AllCategory;

import java.util.List;

import retrofit2.http.GET;


public interface Apiinterface {
    @GET(BASE_URL)
    Observable<List<AllCategory>> getAllCategoryMovies();
}

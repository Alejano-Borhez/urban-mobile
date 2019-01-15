package com.urbantrans.http;

import com.urbantrans.model.dto.RouteDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IRouteRetrofitClient {
    @GET("/route/all")
    Call<List<RouteDTO>> getAllRoutes();
}

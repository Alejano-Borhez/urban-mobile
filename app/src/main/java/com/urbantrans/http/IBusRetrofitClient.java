package com.urbantrans.http;

import com.urbantrans.model.dto.BusDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IBusRetrofitClient {
    @GET("/bus/all")
    Call<List<BusDTO>> getAllBuses();
}

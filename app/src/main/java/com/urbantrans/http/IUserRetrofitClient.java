package com.urbantrans.http;

import com.urbantrans.model.dto.UserDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IUserRetrofitClient {
    @GET("/mobile/user/login/{userName}")
    Call<UserDTO> getUserLogin(@Path("userName") String userName);
}

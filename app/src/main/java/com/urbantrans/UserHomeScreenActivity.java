package com.urbantrans;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.urbantrans.http.IBusRetrofitClient;
import com.urbantrans.http.IRouteRetrofitClient;
import com.urbantrans.http.RetrofitSingleton;
import com.urbantrans.model.dto.BusDTO;
import com.urbantrans.model.dto.RouteDTO;

import java.util.List;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.urbantrans.Login.LOGIN;

public class UserHomeScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home_screen);
        UUID loggedInUserId = (UUID) getIntent().getSerializableExtra(LOGIN);

        TextView textViewLogin = findViewById(R.id.current_user_login);
        textViewLogin.setText(loggedInUserId.toString());

        IBusRetrofitClient busClient = RetrofitSingleton.INSTANCE().getClient(IBusRetrofitClient.class);
        IRouteRetrofitClient routeClient = RetrofitSingleton.INSTANCE().getClient(IRouteRetrofitClient.class);

        Call<List<BusDTO>> allBusesCall = busClient.getAllBuses();
        Call<List<RouteDTO>> allRoutesCall = routeClient.getAllRoutes();

        allBusesCall.enqueue(getBusResponseCallback());
        allRoutesCall.enqueue(getRouteResponseCallback());
    }

    @NonNull
    private Callback<List<BusDTO>> getBusResponseCallback() {
        return new Callback<List<BusDTO>>() {
            @Override
            public void onResponse(Call<List<BusDTO>> call, Response<List<BusDTO>> response) {

            }

            @Override
            public void onFailure(Call<List<BusDTO>> call, Throwable t) {

            }
        };
    }

    @NonNull
    private Callback<List<RouteDTO>> getRouteResponseCallback() {
        return new Callback<List<RouteDTO>>() {
            @Override
            public void onResponse(Call<List<RouteDTO>> call, Response<List<RouteDTO>> response) {

            }

            @Override
            public void onFailure(Call<List<RouteDTO>> call, Throwable t) {

            }
        };
    }

}

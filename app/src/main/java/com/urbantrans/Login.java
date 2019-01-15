package com.urbantrans;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.urbantrans.http.IUserRetrofitClient;
import com.urbantrans.http.RetrofitSingleton;
import com.urbantrans.model.dto.UserDTO;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static java.util.Optional.ofNullable;

public class Login extends AppCompatActivity {
    public static final String LOGIN = "com.urbantrans.login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String usedLogin = getIntent().getStringExtra(LOGIN);
        EditText loginInput = findViewById(R.id.login_input);
        loginInput.setText(usedLogin);
    }

    public void doLogin(View view) throws IOException {
        IUserRetrofitClient userClient = RetrofitSingleton.INSTANCE().getClient(IUserRetrofitClient.class);
        Call<UserDTO> userLogin = userClient.getUserLogin(prepareUserRequest());
        Response<UserDTO> userDTOResponse = userLogin.execute();
        if (userDTOResponse.isSuccessful()) {
            Intent homeScreenActivity = new Intent(this, UserHomeScreenActivity.class);

            homeScreenActivity.putExtra(LOGIN, extractLogin(userDTOResponse));
            startActivity(homeScreenActivity);
        }
    }

    @Nullable
    private String extractLogin(Response<UserDTO> userDTOResponse) {
        return ofNullable(userDTOResponse).map(Response::body).map(UserDTO::getUserName).orElse(null);
    }

    private String prepareUserRequest() {
        EditText loginInputText = findViewById(R.id.login_input);
        return loginInputText.getText().toString();
    }

}

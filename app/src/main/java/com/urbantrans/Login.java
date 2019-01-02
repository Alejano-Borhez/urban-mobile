package com.urbantrans;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.urbantrans.http.IUserRetrofitClient;
import com.urbantrans.http.RetrofitSingleton;
import com.urbantrans.model.dto.UserDTO;

import java.util.HashMap;

public class Login extends AppCompatActivity {
    public static final String LOGIN = "com.urbantrans.login";
    public static final String MOBILE_USER_LOGIN = "mobile/user/login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String usedLogin = getIntent().getStringExtra(LOGIN);
        EditText loginInput = findViewById(R.id.login_input);
        loginInput.setText(usedLogin);
    }



    public void doLogin(View view) {
        IUserRetrofitClient userClient = RetrofitSingleton.INSTANCE().getClient(IUserRetrofitClient.class);
        userClient.getUserLogin()
    }

    private GsonRequest<UserDTO> prepareUserRequest() {
        EditText loginInputText = findViewById(R.id.login_input);
        String login = loginInputText.getText().toString();

        return new GsonRequest<>(Request.Method.GET, getLoginUrlSegment(login), UserDTO.class, new HashMap<String, String>(),
                getLoginResponseListener(this), new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("LOGIN", "");
            }
        });
    }

    @NonNull
    private String getLoginUrlSegment(String login) {
        Uri.Builder builder = new Uri.Builder();
        return MOBILE_USER_LOGIN + builder.appendPath(login).toString();
    }

    private Response.Listener<UserDTO> getLoginResponseListener(final Login login) {
        return new Response.Listener<UserDTO>() {
            @Override
            public void onResponse(UserDTO response) {
                Intent loginIntent = new Intent(login, UserHomeScreenActivity.class);
                loginIntent.putExtra(LOGIN, response.getId());
                startActivity(loginIntent);
            }
        };
    }
}

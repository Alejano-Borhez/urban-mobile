package com.urbantrans;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.urbantrans.http.RetrofitSingleton;
import com.urbantrans.model.dto.BillDTO;
import com.urbantrans.model.view.LatestBillView;
import com.urbantrans.model.view.UserRideView;

import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

import static com.urbantrans.Login.LOGIN;

public class UserHomeScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home_screen);
        UUID loggedInUserId = (UUID) getIntent().getSerializableExtra(LOGIN);

        TextView textViewLogin = findViewById(R.id.current_user_login);
        textViewLogin.setText(loggedInUserId.toString());

        RequestQueue requestQueue = RetrofitSingleton.INSTANCE(this).getRetrofit();

        GsonRequest<UserRideView> request = new GsonRequest<>(Request.Method.GET,
                "mobile/user/bills/" + loggedInUserId.toString(),
                UserRideView.class, new HashMap<String,String>(),
                getUserRidesViewResponseListener(), new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("ABC", "dsf");
            }
        });

        requestQueue.add(request);
    }

    @NonNull
    private Response.Listener<UserRideView> getUserRidesViewResponseListener() {
        return new Response.Listener<UserRideView>() {
            @Override
            public void onResponse(UserRideView response) {
                TableLayout tableLayout = UserHomeScreenActivity.this.findViewById(R.id.latest_rides);
                for (LatestBillView rawBill : response.getLatestBills()) {
                    BillDTO bill = rawBill.getBill();
                    View billRow = LayoutInflater.from(UserHomeScreenActivity.this).inflate(R.layout.activity_user_home_screen, null, false);
                    TextView billDate = billRow.findViewById(R.id.bill_date);
                    TextView billBusStopBegin = billRow.findViewById(R.id.bill_bus_stop_begin);
                    TextView billBusStopEnd = billRow.findViewById(R.id.bill_bus_stop_end);
                    TextView billAmount = billRow.findViewById(R.id.bill_amount);

                    billDate.setText(bill.getTimeStamp().toString());
                    billBusStopBegin.setText(rawBill.getBusStopBegin().getDescription());
                    billBusStopEnd.setText(rawBill.getBusStopEnd().getDescription());
                    Currency usd = Currency.getInstance("USD");
                    billAmount.setText(String.format(Locale.US, "%1$,.2f %2$s", bill.getAmount().doubleValue(), usd));
                    tableLayout.addView(billRow);
                }

            }
        };
    }

}

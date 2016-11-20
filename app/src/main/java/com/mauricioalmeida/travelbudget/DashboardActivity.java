package com.mauricioalmeida.travelbudget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    private TextView travelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        travelList = (TextView) findViewById(R.id.lbl_my_travels);

        travelList.setOnClickListener(onClickTravelList());
    }

    private View.OnClickListener onClickTravelList() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, TravelsActivity.class);
                startActivity(intent);
            }
        };
    }
}

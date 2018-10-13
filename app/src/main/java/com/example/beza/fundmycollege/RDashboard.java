package com.example.beza.fundmycollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdashboard);
        Button jCompleted = (Button)findViewById(R.id.JSelectBtn);;
        jCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RDashboard.this,JobsSelected.class));
            }
        });
        Button JAvailable = (Button) findViewById(R.id.MoneyBtn);
        JAvailable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RDashboard.this, Services.class));
            }
        });


    }
}

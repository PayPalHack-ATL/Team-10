package com.example.beza.fundmycollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button GiveMoney;
        final Button RecieveMoney;

        GiveMoney = findViewById(R.id.giveMoneyButton);
        RecieveMoney = findViewById(R.id.recieveMoneyButton);

        GiveMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, com.example.beza.fundmycollege.GiveMoney.class));
            }
        });

        RecieveMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, com.example.beza.fundmycollege.RDashboard.class));
            }
        });



    }
}

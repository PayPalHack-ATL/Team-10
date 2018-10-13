package com.example.beza.fundmycollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class GiveMoney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_money);

        final Button RandomLottery;
        final Button RequestServiceGood;
        final Button BackButton ;

        ListView OngoingServices;
        ListView CurrentlyPosted;
        ListView CompletedServices;

        RandomLottery = findViewById(R.id.randomLotteryButton);
        RequestServiceGood = findViewById(R.id.requestServiceGoodButton);

        OngoingServices = findViewById(R.id.ongoingServices);
        CurrentlyPosted = findViewById(R.id.currentlyPosted);
        CompletedServices = findViewById(R.id.completedServices);





        RandomLottery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiveMoney.this, com.example.beza.fundmycollege.RandomLottery.class));
            }
        });

        RequestServiceGood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiveMoney.this, com.example.beza.fundmycollege.RequestServiceGood.class));
            }
        });


    }
}

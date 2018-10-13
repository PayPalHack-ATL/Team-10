package com.example.beza.fundmycollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.List;

public class GiveMoney extends AppCompatActivity {

    String Ongoing[] = {"Cooking", "Mow Lawn", "Pet Sit", "Clean Kitchen", "Paint House"};
    String Current[] = {"Cooking", "Mow Lawn", "Pet Sit", "Clean Kitchen", "Paint House"};
    String Completed[] = {"Cooking", "Mow Lawn", "Pet Sit", "Clean Kitchen", "Paint House"};

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


        Bundle extras = getIntent().getExtras();
        String ServiceType = (extras != null ? extras.getString("ServiceType") : null);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Ongoing);
        OngoingServices.setAdapter(arrayAdapter);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Current);
        CurrentlyPosted.setAdapter(arrayAdapter1);

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Completed);
        CompletedServices.setAdapter(arrayAdapter2);




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

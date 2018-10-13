package com.example.beza.fundmycollege;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RequestServiceGood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_service_good);

        final EditText ServiceType;
        final TextView ServiceDescription;
        final TextView Compensation;
        Button Post;

        ServiceType = findViewById(R.id.typeOfServiceText);
        ServiceDescription = findViewById(R.id.serviceDescriptionText);
        Compensation = findViewById(R.id.compensationText);


        Post = findViewById(R.id.postButton);

        Post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RequestServiceGood.this, "Your Required Service Has Been Posted. Thank you!", Toast.LENGTH_LONG).show();

                Intent serviceTypeIntent = new Intent(RequestServiceGood.this,GiveMoney.class);
                serviceTypeIntent.putExtra("ServiceType", ServiceType.getText());
                startActivity(serviceTypeIntent);

                Intent serviceDescriptionIntent = new Intent(RequestServiceGood.this,GiveMoney.class);
                serviceDescriptionIntent.putExtra("ServiceDescription", ServiceDescription.getText());
                startActivity(serviceDescriptionIntent);

                Intent CompensationIntent = new Intent(RequestServiceGood.this,GiveMoney.class);
                CompensationIntent.putExtra("Compensation", Compensation.getText());
                startActivity(CompensationIntent);



                startActivity(new Intent(RequestServiceGood.this, com.example.beza.fundmycollege.GiveMoney.class));
            }
        });

    }
}

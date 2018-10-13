package com.example.beza.fundmycollege;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RandomLottery extends AppCompatActivity {

    String[] Schools={"Georgia State University","University Of West Georgia","Morehouse","Spelman","Clark Atlanta University"};
    String[] Majors={"Computer Science","Business","Mathematics","Art","Don't Care"};
    String[] Year={"Freshman","Sophomore","Junior","Senior","1st Year Grad", "2nd Year Grad","PHD", "Don't Care"};
    String[] GPA={"1.0 - 2.0","2.0 - 2.5","2.5 - 3.0","3.0 - 3.5","3.5 - 4.0", "Don't Care"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_lottery);

        final EditText DonationAmount;
        Button DonateToAnyStudent;
        Button DonateToStudent;

        Spinner StudentSchool;
        Spinner StudentMajor;
        Spinner StudentYear;
        Spinner StudentGPA;

        DonationAmount = findViewById(R.id.donationAmountText);
        DonateToAnyStudent = findViewById(R.id.donateToAnyStudent);
        DonateToStudent = findViewById(R.id.donateToStudentButton);
        StudentSchool = findViewById(R.id.studentSchoolSpinner);
        StudentMajor = findViewById(R.id.studentMajorSpinner);
        StudentYear = findViewById(R.id.studentYearSpinner);
        StudentGPA = findViewById(R.id.gpaSpinner);


        DonateToAnyStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RandomLottery.this, "$" + DonationAmount.getText()+" has been donated to a random college student. Thank you!", Toast.LENGTH_LONG).show();
                startActivity(new Intent(RandomLottery.this, com.example.beza.fundmycollege.GiveMoney.class));
            }
        });


        StudentSchool.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) RandomLottery.this);
        ArrayAdapter schoolsAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Schools);
        schoolsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        StudentSchool.setAdapter(schoolsAdapter);
    }








    }


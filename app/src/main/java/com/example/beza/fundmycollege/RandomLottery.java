package com.example.beza.fundmycollege;

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

import java.util.ArrayList;
import java.util.List;

public class RandomLottery extends AppCompatActivity implements AdapterView.OnItemSelectedListener {



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
                Toast.makeText(RandomLottery.this, "$" + DonationAmount.getText() + " has been donated to a random college student. Thank you!", Toast.LENGTH_LONG).show();
                startActivity(new Intent(RandomLottery.this, com.example.beza.fundmycollege.GiveMoney.class));
            }
        });

        StudentSchool.setOnItemSelectedListener(this);
        List<String> Schools = new ArrayList<String>();
        Schools.add("Georgia State University");
        Schools.add("University Of West Georgia");
        Schools.add("Morehouse");
        Schools.add("Spelman");
        Schools.add("Clark Atlanta University");
        Schools.add("Don't Care");


        ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Schools);
        schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        StudentSchool.setAdapter(schoolAdapter);

        StudentMajor.setOnItemSelectedListener(this);
        List<String> Majors = new ArrayList<String>();
        Majors.add("Computer Science");
        Majors.add("Business");
        Majors.add("Mathematics");
        Majors.add("Art");
        Majors.add("Don't Care");

        ArrayAdapter<String> majorsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Majors);
        majorsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        StudentMajor.setAdapter(majorsAdapter);


        StudentYear.setOnItemSelectedListener(this);
        List<String> Year = new ArrayList<String>();
        Year.add("Freshman");
        Year.add("Sophomore");
        Year.add("Junior");
        Year.add("1st Year Grad");
        Year.add("2nd Year Grad");
        Year.add("PHD");
        Year.add("Don't Care");

        ArrayAdapter<String> YearAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Year);
        YearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        StudentYear.setAdapter(YearAdapter);

        StudentYear.setOnItemSelectedListener(this);
        List<String> GPA = new ArrayList<String>();
        GPA.add("1.0 - 2.0");
        GPA.add("2.0 - 2.5");
        GPA.add("2.5 - 3.0");
        GPA.add("3.0 - 3.5");
        GPA.add("3.5 - 4.0");
        GPA.add("Don't Care");

        ArrayAdapter<String> GPAAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, GPA);
        GPAAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        StudentGPA.setAdapter(GPAAdapter);


        DonateToStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RandomLottery.this, "$" + DonationAmount.getText() + " has been donated to a college student that matches your criteria. Thank you!", Toast.LENGTH_LONG).show();
                startActivity(new Intent(RandomLottery.this, com.example.beza.fundmycollege.GiveMoney.class));
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


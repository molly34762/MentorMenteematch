package edu.liangm2rpi.mentormenteematch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Spinner class_year_Spinner = findViewById(R.id.class_year_Spinner);

        //Create an array adapter using string array and default spinner layout
        //create from resource method allows creation of ArrayAdapter from string array
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item);
        ArrayAdapter<CharSequence> class_year_Adapter = ArrayAdapter.createFromResource(this, R.array.class_year, android.R.layout.simple_spinner_item);//initialize adapter
        //specify layout to use when list of choice appears
        class_year_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //apply adapter to spinner
        class_year_Spinner.setAdapter(class_year_Adapter);

        class_year_Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position)+ " selected", Toast.LENGTH_LONG).show();//when clicked on spinner
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner gender_Spinner = findViewById(R.id.gender_Spinner);

        ArrayAdapter<CharSequence> gender_Adapter = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_item);
        gender_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gender_Spinner.setAdapter(gender_Adapter);
        gender_Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position)+ "selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner birthday_month_Spinner = findViewById(R.id.birthday_month_Spinner);

        ArrayAdapter<CharSequence> birthday_month_Adapter = ArrayAdapter.createFromResource(this, R.array.birthday_month, android.R.layout.simple_spinner_item);
        birthday_month_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        birthday_month_Spinner.setAdapter(birthday_month_Adapter);
        birthday_month_Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position)+ "selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button profile_to_main_app_BackBtn = findViewById(R.id.profile_to_main_app_BackBtn);
        Button profile_to_profile_major_NextBtn = findViewById(R.id.profile_to_profile_major_NextBtn);

        profile_to_main_app_BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), main_app.class);
                startActivity(startIntent); //used to launch another activity
            }
        });

        profile_to_profile_major_NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), profile_major.class);
                startActivity(startIntent); //used to launch another activity

            }
        });


    }
}

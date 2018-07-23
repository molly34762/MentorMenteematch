package edu.liangm2rpi.mentormenteematch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class log_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //cast username and password edit text
        EditText username_EditText = findViewById(R.id.username_EditText);
        EditText password_EditText = findViewById(R.id.password_EditText);

        //cast forgot username and forget password button
        Button forgot_username_Btn = findViewById(R.id.forgot_username_Btn);
        Button forgot_password_Btn = findViewById(R.id.forgot_password_Btn);

        //cast back and go buttons
        Button log_in_to_first_activity_BackBtn = findViewById(R.id.log_in_to_first_activity_BackBtn);
        Button log_in_to_main_app_NextBtn = findViewById(R.id.log_in_to_main_app_NextBtn);

        //if press back button, go to first activity
        log_in_to_first_activity_BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), first_activity.class);
                startActivity(startIntent); //used to launch another activity

            }
        });
        //if press go button, go to main app
        log_in_to_main_app_NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), main_app.class);
                startActivity(startIntent); //used to launch another activity
            }
        });
    }
}

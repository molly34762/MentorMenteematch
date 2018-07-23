package edu.liangm2rpi.mentormenteematch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //cast all edit text
        EditText school_code_EditText = findViewById(R.id.school_code_EditText);
        EditText first_name_EditText = findViewById(R.id.first_name_EditText);
        EditText last_name_EditText = findViewById(R.id.last_name_EditText);
        EditText sign_up_password_EditText = findViewById(R.id.sign_up_password_EditText);
        EditText confirm_sign_up_password_EditText = findViewById(R.id.confirm_sign_up_password_EditText);
        EditText sign_up_email_EditText = findViewById(R.id.sign_up_email_EditText);

        //cast all buttons
        Button sign_up_to_first_activity_BackBtn = findViewById(R.id.sign_up_to_first_activity_BackBtn);
        Button sign_up_to_main_app_NextBtn = findViewById(R.id.sign_up_to_main_app_NextBtn);

        //if press back, go to first activity
        sign_up_to_first_activity_BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), first_activity.class);
                startActivity(startIntent); //used to launch another activity
            }
        });

        //if press next, go to first activity
        sign_up_to_main_app_NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), main_app.class);
                startActivity(startIntent); //used to launch another activity
            }
        });
    }
}

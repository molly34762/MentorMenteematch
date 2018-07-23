package edu.liangm2rpi.mentormenteematch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //cast log in and sign up button
        Button login_Btn = findViewById(R.id.login_Btn);
        Button sign_up_Btn = findViewById(R.id.sign_up_Btn);

        //if sign up button pressed, go to sign up page
        sign_up_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), sign_up.class);
                startActivity(startIntent); //used to launch another activity
            }
        });

        //if log in button pressed, go to log_in activity
        login_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), log_in.class);
                startActivity(startIntent); //used to launch another activity
            }

        });
    }
}

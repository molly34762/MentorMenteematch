package edu.liangm2rpi.mentormenteematch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class profile_major extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_major);

        //go to architecture_program class when pressed architecture_Btn
        Button architecture_Btn = findViewById(R.id.architecture_Btn);
        architecture_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), architecture_program.class);
                startActivity(startIntent); //used to launch another activity
            }
        });

        //(get Intent-not proper code)
        //Intent intent = getIntent();
        //Selected_Architecture_Programs selected_architecture_programs = intent.getParcelableArrayListExtra("Selected_Architecture_Programs");

        //(display selected architecture programs in a listview-not proper code)
        //ListView lv = findViewById(R.id.lv);
        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, selected_architecture_programs.getItems());
        //lv.setAdapter(adapter);
    }
}

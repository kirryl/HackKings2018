package com.example.kevin.front_end;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;




public class newEvent extends AppCompatActivity {

    final Button confirmEvent = (Button)findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("New Event");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
        confirmEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
    });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_events_page, menu);
        return true;}}

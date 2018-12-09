package com.example.kevin.front_end;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.widget.*;
import org.w3c.dom.Text;

public class eventsPage extends AppCompatActivity {

    //Variables displayed in the Events Page
    private TextView author = (TextView) findViewById(R.id.textAuthor);
    private TextView date = (TextView) findViewById(R.id.textDate);
    private TextView location = (TextView) findViewById(R.id.textLocation);
    private TextView time = (TextView) findViewById(R.id.textTime);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Event Name");
        setContentView(R.layout.activity_events_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}

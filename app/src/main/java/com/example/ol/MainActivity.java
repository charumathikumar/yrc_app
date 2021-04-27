package com.example.ol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private CardView commiteecardview;
    private CardView teamcardview;
    private CardView eventcardview;
    private CardView attendancecardview;
private CardView bloodcardview;
   private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        commiteecardview = (CardView) findViewById(R.id.commiteecardview);
        teamcardview = (CardView) findViewById(R.id.teamcardview);
        eventcardview = (CardView) findViewById(R.id.eventcardview);
        attendancecardview = (CardView) findViewById(R.id.attendancecardview);
       bloodcardview = (CardView) findViewById(R.id.bloodcardview);
        view=(View)findViewById(R.id.view);


        commiteecardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "COMMITEE PAGE", Toast.LENGTH_SHORT).show();
            }
        });
        eventcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "EVENT PAGE", Toast.LENGTH_SHORT).show();
            }
        });
        attendancecardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ATTENDANCE PAGE", Toast.LENGTH_SHORT).show();
            }
        });
        teamcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TEAM PAGE", Toast.LENGTH_SHORT).show();
            }
        });
       bloodcardview.setOnClickListener(new View.OnClickListener() {
         @Override
      public void onClick(View v) {
           Toast.makeText(MainActivity.this, "BLOOD DATA BASE PAGE", Toast.LENGTH_SHORT).show();
           }
   });

    }
}
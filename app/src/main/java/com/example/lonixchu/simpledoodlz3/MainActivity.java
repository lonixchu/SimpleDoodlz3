package com.example.lonixchu.simpledoodlz3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnA;
    private Button btnB;
    private DoodleView doodleView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA = (Button) findViewById(R.id.button2);
        btnB = (Button) findViewById(R.id.button);
        doodleView = (DoodleView) findViewById(R.id.paint);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doodleView.setDrawingColor(Color.BLACK);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doodleView.setDrawingColor(Color.BLUE);
                doodleView.setLineWidth(100);
            }
        });
    }
}


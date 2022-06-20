package com.example.devdays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button DistractionMonitor;
    private Button Statistics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        DistractionMonitor = (Button) findViewById(R.id.btn_dm);
        Statistics = (Button) findViewById(R.id.btn_stats);

        DistractionMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent(MainMenu.this , DistractionMonitor.class);
                startActivity(mainMenu);
            }
        });

        Statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent(MainMenu.this , Stats.class);
                startActivity(mainMenu);
            }
        });
    }
}
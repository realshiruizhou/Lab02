package com.zhoushirui.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button nameb;
    EditText nbox;
    TextView dis;
    TextView plan;
    Button planetb;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameb = findViewById(R.id.name_button);
        nbox = findViewById(R.id.name_box);
        dis = findViewById(R.id.textBox);
        planetb = findViewById(R.id.planet_button);
        plan = findViewById(R.id.textBox2);
        nameb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                dis.setText(nbox.getText());
            }
        });
        planetb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                plan.setText(getResources().getStringArray(R.array.planets_array)[count]);
                count++;
                if(count >= getResources().getStringArray(R.array.planets_array).length){
                    count = 0;
                }
            }
        });
    }
}

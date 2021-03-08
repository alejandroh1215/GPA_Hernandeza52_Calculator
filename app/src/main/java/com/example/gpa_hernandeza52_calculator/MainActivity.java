package com.example.gpa_hernandeza52_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float g1,g2,g3,g4,g5,gpa;
    String calculation;

    EditText classgrade;
    EditText classgrade2;
    EditText classgrade3;
    EditText classgrade4;
    EditText classgrade5;
    TextView resulttext;

    Button compute;
    TextView backcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        classgrade = (EditText) findViewById(R.id.classgrade);
        classgrade2 = (EditText) findViewById(R.id.classgrade2);
        classgrade3 = (EditText) findViewById(R.id.classgrade3);
        classgrade4 = (EditText) findViewById(R.id.classgrade4);
        classgrade5 = (EditText) findViewById(R.id.classgrade5);
        resulttext = findViewById(R.id.result);
        backcolor = findViewById(R.id.backcolor);

        compute = (Button) findViewById(R.id.compute);
        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g1 = Float.parseFloat(classgrade.getText().toString());
                g2 = Float.parseFloat(classgrade2.getText().toString());
                g3 = Float.parseFloat(classgrade3.getText().toString());
                g4 = Float.parseFloat(classgrade4.getText().toString());
                g5 = Float.parseFloat(classgrade5.getText().toString());

                gpa= (g1+g2+g3+g4+g5)/5;

                if(gpa<60){
                backcolor.setBackgroundColor(Color.RED);}
                if(gpa>=60 && gpa<80){
                    backcolor.setBackgroundColor(Color.YELLOW);}
                if(gpa>=80){
                    backcolor.setBackgroundColor(Color.GREEN);}

                calculation = "Your calculated GPA is : "+ gpa;
                resulttext.setText(calculation);
            }
        });
    }
}
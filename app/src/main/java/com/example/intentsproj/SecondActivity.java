package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etnum1;
    EditText etnum2;
    TextView lblsum;


    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //define the text objects
        etnum1 =findViewById(R.id.num1);
        etnum2 =findViewById(R.id.num2);
        lblsum =findViewById(R.id.lblsum);


        Intent intent = getIntent();

        String num1 = intent.getStringExtra("n1");
        String num2 = intent.getStringExtra("n2");

        etnum1.setText(num1);
        etnum2.setText(num2);


        //convert to intet=rger valus

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);



    }

    public void add(View view){

        lblsum.setText(n1 + " + " +n2 +" = " +(n1+n2));


    }

    public void substract(View view){

        lblsum.setText(n1 + " - " +n2+ " = " +(n1-n2));

    }

    public void multiply(View view){

        lblsum.setText(n1 + " * " +n2+" = " +(n1*n2));

    }

    public void devide(View view){

        lblsum.setText(n1 + " / " +n2+" 2 "+" = " +(n1/n2));

    }



}
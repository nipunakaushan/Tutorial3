package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText etnum1;
    EditText etnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etnum1 = findViewById(R.id.num1);
        etnum2 = findViewById(R.id.num2);





    }

    public void openSecond(View view){

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("n1",etnum1.getText().toString());
        intent.putExtra("n2",etnum2.getText().toString());

        Toast.makeText(this, "open calculator", Toast.LENGTH_SHORT).show();

        startActivity(intent);
    }

}
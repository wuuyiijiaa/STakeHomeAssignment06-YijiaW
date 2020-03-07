package com.example.stakehomeassignment06_yijiaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText amount;
    EditText tax;
    EditText tip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amount = (EditText) findViewById(R.id.amount);
        tax = (EditText) findViewById(R.id.tax);
        tip = (EditText) findViewById(R.id.tip);


    }

    public void submit(View view) {
        double a = Double.parseDouble(amount.getText().toString());
        double ta = Double.parseDouble(tax.getText().toString());
        double ti = Double.parseDouble(tip.getText().toString());

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("KEY_STRING_1", a);
        i.putExtra("KEY_STRING_2", ta);
        i.putExtra("KEY_STRING_3", ti);

        startActivity(i);


    }
}

package com.example.stakehomeassignment06_yijiaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent receivingIntent = getIntent();
        Double d = receivingIntent.getDoubleExtra("KEY_STRING_1", 0);
        Double d2 = receivingIntent.getDoubleExtra("KEY_STRING_2", 0);
        Double d3 = receivingIntent.getDoubleExtra("KEY_STRING_3", 0);


        textView = (TextView) findViewById(R.id.text_view);

        String s = "Total: " + d + "\n"
                + "Sales Tax: " + d2 * d + "\n"
                + "Tip: " + d3 * d + "\n"
                + "Grand Total: " + (d + d * d2 + d * d3);

        textView.setText(s);


    }
}

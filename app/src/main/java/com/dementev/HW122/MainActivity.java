package com.dementev.HW122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();


    private TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = random.nextInt(100);
        String string = Integer.toString(i);
        link = findViewById(R.id.link);
        String text = link.getText().toString();
        link.setText(text + string);
    }

    public void btnBack(View view) {
        finish();
    }

    public void btnFwd(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
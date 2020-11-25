package com.example.mydatecounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView editTextDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar fin = Calendar.getInstance();
        fin.set(2020, 11, 23, 0, 0, 0);
        Calendar today = Calendar.getInstance();

        Date todayDate = new Date();
        Date finDate = fin.getTime();

        Date leftDate = new Date(fin.getTimeInMillis() -today.getTimeInMillis() );
        editTextDate = findViewById(R.id.editTextDate);
        editTextDate.append(leftDate.getMonth()+ "월"+leftDate.getDate()+"일"+leftDate.getHours()+"시"+
                leftDate.getMinutes()+"분"+leftDate.getSeconds()+"초 남았습니다");


    }
    public void onButtonCliked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-7747-0195"));
        startActivity(intent);
    }

    public void onButton2Cliked(View v){
        Toast.makeText(this, "카카오뱅크 3333-05-8278978", Toast.LENGTH_LONG).show();
    }

}
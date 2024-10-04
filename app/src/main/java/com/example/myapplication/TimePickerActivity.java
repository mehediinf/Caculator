package com.example.myapplication;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TimePickerActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button;

    TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        textView = findViewById(R.id.textViewTimeId);
        button = findViewById(R.id.buttonTimeId);

        button.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        TimePicker timePicker =new TimePicker(this);
        int currentHour = timePicker.getCurrentHour();
        int currentMinute = timePicker.getCurrentMinute();

        timePickerDialog = new TimePickerDialog(TimePickerActivity.this,

                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {

                        textView.setText(i+":"+i1);
                    }
                },currentHour,currentMinute,true);


        timePickerDialog.show();
    }
}
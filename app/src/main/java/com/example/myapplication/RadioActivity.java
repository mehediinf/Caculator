package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadioActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton genderButton;
    Button button;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        radioGroup = findViewById(R.id.radioGroupId);
        button = findViewById(R.id.buttonId);
        textView = findViewById(R.id.textViewId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selected = radioGroup.getCheckedRadioButtonId();

                genderButton = findViewById(selected);

                String value = genderButton.getText().toString();
                textView.setText("You have Selected : "+value);



            }
        });






    }
}
package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CheckboxActivity extends AppCompatActivity {

    CheckBox mehedi,masum,shishir;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        mehedi = findViewById(R.id.mehediId);
        masum = findViewById(R.id.masumId);
        shishir = findViewById(R.id.shishirId);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textViewId);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                if (mehedi.isChecked()){

                    String value = mehedi.getText().toString();
                    stringBuilder.append("This is "+ value);
                }
                if (masum.isChecked()){

                    String value = masum.getText().toString();
                    stringBuilder.append("\n This is "+ value);
                }
                if (shishir.isChecked()){

                    String value = shishir.getText().toString();
                    stringBuilder.append("\n This is "+ value);
                }

                textView.setText(stringBuilder);

            }
        });




    }
}
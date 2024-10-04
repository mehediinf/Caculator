package com.example.myapplication;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SwitchActivity extends AppCompatActivity {

    Switch aSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        aSwitch = findViewById(R.id.switchId);
     

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


                if (b){
                    Toast.makeText(SwitchActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(SwitchActivity.this, "UnChecked", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
package com.example.myapplication;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SeekBarActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        seekBar = findViewById(R.id.seekBarId);
        textView = findViewById(R.id.textViewSeekId);

        textView.setText("Volum : "+seekBar.getProgress()+"/"+seekBar.getMax());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                textView.setText("Volum : "+i+"/"+seekBar.getMax());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(SeekBarActivity.this, "Touch SeekBar", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(SeekBarActivity.this, "Remove Touch SeekBar", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
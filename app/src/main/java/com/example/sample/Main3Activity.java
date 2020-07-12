package com.example.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class Main3Activity extends AppCompatActivity {
    SeekBar seekBar1, seekBar2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        seekBar1 = findViewById(R.id.seekBar1);
        seekBar2 = findViewById(R.id.seekBar2);


        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(i1);
            }
        });

        seekBar1.getProgressDrawable().setColorFilter(Color.parseColor("#39BBFA"), PorterDuff.Mode.MULTIPLY);

        seekBar2.getProgressDrawable().setColorFilter(Color.parseColor("#65E001"), PorterDuff.Mode.MULTIPLY);

    }
}

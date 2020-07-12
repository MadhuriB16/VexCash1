package com.example.sample;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Spinner spin1, spin2, spin3, spin4;
    TextView tv1, tv2;
    Button btn;
    TextView tvDate1, tvDate2;
    DatePickerDialog datePickerDialog;
    int mYear, mMonth, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spin1 = findViewById(R.id.spin1);
        spin2 = findViewById(R.id.spin2);
        spin3 = findViewById(R.id.spin3);
        spin4 = findViewById(R.id.spin4);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        tvDate1 = findViewById(R.id.tvDate1);
        tvDate2 = findViewById(R.id.tvDate2);

        btn = findViewById(R.id.btn);

        tvDate1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                datePickerDialog = new DatePickerDialog(Main2Activity.this, R.style.CustomDatePickerDialog,
                        new DatePickerDialog.OnDateSetListener()
                        {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
                            {
                                tvDate1.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();

            }
        });

        tvDate2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                datePickerDialog = new DatePickerDialog(Main2Activity.this, R.style.CustomDatePickerDialog,
                        new DatePickerDialog.OnDateSetListener()
                        {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
                            {
                                tvDate2.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i1);
            }
        });

        final String[] items1 = new String[]{"A", "B", "C","D", "E"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        spin1.setAdapter(adapter1);

        final String[] items2 = new String[]{"1", "2", "3","4", "5"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        spin2.setAdapter(adapter2);

        final String[] items3 = new String[]{"a", "b", "c","d", "e"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        spin3.setAdapter(adapter3);

        final String[] items4 = new String[]{"P", "Q", "R","S", "T"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        spin4.setAdapter(adapter4);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                tv1.setBackgroundResource(R.drawable.button_shape_green_square);
                //tv1.setBackgroundColor(Color.parseColor("#CCF8AE"));
                tv2.setBackgroundResource(R.drawable.shape_border_white2);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                tv2.setBackgroundResource(R.drawable.button_shape_green_square);
                //tv2.setBackgroundColor(Color.parseColor("#CCF8AE"));
                tv1.setBackgroundResource(R.drawable.shape_border_white2);
            }
        });
    }
}

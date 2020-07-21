package com.kodingnext.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_plus, btn_minus, btn_multi, btn_div;
    double result, number_one, number_two;
    EditText et_first_number, et_second_number;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_plus = findViewById(R.id.plus_btn);
        btn_minus = findViewById(R.id.min_btn);
        btn_div = findViewById(R.id.div_btn);
        btn_multi = findViewById(R.id.multi_btn);
        tv_result = findViewById(R.id.result_tv);
        et_first_number = findViewById(R.id.first_number_et);
        et_second_number = findViewById(R.id.second_number_et);

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_one = Double.parseDouble(et_first_number.getText().toString());
                number_two = Double.parseDouble(et_second_number.getText().toString());
                result = number_one + number_two;
                tv_result.setText("" + result);
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_one = Double.parseDouble(et_first_number.getText().toString());
                number_two = Double.parseDouble(et_second_number.getText().toString());
                result = number_one - number_two;
                tv_result.setText("" + result);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_one = Double.parseDouble(et_first_number.getText().toString());
                number_two = Double.parseDouble(et_second_number.getText().toString());
                result = number_one / number_two;
                tv_result.setText("" + result);
            }
        });

        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_one = Double.parseDouble(et_first_number.getText().toString());
                number_two = Double.parseDouble(et_second_number.getText().toString());
                result = number_one * number_two;
                tv_result.setText("" + result);
            }
        });
    }
}

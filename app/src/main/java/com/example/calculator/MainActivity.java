package com.example.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul,buttonC, buttonEqual;
    TextView tv1,tv0;
    int num1, num2;
    boolean add, sub, mul, div;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 =  findViewById(R.id.zero);
        button1 =  findViewById(R.id.one);
        button2 =  findViewById(R.id.two);
        button3 =  findViewById(R.id.three);
        button4 =  findViewById(R.id.four);
        button5 =  findViewById(R.id.five);
        button6 =  findViewById(R.id.six);
        button7 =  findViewById(R.id.seven);
        button8 =  findViewById(R.id.eight);
        button9 =  findViewById(R.id.nine);
        buttonAdd =  findViewById(R.id.add);
        buttonSub =  findViewById(R.id.subtract);
        buttonMul =  findViewById(R.id.multiply);
        buttonDivision =  findViewById(R.id.divide);
        buttonC =  findViewById(R.id.clear);
        buttonEqual = findViewById(R.id.equals);
        tv1 =  findViewById(R.id.tv1);
        tv0 =  findViewById(R.id.tv0);
        button1.setOnClickListener( view -> {
            tv0.append("1");
            tv1.setText(tv1.getText() + "1");
        } );
        button2.setOnClickListener( view -> {
            tv0.append("2");
            tv1.setText(tv1.getText() + "2");
        } );
        button3.setOnClickListener( view -> {
            tv0.append("3");
            tv1.setText(tv1.getText() + "3");
        } );
        button4.setOnClickListener( view -> {
            tv0.append("4");
            tv1.setText(tv1.getText() + "4");
        } );
        button5.setOnClickListener( view-> {
            tv0.append("5");
            tv1.setText(tv1.getText() + "5");
        } );
        button6.setOnClickListener( view -> {
            tv0.append("6");
            tv1.setText(tv1.getText() + "6");
        } );
        button7.setOnClickListener( view-> {
            tv0.append("7");
            tv1.setText(tv1.getText() + "7");
        } );
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv0.append("8");
                tv1.setText(tv1.getText() + "8");
            }
        });
        button9.setOnClickListener( view-> {
            tv0.append("9");
            tv1.setText(tv1.getText() + "9");
        } );
        button0.setOnClickListener( view -> {
            tv0.append("0");
            tv1.setText(tv1.getText() + "0");
        } );
        buttonAdd.setOnClickListener( view-> {
            if (tv1 == null) {
                tv1.setText("");
            } else {
                tv0.append("+");
                num1 = Integer.parseInt(tv1.getText() + "");
                add = true;
                tv1.setText(null);
            }
        } );
        buttonSub.setOnClickListener( view -> {
            tv0.append("-");
            num1 = Integer.parseInt(tv1.getText() + "");
            sub = true;
            tv1.setText(null);
        } );
        buttonMul.setOnClickListener( view -> {
            tv0.append("*");
            num1 = Integer.parseInt(tv1.getText() + "");
            mul = true;
            tv1.setText(null);
        } );
        buttonDivision.setOnClickListener( view -> {
            tv0.append("/");
            num1 = Integer.parseInt(tv1.getText() + "");
            div = true;
            tv1.setText(null);
        } );
        buttonEqual.setOnClickListener( view-> {
            num2 = Integer.parseInt(tv1.getText() + "");
            if (add == true) {
                tv1.setText(num1 + num2 + "");
                add = false;
            }
            if (sub == true) {
                tv1.setText(num1 - num2 + "");
                sub = false;
            }
            if (mul == true) {
                tv1.setText(num1 * num2 + "");
                mul = false;
            }
            if (div == true) {
                tv1.setText(num1 / num2 + "");
                div = false;
            }
        } );
        buttonC.setOnClickListener( view -> {
            tv1.setText("");
            tv0.setText("");
        } );
    }
}
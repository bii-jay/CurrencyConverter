package com.biijay.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro, pound, dollar, yen, dinar, bitcoin, ausdollar, candollar;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.012;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

//                    textView.setText("" + k);

                }
            }
        });

    }
}

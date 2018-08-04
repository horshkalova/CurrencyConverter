package com.example.marynahorshkalova.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked (View view) {

        Log.i("Test", "Button clicked");

        EditText amountUAH = findViewById(R.id.amountUAH);

        // how to round a double to 2 decimal places

        double x = new Double(amountUAH.getText().toString());
        double dollarRate = 26.25;
        double result = x / dollarRate;

        Toast.makeText(this, "$" + String.format("%.2f", result), Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

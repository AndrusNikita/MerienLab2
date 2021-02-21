package com.example.merienlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.atan;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View v){
        EditText X = (EditText)findViewById(R.id.xIn);
        TextView Answer = (TextView) findViewById(R.id.AnswerText);

        double x = Double.parseDouble(X.getText().toString());
        int y = 5;

        double Ans = ((cos(pow(x, 2)+2))+(((3.5*(pow(x,2)))+1)/pow(cos(y),2)));

        Answer.setText("F = "+Double.toString(Ans));
    }

    public void onInfoClick (View v){
        Intent infoGo = new Intent(".Info");
        startActivity(infoGo);
    }

}
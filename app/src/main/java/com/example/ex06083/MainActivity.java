package com.example.ex06083;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText eTV;
    double fnum = 0;
    double op = 0;
    double num;
    boolean flag = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTV = findViewById(R.id.eTV);

    }

    public void plus(View view) {
        String n = eTV.getText().toString();
        num = Double.parseDouble(n);
        eTV.setText("");
        if(flag){
            fnum = num;;
            flag = !flag;
        }
        else{
            cal();
        }
        op = 1;



    }

    public void equal(View view) {
        String n = eTV.getText().toString();
        num = Double.parseDouble(n);
        if (op == 1) {
            fnum += num;
        } else if (op == 2) {
            fnum = fnum - num;
        } else if (op == 3) {
            fnum = fnum * num;
        }
        else{
            fnum = fnum / num;
        }
        String x = Double.toString(fnum);
        eTV.setText(x);

    }

    public void clean(View view) {
        fnum = 0;
        flag = true;
        eTV.setText("");
    }

    public void sub(View view) {
        String n = eTV.getText().toString();
        num = Double.parseDouble(n);
        eTV.setText("");
        if(flag){
            fnum += num;
            flag = false ;
        }
        else{
            cal();
        }
        op = 2;

    }
    public void mul(View view) {

        String n = eTV.getText().toString();
        num = Double.parseDouble(n);
        eTV.setText("");
        if(flag){
            fnum = num;
            flag = false ;
        }
        else{
            cal();
        }
        op = 3;

    }
    public void div(View view) {

        String n = eTV.getText().toString();
        num = Double.parseDouble(n);
        eTV.setText("");
        if(flag){
            fnum = num;
            flag = false ;
        }
        else{
            cal();
        }
        op = 4;
    }
    public void cal(){ //here im checking th previous action.
        if(op == 1){
            fnum = fnum + num;}
        else if(op == 2){
            fnum = fnum - num;}
        else if(op == 3){
            fnum = fnum * num;}
        else if(op == 4){
            fnum = fnum / num;}
    }
}
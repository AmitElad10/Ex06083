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
    int fnum = 0;
    int op = 0;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTV = findViewById(R.id.eTV);

    }

    public void plus(View view) {
        op = 1 ;
        String n = eTV.getText(). toString();
        num = Integer.parseInt(n);
        eTV.setText("");
        fnum += num;

    }
    public void equal(View view) {
        if(op == 1){
            String n = eTV.getText(). toString();
            num = Integer.parseInt(n);
            fnum += num;
        }
        String x = Integer.toString(fnum);
        eTV.setText(x);

    }

    public void clean(View view) {
        fnum = 0;
        eTV.setText("");
    }
}
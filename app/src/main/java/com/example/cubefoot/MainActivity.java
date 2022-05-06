package com.example.cubefoot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText foot ,type;
TextView textview;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foot=findViewById(R.id.foot);
        type=findViewById(R.id.type);
        textview=findViewById(R.id.textview);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               double f=Double.parseDouble(foot.getText().toString());

                double t=Double.parseDouble(type.getText().toString());

                double cube=f*t/144;

                textview.setText("TOTAL CUBE FOOT ="+""+ cube);



            }
        });


    }
}
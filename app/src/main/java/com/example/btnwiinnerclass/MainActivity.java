package com.example.btnwiinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mbutton1,mbutton2;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton1 = findViewById(R.id.button1);
        mbutton2 = findViewById(R.id.button2);
        mTextView1 = findViewById(R.id.textView1);

        mbutton1.setOnClickListener(new MyOnClickListener());
        mbutton2.setOnClickListener(new MyOnClickListener2());
    }

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
           mTextView1.setText("you clicked button 1");

        }

    }

    private class MyOnClickListener2 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mTextView1.setText("you clicked button 2");
        }
    }
}

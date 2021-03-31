package com.example.btnwiinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mbutton1;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton1 = findViewById(R.id.button1);
        mTextView1 = findViewById(R.id.textView1);

        mbutton1.setOnClickListener(new MyOnClickListener(this));
    }

    private class MyOnClickListener implements View.OnClickListener {
        MainActivity mainActivity;

        public MyOnClickListener(MainActivity mainActivity) {
            this.mainActivity = mainActivity;
        }


        @Override
        public void onClick(View v) {
            mainActivity.mTextView1.setText("you clicked button 1");

        }
    }
}

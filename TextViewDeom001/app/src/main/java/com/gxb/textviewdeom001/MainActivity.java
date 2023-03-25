package com.gxb.textviewdeom001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.bt02);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText03 = (EditText) findViewById(R.id.edt03);
                EditText editText04 = (EditText) findViewById(R.id.edt04);

                    String temp = editText03.getText().toString();
            }
        });
    }
}
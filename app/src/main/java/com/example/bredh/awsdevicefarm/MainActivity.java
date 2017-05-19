package com.example.bredh.awsdevicefarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText uname;// edittext
    TextView login; // text view

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiViews();
    }

    private void initiViews() {
        uname= (EditText) findViewById(R.id.uname);
        login= (TextView) findViewById(R.id.login);
        setValues();
    }

    private void setValues() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"hello, "+uname.getText().toString().trim(),Toast.LENGTH_LONG).show();
            }
        });

    }

}

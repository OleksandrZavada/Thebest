package com.zavada.thebest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    Button btnActOne;
    Button btn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }

        btnActOne = (Button) findViewById(R.id.btnActOne);
        btnActOne.setOnClickListener(this);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActOne:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn1:
                Intent intent1 = new Intent(this, ActivityThird.class);
                startActivity(intent1);

                break;
            default:
                break;
        }

    }


}
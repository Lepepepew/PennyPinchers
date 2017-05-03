package com.example.abraham.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.R.id;
import android.view.View.OnClickListener;


public class Balance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        Button backBtn;
        backBtn = (Button) findViewById(R.id.button);

        backBtn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){

                Intent budgetIntent = new Intent(Balance.this, HomePage.class);
                Balance.this.startActivity(budgetIntent);
            }
        });
    }
}

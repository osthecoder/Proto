package com.example.seekm.guiiiiii;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupForm extends AppCompatActivity {
    FloatingActionButton mFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);

        mFloat = (FloatingActionButton)findViewById(R.id.floatingActionButton3);
        mFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startNewActivity(SignupForm.this,ProfileBuilding.class);
            }
        });
    }
    void startNewActivity(Activity one, Class two){
        Intent intent = new Intent(one,two);
        startActivity(intent);
    }

}

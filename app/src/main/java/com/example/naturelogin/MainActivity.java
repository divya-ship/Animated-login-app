package com.example.naturelogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ConstraintLayout layout;//we declare constrain layout
private Button button;
private Button buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);
        //this is  animation part
        AnimationDrawable animationDrawable= (AnimationDrawable)layout.getBackground();
         // hw long image should enter
        animationDrawable.setEnterFadeDuration(8000);
        //exit of each image
        animationDrawable.setExitFadeDuration(8000);
        animationDrawable.start();
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Login approved",Toast.LENGTH_SHORT).show();
            }
        });
        buttons=findViewById(R.id.button3);
        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"New user signup",Toast.LENGTH_SHORT).show();
            }
        });

}}

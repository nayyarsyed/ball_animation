package com.gb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public Button b1 ;
    public FrameLayout jfl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jfl = findViewById(R.id.fl);
        final BouncingBallInside bouncingballi = new BouncingBallInside(this);
        jfl.addView(bouncingballi);
        b1= new Button(this);
       // b1 = findViewById(R.id.butt);
        b1.setLayoutParams(new LinearLayout.LayoutParams(400,200));
        b1.setX(300);
        b1.setY(400);
        b1.setText( "Dynamic button 2 Recreate activity " );
        //Re creating teh Activity
        jfl.addView( b1 );

        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View b1_listner) {
                recreate();
            }
        } );

    }

}



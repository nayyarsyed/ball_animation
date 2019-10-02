package com.gb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class MyBall extends View {
    Bitmap myBall;
    int gap = 10;
    String direction = "down";
    float xPos = 0;
    float yPos = 0;

    public MyBall(Context context) {
        super(context);
        myBall = BitmapFactory.decodeResource(getResources(), R.drawable.ball);

    }
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);


        canvas.drawBitmap(myBall, xPos, yPos, null);
       // xPos +=1;
        invalidate();
    }
}
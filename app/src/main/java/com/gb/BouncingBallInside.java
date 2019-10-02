package com.gb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class BouncingBallInside extends View {
    public Ball[] balls = new Ball[10];
    public Ball[] ball2 = new Ball[10];
    public int i;

    public Button butt2 ;

    public BouncingBallInside(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BouncingBallInside(Context context) {
        super(context);
        init();
    }
    private void init(){
        //Add a new ball to the view
        for ( i =0; i <10 ; i++)
        {
        ball2[i] = (new Ball(i*200,i*115,i*3,i*9 , Color.RED));
        balls[i]=(new Ball(i*400*2,i*300*2,i*6, i*3*3,Color.BLUE));
        }
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Draw the balls

        for (int i =0; i <10 ; i++) {
            balls[i].move(canvas);
            ball2[i].move(canvas);
            //Draw them
            canvas.drawOval(balls[i].oval,balls[i].paint);
            canvas.drawOval(ball2[i].oval,ball2[i].paint);

        }
        invalidate(); // See note
    }
}
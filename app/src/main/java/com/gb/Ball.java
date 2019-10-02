package com.gb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class Ball{
    public int[] direction = new int[]{1,1}; //direction modifier (-1,1)
    public int x,y,size;
    public int speed ;
    public Paint paint;
    public RectF oval;

    public Ball(int x, int y, int s,int size, int color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.paint = new Paint();
        this.paint.setColor(color);
        this.speed =s;
    }

    public void move(Canvas canvas) {
        x += speed * direction[0];
        y += speed * direction[1];
        oval = new RectF(x-size/2,y-size/2,x+size/2,y+size/2);

        //Do we need to bounce next time?
        Rect bounds = new Rect();
        this.oval.roundOut(bounds); ///store our int bounds

        //This is what you're looking for ▼
        if(!canvas.getClipBounds().contains(bounds)){
            if(this.x-size<0 || this.x+size > canvas.getWidth()){
                direction[0] = direction[0]*-1;
            }
            if(this.y-size<0 || this.y+size > canvas.getHeight()){
                direction[1] = direction[1]*-1;
            }
        }
    }


}
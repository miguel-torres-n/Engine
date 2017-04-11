package com.teclab.torres.engine;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.animation.Transformation;

/**
 * Created by Heat on 01/11/2016.
 */
public class DisplayObject extends EventDispatcher
{

    public int x,y,height,pivotX,pivotY,width;
    public DisplayObject parent;
    public Resources resources;
    public float opacity,scaleX,scaleY;
    //public Transformations transformation;
    public boolean visible;

    public DisplayObject()
    {
        x=y=0;
        scaleX=scaleY=1.0f;
        pivotX=pivotY=0;
        opacity =1.0f;
        width=height=0;
    }
    public void onDraw(Canvas canvas)
    {
        this.update();
    }
    public void onTouchEvent(MotionEvent event)
    {

    }
    public void dispatchEvent(Event e)
    {

    }
    public void dispatchEvent(String type)
    {
        Event e = new Event(type);

    }
    public void dispose()
    {

    }

    public Point globalToLocal(Point p)
    {

    }
    public Point localToGlobal(Point p)
    {

    }
    public void onDraw()
    {

    }
    public void	primaryOperations()
    {

    }
    public void touchDown(Point p;int index)
    {

    }
    public void touchMove(Point p;int index)
    {

    }
    public void touchUp(Point p;int index)
    {

    }
    public void update()
    {

    }
}

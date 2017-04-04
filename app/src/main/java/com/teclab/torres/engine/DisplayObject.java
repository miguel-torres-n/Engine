package com.teclab.torres.engine;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.animation.Transformation;

/**
 * Created by Heat on 01/11/2016.
 */
public class DisplayObject
{

    public int x,y,height,pivotX,pivotY,width;
    public DisplayObject parent;
    public Resources resources;
    public float opacity,scaleX,scaleY;
    //public Transformations transformation;
    public boolean visible;

    public DisplayObject(Resources resources)
    {
        this.resources = resources;
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

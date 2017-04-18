package com.teclab.torres.engine;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;


public class Image extends DisplayObject
{

       String key;

    public Image(String _key, String _tag, int source, Resources _resources)
       {
           this.resources=_resources;
           this.key = _key;
           this.resources.loadTexture(this.key,source);
       }
       public void onDraw()
       {
           Paint p = new Paint();
           drawBitmap();
       }

    private void drawBitmap() {
    }

    public void onDraw(Canvas canvas)
       {
              super.onDraw(canvas);
           canvas.drawBitmap(bmp, x, y, null);
       }
}
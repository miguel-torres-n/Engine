package com.teclab.torres.engine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.net.ConnectivityManager;

import java.util.HashMap;

/**
 * Created by Heat on 02/11/2016.
 */
public class Resources
{
    private HashMap texturePool;
    public SoundManager sounds;
    public Context mContext;
    public int fps;
    public canvas canvas;
    public PointF aspect;
    private String hashkey;

    public Resources(Context _context)
    {
        fps=12;
        hashkey="";
        mContext=_context;
        texturePool=new HashMap();
        sounds = new SoundManager(_context);
    }
    public void loadTexture(String key,int resource)
    {
        if(texturePool.containsKey(key))
        {
            Bitmap bmp = null;
            bmp = BitmapFactory.decodeResource(mContext.getResources(),resource);
            texturePool.put(key,bmp);
        }
    }
    public void unLoadTexture(String key)
    {
        ((Bitmap) texturePool.get(key)).recycle();
        texturePool.remove(key);
    }
    public Bitmap getTexture(String key)
    {
        return (Bitmap)texturePool.get(key);
    }
    public boolean isOnline()
    {

    }
    /*
    private GameView view;
    private HashMap<String,Bitmap> pool;

    public Resources(GameView view){
        this.view = view;
        pool  = new HashMap<String, Bitmap>();
    }

    public Bitmap getBmp(String resource){
        if(!this.pool.containsKey(resource)){
            this.pool.put(resource, BitmapFactory.decodeResource(this.view.getResources(),this.view.getResources().getIdentifier(resource , "drawable", this.view.getContext().getPackageName())));
        }

        return this.pool.get(resource);
    }

    public Bitmap removeBmp(String resource){
        return this.pool.remove(resource);
    }
    */
}

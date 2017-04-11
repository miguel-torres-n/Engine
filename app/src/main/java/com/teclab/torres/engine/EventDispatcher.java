package com.teclab.torres.engine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alumno on 11/04/2017.
 */

public class EventDispatcher
{
    private List listeners;

    public EventDispatcher()
    {
        listeners = new ArrayList();
    }
    public void addEventlistener(String type)
    {
        listeners.add(type);
    }
    public void dispatchEvent(Event e)
    {
        if(e.target==null)
            e.target=

    }
    public void dispachtEvent(String type)
    {
        Event e = new Event(type)
        if(e.target==null)
            e.target=this;
        for(int i=0;i<listeners.size();i++)
    }
}

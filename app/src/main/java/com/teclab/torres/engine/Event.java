package com.teclab.torres.engine;

/**
 * Created by Alumno on 11/04/2017.
 */

public class Event
{
    public EventDispatcher currentTarget;
    public EventDispatcher target;
    public String type;
    public Object data;

    public Event(String _type)
    {
        type = _type;
    }

    public Event(String _type, Object _data)
    {
        type = _type;
        data = _data;
    }
}

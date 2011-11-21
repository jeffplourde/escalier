package org.opensplice.demo;

public final class Line2D {

    public int sid;
    public int id;
    public org.opensplice.demo.Coord2D begin = new org.opensplice.demo.Coord2D();
    public org.opensplice.demo.Coord2D end = new org.opensplice.demo.Coord2D();
    public org.opensplice.demo.ColorRGB color = new org.opensplice.demo.ColorRGB();

    public Line2D() {
    }

    public Line2D(
        int _sid,
        int _id,
        org.opensplice.demo.Coord2D _begin,
        org.opensplice.demo.Coord2D _end,
        org.opensplice.demo.ColorRGB _color)
    {
        sid = _sid;
        id = _id;
        begin = _begin;
        end = _end;
        color = _color;
    }

}

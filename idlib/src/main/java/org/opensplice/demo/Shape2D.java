package org.opensplice.demo;

public final class Shape2D {

    public int sid;
    public int id;
    public int width;
    public int height;
    public org.opensplice.demo.Coord2D coord = new org.opensplice.demo.Coord2D();
    public org.opensplice.demo.ColorRGB color = new org.opensplice.demo.ColorRGB();

    public Shape2D() {
    }

    public Shape2D(
        int _sid,
        int _id,
        int _width,
        int _height,
        org.opensplice.demo.Coord2D _coord,
        org.opensplice.demo.ColorRGB _color)
    {
        sid = _sid;
        id = _id;
        width = _width;
        height = _height;
        coord = _coord;
        color = _color;
    }

}

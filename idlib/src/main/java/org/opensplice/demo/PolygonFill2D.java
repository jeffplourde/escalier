package org.opensplice.demo;

public final class PolygonFill2D {

    public int sid;
    public int id;
    public org.opensplice.demo.Coord2D[] coordList = new org.opensplice.demo.Coord2D[0];
    public org.opensplice.demo.ColorRGB borderColor = new org.opensplice.demo.ColorRGB();

    public PolygonFill2D() {
    }

    public PolygonFill2D(
        int _sid,
        int _id,
        org.opensplice.demo.Coord2D[] _coordList,
        org.opensplice.demo.ColorRGB _borderColor)
    {
        sid = _sid;
        id = _id;
        coordList = _coordList;
        borderColor = _borderColor;
    }

}

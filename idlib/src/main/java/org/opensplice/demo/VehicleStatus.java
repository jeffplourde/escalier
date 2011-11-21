package org.opensplice.demo;

public final class VehicleStatus {

    public int vid;
    public int x;
    public int y;
    public int width;
    public int height;
    public int dx;
    public int dy;

    public VehicleStatus() {
    }

    public VehicleStatus(
        int _vid,
        int _x,
        int _y,
        int _width,
        int _height,
        int _dx,
        int _dy)
    {
        vid = _vid;
        x = _x;
        y = _y;
        width = _width;
        height = _height;
        dx = _dx;
        dy = _dy;
    }

}

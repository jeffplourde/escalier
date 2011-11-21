package org.opensplice.demo;

public final class DistanceViolationEvent {

    public int thisVid;
    public int thatVid;
    public float distance;

    public DistanceViolationEvent() {
    }

    public DistanceViolationEvent(
        int _thisVid,
        int _thatVid,
        float _distance)
    {
        thisVid = _thisVid;
        thatVid = _thatVid;
        distance = _distance;
    }

}

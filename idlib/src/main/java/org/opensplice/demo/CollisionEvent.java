package org.opensplice.demo;

public final class CollisionEvent {

    public int vid;
    public int otherVid;
    public float distance;

    public CollisionEvent() {
    }

    public CollisionEvent(
        int _vid,
        int _otherVid,
        float _distance)
    {
        vid = _vid;
        otherVid = _otherVid;
        distance = _distance;
    }

}

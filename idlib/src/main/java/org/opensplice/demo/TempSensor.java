package org.opensplice.demo;

public final class TempSensor {

    public int id;
    public float temp;
    public float hum;

    public TempSensor() {
    }

    public TempSensor(
        int _id,
        float _temp,
        float _hum)
    {
        id = _id;
        temp = _temp;
        hum = _hum;
    }

}

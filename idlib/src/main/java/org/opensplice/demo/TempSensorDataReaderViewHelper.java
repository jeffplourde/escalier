package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class TempSensorDataReaderViewHelper
{

    public static org.opensplice.demo.TempSensorDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.TempSensorDataReaderView) {
            return (org.opensplice.demo.TempSensorDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.TempSensorDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.TempSensorDataReaderView) {
            return (org.opensplice.demo.TempSensorDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

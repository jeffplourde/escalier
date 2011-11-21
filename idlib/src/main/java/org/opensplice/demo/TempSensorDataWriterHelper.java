package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class TempSensorDataWriterHelper
{

    public static org.opensplice.demo.TempSensorDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.TempSensorDataWriter) {
            return (org.opensplice.demo.TempSensorDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.TempSensorDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.TempSensorDataWriter) {
            return (org.opensplice.demo.TempSensorDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

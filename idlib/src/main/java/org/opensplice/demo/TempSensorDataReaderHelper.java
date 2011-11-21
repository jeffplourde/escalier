package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class TempSensorDataReaderHelper
{

    public static org.opensplice.demo.TempSensorDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.TempSensorDataReader) {
            return (org.opensplice.demo.TempSensorDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.TempSensorDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.TempSensorDataReader) {
            return (org.opensplice.demo.TempSensorDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

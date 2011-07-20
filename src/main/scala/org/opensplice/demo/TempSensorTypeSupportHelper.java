package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class TempSensorTypeSupportHelper
{

    public static org.opensplice.demo.TempSensorTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.TempSensorTypeSupport) {
            return (org.opensplice.demo.TempSensorTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.TempSensorTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.TempSensorTypeSupport) {
            return (org.opensplice.demo.TempSensorTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

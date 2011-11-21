package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class VehicleStatusTypeSupportHelper
{

    public static org.opensplice.demo.VehicleStatusTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleStatusTypeSupport) {
            return (org.opensplice.demo.VehicleStatusTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.VehicleStatusTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleStatusTypeSupport) {
            return (org.opensplice.demo.VehicleStatusTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class VehicleStatusDataWriterHelper
{

    public static org.opensplice.demo.VehicleStatusDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleStatusDataWriter) {
            return (org.opensplice.demo.VehicleStatusDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.VehicleStatusDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleStatusDataWriter) {
            return (org.opensplice.demo.VehicleStatusDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

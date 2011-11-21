package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class VehicleStatusDataReaderHelper
{

    public static org.opensplice.demo.VehicleStatusDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleStatusDataReader) {
            return (org.opensplice.demo.VehicleStatusDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.VehicleStatusDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleStatusDataReader) {
            return (org.opensplice.demo.VehicleStatusDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

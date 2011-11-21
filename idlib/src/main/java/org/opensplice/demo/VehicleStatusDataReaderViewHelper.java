package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class VehicleStatusDataReaderViewHelper
{

    public static org.opensplice.demo.VehicleStatusDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleStatusDataReaderView) {
            return (org.opensplice.demo.VehicleStatusDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.VehicleStatusDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleStatusDataReaderView) {
            return (org.opensplice.demo.VehicleStatusDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

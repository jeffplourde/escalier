package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class VehicleRegionDataReaderViewHelper
{

    public static org.opensplice.demo.VehicleRegionDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleRegionDataReaderView) {
            return (org.opensplice.demo.VehicleRegionDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.VehicleRegionDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleRegionDataReaderView) {
            return (org.opensplice.demo.VehicleRegionDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

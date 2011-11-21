package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class VehicleRegionDataReaderHelper
{

    public static org.opensplice.demo.VehicleRegionDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleRegionDataReader) {
            return (org.opensplice.demo.VehicleRegionDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.VehicleRegionDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleRegionDataReader) {
            return (org.opensplice.demo.VehicleRegionDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

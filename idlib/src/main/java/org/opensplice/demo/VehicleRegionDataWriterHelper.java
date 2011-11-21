package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class VehicleRegionDataWriterHelper
{

    public static org.opensplice.demo.VehicleRegionDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleRegionDataWriter) {
            return (org.opensplice.demo.VehicleRegionDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.VehicleRegionDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleRegionDataWriter) {
            return (org.opensplice.demo.VehicleRegionDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

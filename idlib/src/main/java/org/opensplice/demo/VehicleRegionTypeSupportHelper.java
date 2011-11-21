package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class VehicleRegionTypeSupportHelper
{

    public static org.opensplice.demo.VehicleRegionTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleRegionTypeSupport) {
            return (org.opensplice.demo.VehicleRegionTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.VehicleRegionTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.VehicleRegionTypeSupport) {
            return (org.opensplice.demo.VehicleRegionTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

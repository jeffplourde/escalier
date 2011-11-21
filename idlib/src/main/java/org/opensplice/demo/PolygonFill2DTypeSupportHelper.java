package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class PolygonFill2DTypeSupportHelper
{

    public static org.opensplice.demo.PolygonFill2DTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.PolygonFill2DTypeSupport) {
            return (org.opensplice.demo.PolygonFill2DTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.PolygonFill2DTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.PolygonFill2DTypeSupport) {
            return (org.opensplice.demo.PolygonFill2DTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

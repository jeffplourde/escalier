package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class PolygonFill2DDataWriterHelper
{

    public static org.opensplice.demo.PolygonFill2DDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.PolygonFill2DDataWriter) {
            return (org.opensplice.demo.PolygonFill2DDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.PolygonFill2DDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.PolygonFill2DDataWriter) {
            return (org.opensplice.demo.PolygonFill2DDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

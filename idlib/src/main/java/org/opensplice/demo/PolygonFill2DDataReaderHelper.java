package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class PolygonFill2DDataReaderHelper
{

    public static org.opensplice.demo.PolygonFill2DDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.PolygonFill2DDataReader) {
            return (org.opensplice.demo.PolygonFill2DDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.PolygonFill2DDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.PolygonFill2DDataReader) {
            return (org.opensplice.demo.PolygonFill2DDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

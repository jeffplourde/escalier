package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class Shape2DDataWriterHelper
{

    public static org.opensplice.demo.Shape2DDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.Shape2DDataWriter) {
            return (org.opensplice.demo.Shape2DDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.Shape2DDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.Shape2DDataWriter) {
            return (org.opensplice.demo.Shape2DDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

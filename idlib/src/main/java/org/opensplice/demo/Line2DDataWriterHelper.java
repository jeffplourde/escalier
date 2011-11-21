package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class Line2DDataWriterHelper
{

    public static org.opensplice.demo.Line2DDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.Line2DDataWriter) {
            return (org.opensplice.demo.Line2DDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.Line2DDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.Line2DDataWriter) {
            return (org.opensplice.demo.Line2DDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

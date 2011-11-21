package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class Line2DDataReaderViewHelper
{

    public static org.opensplice.demo.Line2DDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.Line2DDataReaderView) {
            return (org.opensplice.demo.Line2DDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.Line2DDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.Line2DDataReaderView) {
            return (org.opensplice.demo.Line2DDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

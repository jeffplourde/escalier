package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class ShapeTypeDataReaderViewHelper
{

    public static org.opensplice.demo.ShapeTypeDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.ShapeTypeDataReaderView) {
            return (org.opensplice.demo.ShapeTypeDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.ShapeTypeDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.ShapeTypeDataReaderView) {
            return (org.opensplice.demo.ShapeTypeDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

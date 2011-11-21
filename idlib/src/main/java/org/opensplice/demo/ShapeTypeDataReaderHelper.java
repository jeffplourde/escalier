package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class ShapeTypeDataReaderHelper
{

    public static org.opensplice.demo.ShapeTypeDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.ShapeTypeDataReader) {
            return (org.opensplice.demo.ShapeTypeDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.ShapeTypeDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.ShapeTypeDataReader) {
            return (org.opensplice.demo.ShapeTypeDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

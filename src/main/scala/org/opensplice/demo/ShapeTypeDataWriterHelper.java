package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class ShapeTypeDataWriterHelper
{

    public static org.opensplice.demo.ShapeTypeDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.ShapeTypeDataWriter) {
            return (org.opensplice.demo.ShapeTypeDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.ShapeTypeDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.ShapeTypeDataWriter) {
            return (org.opensplice.demo.ShapeTypeDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class ShapeTypeTypeSupportHelper
{

    public static org.opensplice.demo.ShapeTypeTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.ShapeTypeTypeSupport) {
            return (org.opensplice.demo.ShapeTypeTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.ShapeTypeTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.ShapeTypeTypeSupport) {
            return (org.opensplice.demo.ShapeTypeTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

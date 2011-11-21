package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class Shape2DTypeSupportHelper
{

    public static org.opensplice.demo.Shape2DTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.Shape2DTypeSupport) {
            return (org.opensplice.demo.Shape2DTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.Shape2DTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.Shape2DTypeSupport) {
            return (org.opensplice.demo.Shape2DTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

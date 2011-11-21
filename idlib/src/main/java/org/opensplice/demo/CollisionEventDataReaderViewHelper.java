package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class CollisionEventDataReaderViewHelper
{

    public static org.opensplice.demo.CollisionEventDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.CollisionEventDataReaderView) {
            return (org.opensplice.demo.CollisionEventDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.CollisionEventDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.CollisionEventDataReaderView) {
            return (org.opensplice.demo.CollisionEventDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class CollisionEventDataReaderHelper
{

    public static org.opensplice.demo.CollisionEventDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.CollisionEventDataReader) {
            return (org.opensplice.demo.CollisionEventDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.CollisionEventDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.CollisionEventDataReader) {
            return (org.opensplice.demo.CollisionEventDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

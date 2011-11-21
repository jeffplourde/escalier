package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class CollisionEventDataWriterHelper
{

    public static org.opensplice.demo.CollisionEventDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.CollisionEventDataWriter) {
            return (org.opensplice.demo.CollisionEventDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.CollisionEventDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.CollisionEventDataWriter) {
            return (org.opensplice.demo.CollisionEventDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

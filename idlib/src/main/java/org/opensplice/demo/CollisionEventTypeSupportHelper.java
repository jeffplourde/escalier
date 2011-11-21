package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class CollisionEventTypeSupportHelper
{

    public static org.opensplice.demo.CollisionEventTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.CollisionEventTypeSupport) {
            return (org.opensplice.demo.CollisionEventTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.CollisionEventTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.CollisionEventTypeSupport) {
            return (org.opensplice.demo.CollisionEventTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

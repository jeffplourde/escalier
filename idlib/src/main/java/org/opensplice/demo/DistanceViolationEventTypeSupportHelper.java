package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class DistanceViolationEventTypeSupportHelper
{

    public static org.opensplice.demo.DistanceViolationEventTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.DistanceViolationEventTypeSupport) {
            return (org.opensplice.demo.DistanceViolationEventTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.DistanceViolationEventTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.DistanceViolationEventTypeSupport) {
            return (org.opensplice.demo.DistanceViolationEventTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

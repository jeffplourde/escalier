package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class DistanceViolationEventDataWriterHelper
{

    public static org.opensplice.demo.DistanceViolationEventDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.DistanceViolationEventDataWriter) {
            return (org.opensplice.demo.DistanceViolationEventDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.DistanceViolationEventDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.DistanceViolationEventDataWriter) {
            return (org.opensplice.demo.DistanceViolationEventDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

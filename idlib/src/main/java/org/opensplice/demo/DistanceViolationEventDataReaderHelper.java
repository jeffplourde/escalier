package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class DistanceViolationEventDataReaderHelper
{

    public static org.opensplice.demo.DistanceViolationEventDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.DistanceViolationEventDataReader) {
            return (org.opensplice.demo.DistanceViolationEventDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.DistanceViolationEventDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.DistanceViolationEventDataReader) {
            return (org.opensplice.demo.DistanceViolationEventDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

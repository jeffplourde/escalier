package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public final class DistanceViolationEventDataReaderViewHelper
{

    public static org.opensplice.demo.DistanceViolationEventDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.DistanceViolationEventDataReaderView) {
            return (org.opensplice.demo.DistanceViolationEventDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.demo.DistanceViolationEventDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.demo.DistanceViolationEventDataReaderView) {
            return (org.opensplice.demo.DistanceViolationEventDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

package org.opensplice.perf;

import org.opensplice.dds.dcps.Utilities;

public final class SimplePayloadTypeSupportHelper
{

    public static org.opensplice.perf.SimplePayloadTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SimplePayloadTypeSupport) {
            return (org.opensplice.perf.SimplePayloadTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.perf.SimplePayloadTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SimplePayloadTypeSupport) {
            return (org.opensplice.perf.SimplePayloadTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

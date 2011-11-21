package org.opensplice.perf;

import org.opensplice.dds.dcps.Utilities;

public final class SeqPayloadTypeSupportHelper
{

    public static org.opensplice.perf.SeqPayloadTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SeqPayloadTypeSupport) {
            return (org.opensplice.perf.SeqPayloadTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.perf.SeqPayloadTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SeqPayloadTypeSupport) {
            return (org.opensplice.perf.SeqPayloadTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

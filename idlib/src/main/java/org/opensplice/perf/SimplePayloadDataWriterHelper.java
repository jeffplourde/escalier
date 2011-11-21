package org.opensplice.perf;

import org.opensplice.dds.dcps.Utilities;

public final class SimplePayloadDataWriterHelper
{

    public static org.opensplice.perf.SimplePayloadDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SimplePayloadDataWriter) {
            return (org.opensplice.perf.SimplePayloadDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.perf.SimplePayloadDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SimplePayloadDataWriter) {
            return (org.opensplice.perf.SimplePayloadDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

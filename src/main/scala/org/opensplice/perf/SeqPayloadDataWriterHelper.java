package org.opensplice.perf;

import org.opensplice.dds.dcps.Utilities;

public final class SeqPayloadDataWriterHelper
{

    public static org.opensplice.perf.SeqPayloadDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SeqPayloadDataWriter) {
            return (org.opensplice.perf.SeqPayloadDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.perf.SeqPayloadDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SeqPayloadDataWriter) {
            return (org.opensplice.perf.SeqPayloadDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

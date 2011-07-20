package org.opensplice.perf;

import org.opensplice.dds.dcps.Utilities;

public final class SeqPayloadDataReaderHelper
{

    public static org.opensplice.perf.SeqPayloadDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SeqPayloadDataReader) {
            return (org.opensplice.perf.SeqPayloadDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.perf.SeqPayloadDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SeqPayloadDataReader) {
            return (org.opensplice.perf.SeqPayloadDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

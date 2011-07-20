package org.opensplice.perf;

import org.opensplice.dds.dcps.Utilities;

public final class SimplePayloadDataReaderHelper
{

    public static org.opensplice.perf.SimplePayloadDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SimplePayloadDataReader) {
            return (org.opensplice.perf.SimplePayloadDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.perf.SimplePayloadDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SimplePayloadDataReader) {
            return (org.opensplice.perf.SimplePayloadDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

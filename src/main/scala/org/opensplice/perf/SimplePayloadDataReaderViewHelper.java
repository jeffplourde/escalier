package org.opensplice.perf;

import org.opensplice.dds.dcps.Utilities;

public final class SimplePayloadDataReaderViewHelper
{

    public static org.opensplice.perf.SimplePayloadDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SimplePayloadDataReaderView) {
            return (org.opensplice.perf.SimplePayloadDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.perf.SimplePayloadDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SimplePayloadDataReaderView) {
            return (org.opensplice.perf.SimplePayloadDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

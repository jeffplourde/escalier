package org.opensplice.perf;

import org.opensplice.dds.dcps.Utilities;

public final class SeqPayloadDataReaderViewHelper
{

    public static org.opensplice.perf.SeqPayloadDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SeqPayloadDataReaderView) {
            return (org.opensplice.perf.SeqPayloadDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static org.opensplice.perf.SeqPayloadDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof org.opensplice.perf.SeqPayloadDataReaderView) {
            return (org.opensplice.perf.SeqPayloadDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

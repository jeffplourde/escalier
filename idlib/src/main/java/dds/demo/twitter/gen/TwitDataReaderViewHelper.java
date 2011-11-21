package dds.demo.twitter.gen;

import org.opensplice.dds.dcps.Utilities;

public final class TwitDataReaderViewHelper
{

    public static dds.demo.twitter.gen.TwitDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof dds.demo.twitter.gen.TwitDataReaderView) {
            return (dds.demo.twitter.gen.TwitDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static dds.demo.twitter.gen.TwitDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof dds.demo.twitter.gen.TwitDataReaderView) {
            return (dds.demo.twitter.gen.TwitDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

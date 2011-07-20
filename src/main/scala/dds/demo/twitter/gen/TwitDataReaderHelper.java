package dds.demo.twitter.gen;

import org.opensplice.dds.dcps.Utilities;

public final class TwitDataReaderHelper
{

    public static dds.demo.twitter.gen.TwitDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof dds.demo.twitter.gen.TwitDataReader) {
            return (dds.demo.twitter.gen.TwitDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static dds.demo.twitter.gen.TwitDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof dds.demo.twitter.gen.TwitDataReader) {
            return (dds.demo.twitter.gen.TwitDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

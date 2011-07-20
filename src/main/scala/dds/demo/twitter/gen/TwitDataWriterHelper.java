package dds.demo.twitter.gen;

import org.opensplice.dds.dcps.Utilities;

public final class TwitDataWriterHelper
{

    public static dds.demo.twitter.gen.TwitDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof dds.demo.twitter.gen.TwitDataWriter) {
            return (dds.demo.twitter.gen.TwitDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static dds.demo.twitter.gen.TwitDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof dds.demo.twitter.gen.TwitDataWriter) {
            return (dds.demo.twitter.gen.TwitDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

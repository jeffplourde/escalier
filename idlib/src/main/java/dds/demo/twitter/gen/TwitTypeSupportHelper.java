package dds.demo.twitter.gen;

import org.opensplice.dds.dcps.Utilities;

public final class TwitTypeSupportHelper
{

    public static dds.demo.twitter.gen.TwitTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof dds.demo.twitter.gen.TwitTypeSupport) {
            return (dds.demo.twitter.gen.TwitTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static dds.demo.twitter.gen.TwitTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof dds.demo.twitter.gen.TwitTypeSupport) {
            return (dds.demo.twitter.gen.TwitTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}

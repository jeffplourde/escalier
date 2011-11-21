package dds.demo.twitter.gen;

import org.opensplice.dds.dcps.Utilities;

public class TwitTypeSupport extends org.opensplice.dds.dcps.TypeSupportImpl implements TwitTypeSupportOperations
{
    private static java.lang.String idl_type_name = "dds::demo::twitter::gen::Twit";
    private static java.lang.String idl_key_list = "name";

    private long copyCache;

    public TwitTypeSupport()
    {
        super("dds/demo/twitter/gen/TwitDataReaderImpl",
            "dds/demo/twitter/gen/TwitDataReaderViewImpl",
            "dds/demo/twitter/gen/TwitDataWriterImpl",
            "(Ldds/demo/twitter/gen/TwitTypeSupport;)V",
            "null",
            "null");

        int success = 0;

        try {
            success = org.opensplice.dds.dcps.FooTypeSupportImpl.Alloc(
                    this,
                    idl_type_name,
                    idl_key_list,
                    dds.demo.twitter.gen.TwitMetaHolder.metaDescriptor);
        } catch (UnsatisfiedLinkError ule) {
            /*
             * JNI library is not loaded if no instance of the
             * DomainParticipantFactory exists.
             */
            DDS.DomainParticipantFactory f = DDS.DomainParticipantFactory.get_instance();

            if (f != null) {
                success = org.opensplice.dds.dcps.FooTypeSupportImpl.Alloc(
                        this,
                        idl_type_name,
                        idl_key_list,
                        dds.demo.twitter.gen.TwitMetaHolder.metaDescriptor);
            }
        }
        if (success == 0) {
            throw Utilities.createException(
                    Utilities.EXCEPTION_TYPE_NO_MEMORY,
                    "Could not allocate TwitTypeSupport." );
        }
    }

    protected void finalize() throws Throwable
    {
    	try {
    		org.opensplice.dds.dcps.FooTypeSupportImpl.Free(this);
    	}
        catch(Throwable t){
    	}
    	finally{
    	    super.finalize();
    	}
		
    }

    public long get_copyCache()
    {
        return copyCache;
    }

    public int register_type(
            DDS.DomainParticipant participant,
            java.lang.String type_name)
    {
        return org.opensplice.dds.dcps.FooTypeSupportImpl.registerType(
                this,
                participant,
                type_name);
    }

    public String get_type_name()
    {
        return idl_type_name;
    }

}

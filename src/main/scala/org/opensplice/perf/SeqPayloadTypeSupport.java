package org.opensplice.perf;

import org.opensplice.dds.dcps.Utilities;

public class SeqPayloadTypeSupport extends org.opensplice.dds.dcps.TypeSupportImpl implements SeqPayloadTypeSupportOperations
{
    private static java.lang.String idl_type_name = "org::opensplice::perf::SeqPayload";
    private static java.lang.String idl_key_list = "";

    private long copyCache;

    public SeqPayloadTypeSupport()
    {
        super("org/opensplice/perf/SeqPayloadDataReaderImpl",
            "org/opensplice/perf/SeqPayloadDataReaderViewImpl",
            "org/opensplice/perf/SeqPayloadDataWriterImpl",
            "(Lorg/opensplice/perf/SeqPayloadTypeSupport;)V",
            "null",
            "null");

        int success = 0;

        try {
            success = org.opensplice.dds.dcps.FooTypeSupportImpl.Alloc(
                    this,
                    idl_type_name,
                    idl_key_list,
                    org.opensplice.perf.SeqPayloadMetaHolder.metaDescriptor);
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
                        org.opensplice.perf.SeqPayloadMetaHolder.metaDescriptor);
            }
        }
        if (success == 0) {
            throw Utilities.createException(
                    Utilities.EXCEPTION_TYPE_NO_MEMORY,
                    "Could not allocate SeqPayloadTypeSupport." );
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

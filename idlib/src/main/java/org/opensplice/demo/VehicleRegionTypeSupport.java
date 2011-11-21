package org.opensplice.demo;

import org.opensplice.dds.dcps.Utilities;

public class VehicleRegionTypeSupport extends org.opensplice.dds.dcps.TypeSupportImpl implements VehicleRegionTypeSupportOperations
{
    private static java.lang.String idl_type_name = "org::opensplice::demo::VehicleRegion";
    private static java.lang.String idl_key_list = "vid";

    private long copyCache;

    public VehicleRegionTypeSupport()
    {
        super("org/opensplice/demo/VehicleRegionDataReaderImpl",
            "org/opensplice/demo/VehicleRegionDataReaderViewImpl",
            "org/opensplice/demo/VehicleRegionDataWriterImpl",
            "(Lorg/opensplice/demo/VehicleRegionTypeSupport;)V",
            "null",
            "null");

        int success = 0;

        try {
            success = org.opensplice.dds.dcps.FooTypeSupportImpl.Alloc(
                    this,
                    idl_type_name,
                    idl_key_list,
                    org.opensplice.demo.VehicleRegionMetaHolder.metaDescriptor);
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
                        org.opensplice.demo.VehicleRegionMetaHolder.metaDescriptor);
            }
        }
        if (success == 0) {
            throw Utilities.createException(
                    Utilities.EXCEPTION_TYPE_NO_MEMORY,
                    "Could not allocate VehicleRegionTypeSupport." );
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

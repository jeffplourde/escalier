package org.opensplice.perf;

public interface SimplePayloadDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            org.opensplice.perf.SimplePayload instance_data);

    long register_instance_w_timestamp(
            org.opensplice.perf.SimplePayload instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            org.opensplice.perf.SimplePayload instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            org.opensplice.perf.SimplePayload instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            org.opensplice.perf.SimplePayload instance_data, 
            long handle);

    int write_w_timestamp(
            org.opensplice.perf.SimplePayload instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            org.opensplice.perf.SimplePayload instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            org.opensplice.perf.SimplePayload instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            org.opensplice.perf.SimplePayload instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            org.opensplice.perf.SimplePayload instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            org.opensplice.perf.SimplePayloadHolder key_holder, 
            long handle);
    
    long lookup_instance(
            org.opensplice.perf.SimplePayload instance_data);

}

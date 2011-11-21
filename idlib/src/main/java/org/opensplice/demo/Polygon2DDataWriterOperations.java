package org.opensplice.demo;

public interface Polygon2DDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            org.opensplice.demo.Polygon2D instance_data);

    long register_instance_w_timestamp(
            org.opensplice.demo.Polygon2D instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            org.opensplice.demo.Polygon2D instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            org.opensplice.demo.Polygon2D instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            org.opensplice.demo.Polygon2D instance_data, 
            long handle);

    int write_w_timestamp(
            org.opensplice.demo.Polygon2D instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            org.opensplice.demo.Polygon2D instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            org.opensplice.demo.Polygon2D instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            org.opensplice.demo.Polygon2D instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            org.opensplice.demo.Polygon2D instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            org.opensplice.demo.Polygon2DHolder key_holder, 
            long handle);
    
    long lookup_instance(
            org.opensplice.demo.Polygon2D instance_data);

}

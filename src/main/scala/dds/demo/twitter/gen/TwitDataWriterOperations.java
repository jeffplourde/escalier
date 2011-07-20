package dds.demo.twitter.gen;

public interface TwitDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            dds.demo.twitter.gen.Twit instance_data);

    long register_instance_w_timestamp(
            dds.demo.twitter.gen.Twit instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            dds.demo.twitter.gen.Twit instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            dds.demo.twitter.gen.Twit instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            dds.demo.twitter.gen.Twit instance_data, 
            long handle);

    int write_w_timestamp(
            dds.demo.twitter.gen.Twit instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            dds.demo.twitter.gen.Twit instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            dds.demo.twitter.gen.Twit instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            dds.demo.twitter.gen.Twit instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            dds.demo.twitter.gen.Twit instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            dds.demo.twitter.gen.TwitHolder key_holder, 
            long handle);
    
    long lookup_instance(
            dds.demo.twitter.gen.Twit instance_data);

}

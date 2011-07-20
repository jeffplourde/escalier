package dds.demo.twitter.gen;

public interface TwitDataReaderOperations extends
    DDS.DataReaderOperations
{

    int read(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int take(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int read_w_condition(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            DDS.ReadCondition a_condition);

    int take_w_condition(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            DDS.ReadCondition a_condition);

    int read_next_sample(
            dds.demo.twitter.gen.TwitHolder received_data, 
            DDS.SampleInfoHolder sample_info);

    int take_next_sample(
            dds.demo.twitter.gen.TwitHolder received_data, 
            DDS.SampleInfoHolder sample_info);

    int read_instance(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples,
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int take_instance(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int read_next_instance(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int take_next_instance(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int read_next_instance_w_condition(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            DDS.ReadCondition a_condition);

    int take_next_instance_w_condition(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            DDS.ReadCondition a_condition);

    int return_loan(
            dds.demo.twitter.gen.TwitSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq);

    int get_key_value(
            dds.demo.twitter.gen.TwitHolder key_holder, 
            long handle);
    
    long lookup_instance(
            dds.demo.twitter.gen.Twit instance);

}

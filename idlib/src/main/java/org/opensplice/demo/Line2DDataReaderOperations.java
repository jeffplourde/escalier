package org.opensplice.demo;

public interface Line2DDataReaderOperations extends
    DDS.DataReaderOperations
{

    int read(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int take(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int read_w_condition(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            DDS.ReadCondition a_condition);

    int take_w_condition(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            DDS.ReadCondition a_condition);

    int read_next_sample(
            org.opensplice.demo.Line2DHolder received_data, 
            DDS.SampleInfoHolder sample_info);

    int take_next_sample(
            org.opensplice.demo.Line2DHolder received_data, 
            DDS.SampleInfoHolder sample_info);

    int read_instance(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples,
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int take_instance(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int read_next_instance(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int take_next_instance(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states);

    int read_next_instance_w_condition(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            DDS.ReadCondition a_condition);

    int take_next_instance_w_condition(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            DDS.ReadCondition a_condition);

    int return_loan(
            org.opensplice.demo.Line2DSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq);

    int get_key_value(
            org.opensplice.demo.Line2DHolder key_holder, 
            long handle);
    
    long lookup_instance(
            org.opensplice.demo.Line2D instance);

}

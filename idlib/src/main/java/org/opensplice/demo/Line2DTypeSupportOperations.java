package org.opensplice.demo;

public interface Line2DTypeSupportOperations extends
    DDS.TypeSupportOperations
{

    int register_type(
            DDS.DomainParticipant participant, 
            java.lang.String type_name);

}

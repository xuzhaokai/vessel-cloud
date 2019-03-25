package com.example.vesselstate.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "vessel_status")
public class VesselState implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Field
    private String vesselGid;

    @Field
    private String runningState;

}

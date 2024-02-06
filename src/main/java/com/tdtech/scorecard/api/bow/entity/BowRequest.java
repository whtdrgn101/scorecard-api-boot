package com.tdtech.scorecard.api.bow.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BowRequest {
    private long userId;
    private String name;
    private String manufacturer;
    private String model;
    private float drawWeight;
    private float ataLength;
    private float braceHeight;    
}

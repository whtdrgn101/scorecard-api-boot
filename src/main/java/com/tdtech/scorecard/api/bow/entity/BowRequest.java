package com.tdtech.scorecard.api.bow.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BowRequest {
    private long userId;
    private long bowTypeId;
    @NotBlank
    private String name;
    private String manufacturer;
    private String model;
    @NotNull
    private float drawWeight;
    private float ataLength;
    private float braceHeight;    
}

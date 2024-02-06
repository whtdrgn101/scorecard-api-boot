package com.tdtech.scorecard.api.bow.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BowResponse {
    private long id;
    private long userId;
    private String name;
    private String manufacturer;
    private String model;
    private float drawWeight;
    private float ataLength;
    private float braceHeight;

    public BowResponse(BowDto b) {
        this.setId(b.getId());
        this.setUserId(b.getUserId());
        this.setName(b.getName());
        this.setManufacturer(b.getManufacturer());
        this.setModel(b.getModel());
        this.setDrawWeight(b.getDrawWeight());
        this.setAtaLength(b.getAtaLength());
        this.setBraceHeight(b.getBraceHeight());
    }
}

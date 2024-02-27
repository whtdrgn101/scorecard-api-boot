package com.tdtech.scorecard.api.bow.entity;

import org.springframework.graphql.data.method.annotation.SchemaMapping;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@SchemaMapping
public class BowResponse {
    private long id;
    private long userId;
    private BowTypeResponse bowType;
    private String name;
    private String manufacturer;
    private String model;
    private float drawWeight;
    private float ataLength;
    private float braceHeight;

    public BowResponse(BowDto b) {
        this.id = b.getId();
        this.userId = b.getUserId();
        this.bowType = new BowTypeResponse(b.getBowType());
        this.name = b.getName();
        this.manufacturer = b.getManufacturer();
        this.model = b.getModel();
        this.drawWeight = b.getDrawWeight();
        this.ataLength = b.getAtaLength();
        this.braceHeight = b.getBraceHeight();
    }
}

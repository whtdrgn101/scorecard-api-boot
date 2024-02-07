package com.tdtech.scorecard.api.bow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="bow")
@AllArgsConstructor
@NoArgsConstructor
public class BowDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long id;
    private long userId;
    @OneToOne
    @JoinColumn(name="bowTypeId")
    private BowTypeDto bowType;
    private String name;
    private String manufacturer;
    private String model;
    private float drawWeight;
    private float ataLength;
    private float braceHeight;

    public BowDto(BowRequest b) {
        this.userId = b.getUserId();
        this.name = b.getName();
        this.manufacturer = b.getManufacturer();
        this.model = b.getModel();
        this.drawWeight = b.getDrawWeight();
        this.ataLength = b.getAtaLength();
        this.braceHeight = b.getBraceHeight();
    }
}

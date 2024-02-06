package com.tdtech.scorecard.api.bow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="bow_type")
@NoArgsConstructor
public class BowTypeDto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private long id;
    private String name;
    
    public BowTypeDto(BowTypeResponse bow) {
        this.id = bow.getId();
        this.name = bow.getName();
    }
}

package com.tdtech.scorecard.api.round.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="round_type")
@NoArgsConstructor
public class RoundTypeDto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private long id;
    private String name;

    public RoundTypeDto(RoundTypeResponse round) {
        this.id = round.getId();
        this.name = round.getName();
    }
}

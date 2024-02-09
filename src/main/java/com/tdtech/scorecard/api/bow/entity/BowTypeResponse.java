package com.tdtech.scorecard.api.bow.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BowTypeResponse {
    private long id;
    private String name;

    public BowTypeResponse(BowTypeDto bow){
        this.id = bow.getId();
        this.name = bow.getName();
    }
}

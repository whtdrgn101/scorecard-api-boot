package com.tdtech.scorecard.api.round.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RoundTypeResponse {

    private long id;
    private String name;

    public RoundTypeResponse(RoundTypeDto round){
        this.id = round.getId();
        this.name = round.getName();
    }
}

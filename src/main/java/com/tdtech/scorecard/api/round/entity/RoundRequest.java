package com.tdtech.scorecard.api.round.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoundRequest {
    private long id;
    private long userId;
    private long bowId;
    private long roundTypeId;
    private Date roundDate;
    private String location;
    private String notes;
    private int score;
}

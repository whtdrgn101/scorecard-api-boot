package com.tdtech.scorecard.api.round.entity;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class RoundResponse {
    private long id;
    private long userId;
    private long bowId;
    private long roundTypeId;
    private Date roundDate;
    private String location;
    private String notes;
    private int score;

    public RoundResponse(RoundDto round) {
        this.id = round.getId();
        this.roundDate = round.getRoundDate();
        this.location = round.getLocation();
        this.notes = round.getNotes();
        this.score = round.getScore();
    }
}

package com.tdtech.scorecard.api.round.entity;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class RoundResponse {
    private long id;
    private long userId;
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

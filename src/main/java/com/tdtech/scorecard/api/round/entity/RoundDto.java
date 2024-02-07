package com.tdtech.scorecard.api.round.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="round")
@AllArgsConstructor
@NoArgsConstructor
public class RoundDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userId;
    private long bowId;
    private long roundTypeId;
    private Date roundDate;
    private String location;
    private String notes;
    private int score;

    public RoundDto(RoundRequest round) {
        this.id = round.getId();
        this.userId = round.getUserId();
        this.roundDate = round.getRoundDate();
        this.location = round.getLocation();
        this.notes = round.getNotes();
        this.score = round.getScore();
    }
}

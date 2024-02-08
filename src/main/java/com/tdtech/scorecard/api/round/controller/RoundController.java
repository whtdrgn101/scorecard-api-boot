package com.tdtech.scorecard.api.round.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tdtech.scorecard.api.round.entity.RoundRequest;
import com.tdtech.scorecard.api.round.entity.RoundResponse;
import com.tdtech.scorecard.api.round.service.RoundService;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/scorecard-api/v1.0/users")
public class RoundController {
    
    @Autowired
    RoundService roundService;

    @GetMapping("/{userId}/rounds")
    public List<RoundResponse> getRoundListPaginated(@PathVariable long userId, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        return roundService.getRoundListPaginated(userId, page, size);
    }

    @PostMapping("/{userId}/rounds")
    public RoundResponse createRound(@RequestBody RoundRequest round) {
        return roundService.createRound(round);
    }
    
}

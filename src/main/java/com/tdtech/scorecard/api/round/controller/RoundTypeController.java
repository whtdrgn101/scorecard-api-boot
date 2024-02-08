package com.tdtech.scorecard.api.round.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdtech.scorecard.api.round.entity.RoundTypeResponse;
import com.tdtech.scorecard.api.round.service.RoundTypeService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/scorecard-api/v1.0")
public class RoundTypeController {

    @Autowired
    RoundTypeService roundTypeService;

    @GetMapping("/round-types")
    public List<RoundTypeResponse> getRoundTypeList() {
        return roundTypeService.getRoundTypeList();
    }
}

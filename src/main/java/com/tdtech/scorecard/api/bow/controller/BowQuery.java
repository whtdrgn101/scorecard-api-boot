package com.tdtech.scorecard.api.bow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.tdtech.scorecard.api.bow.entity.BowResponse;
import com.tdtech.scorecard.api.bow.service.BowService;

@Controller
public class BowQuery {
    
    @Autowired
    BowService bowService = null;

    @QueryMapping
    public BowResponse bowById(@Argument Integer id) {
        BowResponse response = bowService.getBowByUserIdAndId(1, id);
        return response;
    }
}

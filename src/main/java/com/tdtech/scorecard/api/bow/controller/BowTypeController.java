package com.tdtech.scorecard.api.bow.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tdtech.scorecard.api.bow.entity.BowTypeResponse;
import com.tdtech.scorecard.api.bow.service.BowTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController
@RequestMapping("/scorecard-api/v1.0")
public class BowTypeController {
    
    @Autowired
    BowTypeService bowTypeService;

    @GetMapping("/bow-types")
    public List<BowTypeResponse> getBowTypeList() {
        return bowTypeService.getBowTypesList();
    }
    
}
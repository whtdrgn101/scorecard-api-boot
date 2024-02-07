package com.tdtech.scorecard.api.bow.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.tdtech.scorecard.api.bow.entity.BowRequest;
import com.tdtech.scorecard.api.bow.entity.BowResponse;
import com.tdtech.scorecard.api.bow.service.BowService;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/scorecard-api/v1.0/users")
public class BowController {
    
    @Autowired
    private BowService bowService;

    @GetMapping("/{userId}/bows")
    public List<BowResponse> getBowListByUserId(@PathVariable long userId){
        return bowService.getBowsByUserId(userId);
    }

    @GetMapping("/{userId}/bows/{bowId}")
    public BowResponse getMethodName(@PathVariable long userId, @PathVariable long bowId) {
        return bowService.getBowByUserIdAndId(userId, bowId);
    }

    @PostMapping("/{userId}/bows")
    public BowResponse createBow(@Valid @RequestBody BowRequest bow) {
        return bowService.createBow(bow);
    }
    
    @DeleteMapping("/{userId}/bows/{bowId}")
    public void deleteBow(@PathVariable long userId, @PathVariable long bowId) {
        bowService.deleteBowByIdAndUserId(userId, bowId);
    }
}
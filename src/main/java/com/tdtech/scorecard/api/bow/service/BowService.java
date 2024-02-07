package com.tdtech.scorecard.api.bow.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdtech.scorecard.api.bow.entity.BowDto;
import com.tdtech.scorecard.api.bow.entity.BowRequest;
import com.tdtech.scorecard.api.bow.entity.BowResponse;
import com.tdtech.scorecard.api.bow.entity.BowTypeDto;
import com.tdtech.scorecard.api.bow.repository.BowRepository;
import com.tdtech.scorecard.api.bow.repository.BowTypeRepository;

@Service
public class BowService {
    
    @Autowired
    BowRepository bowRepository;
    @Autowired
    BowTypeRepository bowTypeRepository;

    public List<BowResponse> getBowsByUserId(long userId) {
        List<BowDto> found = bowRepository.findByUserId(userId);
        List<BowResponse> response = new ArrayList<BowResponse>();
        found.stream().forEach(bow -> {
            response.add(new BowResponse(bow));
        });
        return response;
    }

    public BowResponse getBowByUserIdAndId(long userId, long bowId) {
        return new BowResponse(bowRepository.findByIdAndUserId(bowId, userId));
    }

    public BowResponse createBow(BowRequest bow) {
        BowDto b = new BowDto(bow);
        BowTypeDto bowType = bowTypeRepository.findById(bow.getBowTypeId()).get();
        b.setBowType(bowType);
        bowRepository.save(b);
        return new BowResponse(b);
    }

    public void deleteBowByIdAndUserId(long userId, long bowId) {
        BowDto bow = bowRepository.findByIdAndUserId(bowId, userId);
        if (bow != null) {
            bowRepository.deleteById(bowId);
        }
    }
}

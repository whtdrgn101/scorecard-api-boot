package com.tdtech.scorecard.api.round.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.tdtech.scorecard.api.round.entity.RoundTypeDto;
import com.tdtech.scorecard.api.round.entity.RoundTypeResponse;
import com.tdtech.scorecard.api.round.repository.RoundTypeRepository;

@Service
public class RoundTypeService {
    
    @Autowired
    private RoundTypeRepository roundTypeRepository;

    public List<RoundTypeResponse> getRoundTypeList() {
        List<RoundTypeDto> roundTypes = roundTypeRepository.findAll();
        List<RoundTypeResponse> response = new ArrayList<RoundTypeResponse>();
        roundTypes.stream().forEach(rt -> {
            response.add(new RoundTypeResponse(rt));
        });
        return response;
    }
}

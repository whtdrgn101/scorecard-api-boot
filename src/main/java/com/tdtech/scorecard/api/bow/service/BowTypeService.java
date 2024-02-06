package com.tdtech.scorecard.api.bow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.tdtech.scorecard.api.bow.entity.BowTypeDto;
import com.tdtech.scorecard.api.bow.entity.BowTypeResponse;
import com.tdtech.scorecard.api.bow.repository.BowTypeRepository;

@Service
public class BowTypeService {

    @Autowired
    BowTypeRepository bowTypeRepository;

    public List<BowTypeResponse> getBowTypesList() {
        List<BowTypeDto> bowTypes = bowTypeRepository.findAll();
        List<BowTypeResponse> returnList = new ArrayList<BowTypeResponse>();
        bowTypes.stream().forEach(bowType -> {
            returnList.add(new BowTypeResponse(bowType));
        });
        return returnList;
    }
}

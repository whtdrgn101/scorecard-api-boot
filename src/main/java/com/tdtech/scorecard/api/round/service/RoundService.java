package com.tdtech.scorecard.api.round.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.tdtech.scorecard.api.round.entity.RoundDto;
import com.tdtech.scorecard.api.round.entity.RoundResponse;
import com.tdtech.scorecard.api.round.repository.RoundRepository;

@Service
public class RoundService {
    
    @Autowired
    RoundRepository roundRepository;

    public List<RoundResponse> getRoundListPaginated(long userId, int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        List<RoundResponse> response = new ArrayList<RoundResponse>();
        List<RoundDto> roundList = roundRepository.findByUserId(userId, pageable);
        roundList.stream().forEach(round -> {
            response.add(new RoundResponse(round));
        });
        return response;
    }
}

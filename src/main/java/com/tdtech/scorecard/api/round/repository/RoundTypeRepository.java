package com.tdtech.scorecard.api.round.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdtech.scorecard.api.round.entity.RoundTypeDto;

@Repository
public interface RoundTypeRepository extends JpaRepository<RoundTypeDto, Long>  {    
}

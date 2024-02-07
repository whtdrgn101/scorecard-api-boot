package com.tdtech.scorecard.api.round.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.tdtech.scorecard.api.round.entity.RoundDto;

@Repository
public interface RoundRepository extends JpaRepository<RoundDto, Long>{
    public List<RoundDto> findByUserId(long userId, Pageable pageable);
}

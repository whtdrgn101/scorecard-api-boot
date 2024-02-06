package com.tdtech.scorecard.api.bow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tdtech.scorecard.api.bow.entity.BowDto;

@Repository
public interface BowRepository extends JpaRepository<BowDto, Long>{
    public List<BowDto> findByUserId(long userId);
    public BowDto findByIdAndUserId(long id, long userId);
}

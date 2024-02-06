package com.tdtech.scorecard.api.bow.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tdtech.scorecard.api.bow.entity.BowTypeDto;

public interface BowTypeRepository extends JpaRepository<BowTypeDto, Long>{
    
}

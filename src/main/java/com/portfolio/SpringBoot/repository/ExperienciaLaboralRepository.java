package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Long>{
    
}
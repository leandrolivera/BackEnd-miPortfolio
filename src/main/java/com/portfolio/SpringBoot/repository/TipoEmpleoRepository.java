package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.TipoEmpleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpleoRepository extends JpaRepository<TipoEmpleo, Long>{
    
}
package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.ExperienciaLaboral;
import com.portfolio.SpringBoot.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService{

    @Autowired
    public ExperienciaLaboralRepository expeRepo;
    
    @Override
    public List<ExperienciaLaboral> verEmpleos() {
        return expeRepo.findAll();
    }

    @Override
    public void crearEmpleo(ExperienciaLaboral empleo) {
        expeRepo.save(empleo);
    }

    @Override
    public void borrarExperienciaLaboral(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public ExperienciaLaboral buscarExperienciaLaboral(Long id) {
        return expeRepo.findById(id).orElse(null);
    }
    
}

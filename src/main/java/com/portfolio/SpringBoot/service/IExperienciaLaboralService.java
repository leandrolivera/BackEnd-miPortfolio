package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.ExperienciaLaboral;
import java.util.List;

public interface IExperienciaLaboralService {
        
    public List<ExperienciaLaboral> verEmpleos();
    
    public void crearEmpleo(ExperienciaLaboral empleo);
    
    public void borrarExperienciaLaboral(Long id);
    
    public ExperienciaLaboral buscarExperienciaLaboral(Long id);
    
}

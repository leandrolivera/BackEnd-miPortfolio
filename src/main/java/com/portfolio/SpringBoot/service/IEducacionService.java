package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Educacion;
import java.util.List;

public interface IEducacionService {

    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
    
    public Educacion buscarEducacion(Long id);
    
}

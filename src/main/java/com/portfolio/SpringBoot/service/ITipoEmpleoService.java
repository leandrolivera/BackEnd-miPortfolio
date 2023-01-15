package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.TipoEmpleo;
import java.util.List;

public interface ITipoEmpleoService {

    public List<TipoEmpleo> verTiposEmpleo();
    
    public void crearTipoEmpleo(TipoEmpleo tipo);
    
    public void borrarTipoEmpleo(Long id);
    
    public TipoEmpleo buscarTipoEmpleo(Long id);
    
}

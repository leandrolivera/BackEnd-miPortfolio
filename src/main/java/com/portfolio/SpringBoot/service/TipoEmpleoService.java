package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.TipoEmpleo;
import com.portfolio.SpringBoot.repository.TipoEmpleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleoService implements ITipoEmpleoService{

    @Autowired
    public TipoEmpleoRepository tipoRepo;
    
    @Override
    public List<TipoEmpleo> verTiposEmpleo() {
        return tipoRepo.findAll();
    }

    @Override
    public void crearTipoEmpleo(TipoEmpleo tipo) {
        tipoRepo.save(tipo);
    }

    @Override
    public void borrarTipoEmpleo(Long id) {
        tipoRepo.deleteById(id);
    }

    @Override
    public TipoEmpleo buscarTipoEmpleo(Long id) {
        return tipoRepo.findById(id).orElse(null);
    }
    
}

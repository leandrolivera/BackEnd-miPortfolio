package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TipoEmpleo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreTipoEmpleo;

    public TipoEmpleo() {
    }

    public TipoEmpleo(Long id, String nombreTipoEmpleo) {
        this.id = id;
        this.nombreTipoEmpleo = nombreTipoEmpleo;
    }
    
}

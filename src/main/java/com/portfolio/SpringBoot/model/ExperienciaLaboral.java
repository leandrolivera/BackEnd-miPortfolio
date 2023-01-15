package com.portfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEmpresa;
    private String puesto;
    private Boolean esTrabajoActual;
    private Date fechaInicio;
    private Date fechaFin;
    private String urlFotoEmpresa;
    private Long idPersona;
    private Long idTipoEmpleo;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String nombreEmpresa, String puesto, Boolean esTrabajoActual, Date fechaInicio, Date fechaFin, String urlFotoEmpresa, Long idPersona, Long idTipoEmpleo) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlFotoEmpresa = urlFotoEmpresa;
        this.idPersona = idPersona;
        this.idTipoEmpleo = idTipoEmpleo;
    }

}

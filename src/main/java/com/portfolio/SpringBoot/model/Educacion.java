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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreInstitucion;
    private String carrera;
    private Boolean cursaActualmente;
    private Date fechaInicio;
    private Date fechaFin;
    private String urlFotoInstitucion;
    private Long idPersona;

    public Educacion() {
    }

    public Educacion(Long id, String nombreInstitucion, String carrera, Boolean cursaActualmente, Date fechaInicio, Date fechaFin, String urlFotoInstitucion, Long idPersona) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.carrera = carrera;
        this.cursaActualmente = cursaActualmente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlFotoInstitucion = urlFotoInstitucion;
        this.idPersona = idPersona;
    }

    
    
}

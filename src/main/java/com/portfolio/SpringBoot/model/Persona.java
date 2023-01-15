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
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private Date fecha_nac;
    private String telefono;
    private String correo;
    private String sobre_mi;
    private String url_foto;
    
    public Persona(){
    }

    public Persona(Long id, String nombre, String apellido, String domicilio, Date fecha_nac, String telefono, String correo, String sobre_mi, String url_foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
    }
    
    
}

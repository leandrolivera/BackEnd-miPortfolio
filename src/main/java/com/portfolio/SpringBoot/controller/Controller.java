package com.portfolio.SpringBoot.Controller;

import com.portfolio.SpringBoot.model.Educacion;
import com.portfolio.SpringBoot.model.ExperienciaLaboral;
import com.portfolio.SpringBoot.model.Login;
import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.model.TipoEmpleo;
import com.portfolio.SpringBoot.service.IEducacionService;
import com.portfolio.SpringBoot.service.IExperienciaLaboralService;
import com.portfolio.SpringBoot.service.ILoginService;
import com.portfolio.SpringBoot.service.IPersonaService;
import com.portfolio.SpringBoot.service.ITipoEmpleoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
        
    @Autowired
    private IPersonaService persoServ;
    
    @Autowired
    private IExperienciaLaboralService expeServ;
    
    @Autowired
    private IEducacionService eduServ;
    
    @Autowired
    private ITipoEmpleoService tipoServ;
    
    @Autowired
    private ILoginService login;
    
    @GetMapping("/auth/login")
    public List<Login> login(){
        return login.verLogins();
    }
    
    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody    
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete-persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PostMapping("/new/empleo")
    public void agregarExperienciaLaboral (@RequestBody ExperienciaLaboral expe){
        expeServ.crearEmpleo(expe);
    }
    
    @GetMapping("/ver/empleos")
    @ResponseBody    
    public List<ExperienciaLaboral> verEmpleos(){
        return expeServ.verEmpleos();
    }
    
    @DeleteMapping("/delete-experiencia-laboral/{id}")
    public void borrarExperienciaLaboral(@PathVariable Long id){
        expeServ.borrarExperienciaLaboral(id);
    }
    
    @PostMapping("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/ver/educaciones")
    @ResponseBody    
    public List<Educacion> verEducaciones(){
        return eduServ.verEducacion();
    }
    
    @DeleteMapping("/delete-educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    @PostMapping("/new/tipo-empleo")
    public void agregarTipoEmpleo (@RequestBody TipoEmpleo tipo){
        tipoServ.crearTipoEmpleo(tipo);
    }
    
    @GetMapping("/ver/tipos-empleo")
    @ResponseBody    
    public List<TipoEmpleo> verTiposEmpleo(){
        return tipoServ.verTiposEmpleo();
    }
    
    @DeleteMapping("/delete-empleo/{id}")
    public void borrarTipoEmpleo(@PathVariable Long id){
        tipoServ.borrarTipoEmpleo(id);
    }
    
    
    
}

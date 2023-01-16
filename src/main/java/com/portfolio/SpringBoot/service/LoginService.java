package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Login;
import com.portfolio.SpringBoot.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{

    @Autowired
    public LoginRepository loginRepo;
        
    @Override
    public Login buscarLogin(Long id) {
        return loginRepo.findById(id).orElse(null);
    }

    @Override
    public List<Login> verLogins() {
        return loginRepo.findAll();
    }
    
}

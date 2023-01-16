
package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Login;
import java.util.List;

public interface ILoginService {
    
    public List<Login> verLogins();
    
    public Login buscarLogin(Long id);
    
}

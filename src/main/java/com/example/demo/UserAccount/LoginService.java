package com.example.demo.service;

import com.example.demo.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserAccountRepository userAccountRepository;


    @Autowired
    private UserAccountService userAccountService;


    public boolean validateUser(String username, String password) {
        return userAccountService.validateUser(username, password);





    }
}


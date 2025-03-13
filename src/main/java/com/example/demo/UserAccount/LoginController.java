package com.example.demo.controller;



import com.example.demo.model.LoginRequest;
import com.example.demo.model.LoginResponse;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(path = "api/v1/login")
@CrossOrigin(origins = "http://localhost:63342")

public class LoginController {


        @Autowired
        private LoginService loginService;


        @PostMapping
        public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
            System.out.println("loginRequest "+loginRequest);
            String username = loginRequest.getUserName();
            String password = loginRequest.getPassword();

            boolean isValid = loginService.validateUser(username, password);

            if (isValid) {

                return ResponseEntity.ok(new LoginResponse(true, "Login successful"));
            } else {

                return ResponseEntity.ok(new LoginResponse(false, "Invalid username or password"));
            }
        }

}

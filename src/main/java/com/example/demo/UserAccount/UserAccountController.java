package com.example.demo.UserAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.remote.JMXAuthenticator;
import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/useraccount")
@CrossOrigin(origins="*")



public class UserAccountController {
//    private final UserAccount userAccount;
//    private List<UserAccount> UserAccountService;

    @Autowired
    UserAccountService userAccountService;


    //    public UserAccountController(UserAccountService userAccountService, UserAccount userAccount){
//        this.userAccount = userAccount;
//
//    }
    @GetMapping("/useraccount/{userName}")
    public ResponseEntity<UserAccount> getUserDetails(@PathVariable String userName) {
        System.out.println("userName "+userName);
        UserAccount userAccount = userAccountService.getUserDetails(userName);

        return ResponseEntity.ok(userAccount);
    }
    @PostMapping
    public void addUserAccount(@RequestBody UserAccount userAccount) {
        userAccountService.addUserAccount(userAccount);

    }

}




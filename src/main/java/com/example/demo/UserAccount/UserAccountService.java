package com.example.demo.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service

public class UserAccountService {


    private final UserAccountRepository useraccountRepository;
        public UserAccountService(UserAccountRepository useraccountRepository) {
            this.useraccountRepository = useraccountRepository;
        }


    public List<UserAccount> getUserAccount() {
        return useraccountRepository.findAll();

    }
    public UserAccount postUserAccount(UserAccount userAccount) {
        return useraccountRepository.save(userAccount);
    }

    public void addUserAccount(UserAccount userAccount) {
        userAccount.setUseruniqueId(998);
        useraccountRepository.save(userAccount);


        }

    }





 





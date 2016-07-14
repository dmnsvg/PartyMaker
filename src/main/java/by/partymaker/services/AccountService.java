package by.partymaker.services;

import by.partymaker.entities.Account;
import by.partymaker.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 15.07.2016
 *
 * @author user
 */
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account getAccount(){
        return accountRepository.findOne("1");
    }
}

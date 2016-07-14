package by.partymaker.controllers;

import by.partymaker.entities.Account;
import by.partymaker.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 15.07.2016
 *
 * @author user
 */
@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public Account getAccount() {
        return accountService.getAccount();
    }
}

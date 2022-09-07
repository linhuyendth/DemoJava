package com.linx.controller;

import com.linx.entity.Account;
import com.linx.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    private IAccountRepository repo;

    @GetMapping
    public List<Account> getAll() {
        return repo.findAll();
    }

    @GetMapping("abc")
    public List<Account> getAll2() {
        return repo.findAll();
    }
}

package com.mrblue.BarberHub.account.controller;

import com.mrblue.BarberHub.account.entity.Account;
import com.mrblue.BarberHub.account.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/accounts")
public class AccountController {
    final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    ResponseEntity<Account> insert(@RequestBody Account obj){
        obj = accountService.insert(obj);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }

    @GetMapping("/{id}")
    ResponseEntity<Account> findByID(@PathVariable Long id){

        Account obj = accountService.findByID(id);

        return ResponseEntity.ok(obj);
    }

    @GetMapping
    ResponseEntity<List<Account>> findAll(){
        List<Account> obj = accountService.findAll();
        return ResponseEntity.ok(obj);
    }

    @PutMapping("/{id}")
    ResponseEntity<Account> update(@PathVariable Long id, @RequestBody Account obj){

        Account account = accountService.findByID(id);

        Account updatedAccount = accountService.update(account, obj);
        return ResponseEntity.ok(updatedAccount);
    }

    @DeleteMapping("/{id}")
        ResponseEntity<Void> delete(@PathVariable Long id){

        accountService.findByID(id);

        accountService.deleteByID(id);
        return ResponseEntity.noContent().build();
    }

}

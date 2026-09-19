package com.mrblue.BarberHub.account.service;

import com.mrblue.BarberHub.account.entity.Account;
import com.mrblue.BarberHub.account.exception.ResourceNotFoundException;
import com.mrblue.BarberHub.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account insert(Account obj){
        return accountRepository.save(obj);
    }

    public Account findByID(Long id) {
        Optional<Account> account = accountRepository.findById(id);

        if (account.isEmpty()) {
            throw new ResourceNotFoundException("Account not found: " + id);
        }

        return account.get();
    }

    public List<Account> findAll(){
        return accountRepository.findAll();
    }

    public Account update(Account oldObj, Account newObj){
        oldObj = updateAccount(oldObj, newObj);
        return accountRepository.save(oldObj);
    }

    public Account updateAccount(Account old_obj, Account new_obj){
        old_obj.setName(new_obj.getName());
        old_obj.setEmail(new_obj.getEmail());
        return old_obj;
    }

    public void deleteByID(Long id){
        accountRepository.deleteById(id);
    }

}

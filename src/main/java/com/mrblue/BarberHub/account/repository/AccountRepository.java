package com.mrblue.BarberHub.account.repository;

import com.mrblue.BarberHub.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}

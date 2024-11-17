package com.codev13.accountservice.data.repository;

import com.codev13.accountservice.data.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}

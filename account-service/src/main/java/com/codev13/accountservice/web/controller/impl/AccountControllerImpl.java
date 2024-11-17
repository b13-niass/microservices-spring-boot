package com.codev13.accountservice.web.controller.impl;

import com.codev13.accountservice.client.CustomerClient;
import com.codev13.accountservice.data.entity.BankAccount;
import com.codev13.accountservice.data.model.Customer;
import com.codev13.accountservice.data.repository.BankAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class AccountControllerImpl {
    private final BankAccountRepository accountRepository;
    private final CustomerClient customerClient;

    @GetMapping("/accounts")
    public List<BankAccount> accountList(){
        return accountRepository.findAll();
    }

    @GetMapping("/accounts/{id}")
    public BankAccount getAccountById(@PathVariable String id){
        BankAccount bankAccount = accountRepository.findById(id).orElse(null);
        Customer customer = customerClient.findCustomerById(bankAccount.getCustomerId());
        bankAccount.setCustomer(customer);
        return bankAccount;
    }

}

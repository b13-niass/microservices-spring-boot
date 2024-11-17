package com.codev13.accountservice.data.entity;

import com.codev13.accountservice.data.model.Customer;
import com.codev13.accountservice.enums.AccountType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter @Setter @ToString
@Entity
public class BankAccount {
    @Id
    private String accountId;
    private  Double solde;
    private LocalDate createdAt;
    private String currency;
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;
}

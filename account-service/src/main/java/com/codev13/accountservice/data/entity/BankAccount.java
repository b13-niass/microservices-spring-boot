package com.codev13.accountservice.data.entity;

import com.codev13.accountservice.data.model.Customer;
import com.codev13.accountservice.enums.AccountType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter @Setter @ToString @Builder @AllArgsConstructor @NoArgsConstructor
@Entity
public class BankAccount {
    @Id
    private String accountId;
    private  double balance;
    private LocalDate createdAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;
}

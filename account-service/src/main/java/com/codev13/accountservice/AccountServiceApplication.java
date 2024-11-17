package com.codev13.accountservice;

import com.codev13.accountservice.data.entity.BankAccount;
import com.codev13.accountservice.data.repository.BankAccountRepository;
import com.codev13.accountservice.enums.AccountType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(BankAccountRepository accountRepository){
//        return args -> {
//            accountRepository.save(
//                    BankAccount.builder()
//                            .accountId(UUID.randomUUID().toString())
//                            .currency("MAD")
//                            .balance(10000.0)
//                            .createdAt(LocalDate.now())
//                            .type(AccountType.CURRENT_ACCOUNT)
//                            .customerId(1L)
//                            .build()
//            );
//            accountRepository.save(
//                    BankAccount.builder()
//                            .accountId(UUID.randomUUID().toString())
//                            .currency("MAD")
//                            .balance(12000.0)
//                            .createdAt(LocalDate.now())
//                            .type(AccountType.SAVING_ACCOUNT)
//                            .customerId(2L)
//                            .build()
//            );
//        };
//    }
}

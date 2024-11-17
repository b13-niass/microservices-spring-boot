package com.codev13.customerservice;

import com.codev13.customerservice.data.entity.Customer;
import com.codev13.customerservice.data.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
//        return args -> {
//            customerRepository.save(Customer.builder()
//                    .firstName("Mouhamad")
//                    .lastName("Elhannaoui")
//                    .email("mouhamad.cisse@example.com")
//                    .build());
//            customerRepository.save(Customer.builder()
//                    .firstName("Hassan")
//                    .lastName("Cisse")
//                    .email("hassan.cisse@example.com")
//                    .build());
//        };
//    }
}

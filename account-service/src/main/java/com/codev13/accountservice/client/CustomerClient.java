package com.codev13.accountservice.client;

import com.codev13.accountservice.data.model.Customer;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerClient {

    @GetMapping("/customers/{id}")
    @CircuitBreaker(name = "customerService", fallbackMethod = "fallbackFindCustomerById")
    Customer findCustomerById(@PathVariable Long id);

    @GetMapping("/customers")
    List<Customer> findAllCustomers();

    default Customer fallbackFindCustomerById(Long id, Exception e){
        System.out.println(e.getMessage());
        return Customer.builder()
               .id(id)
               .firstName("Fallback Customer")
               .lastName("Fallback LastName")
               .email("fallback@email.com").build();
    }
}

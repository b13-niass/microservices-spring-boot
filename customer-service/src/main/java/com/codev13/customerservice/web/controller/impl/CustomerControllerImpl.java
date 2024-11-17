package com.codev13.customerservice.web.controller.impl;

import com.codev13.customerservice.data.entity.Customer;
import com.codev13.customerservice.data.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerControllerImpl {
   private final CustomerRepository customerRepository;

   @GetMapping("/customers")
   public List<Customer> customerList(){
       return customerRepository.findAll();
   }
   @GetMapping("/customers/{id}")
   public Customer getCustomerById(@PathVariable Long id){
       return customerRepository.findById(id).orElse(null);
   }

}

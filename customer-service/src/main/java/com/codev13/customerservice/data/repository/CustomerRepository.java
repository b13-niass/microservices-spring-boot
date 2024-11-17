package com.codev13.customerservice.data.repository;

import com.codev13.customerservice.data.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

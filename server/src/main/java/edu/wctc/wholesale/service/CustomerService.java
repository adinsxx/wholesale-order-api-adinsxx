package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Optional<Customer> getCustomer(int id);

    void save(Customer customer);
    void delete(int id);
}

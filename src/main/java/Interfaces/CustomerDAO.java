package Interfaces;
import Entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> findAll();

    List<Customer> findById();

    List<Customer> findByName();

    boolean insertCustomer(Customer customer);

    boolean updateCustomer(Customer customer);

    boolean deleteCustomer(Customer customer);
}


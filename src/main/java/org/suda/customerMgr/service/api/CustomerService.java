package org.suda.customerMgr.service.api;

import org.suda.customerMgr.domain.Customer;

import java.util.List;

public interface CustomerService {

    public boolean addCustomer(Customer customer);

    public List<Customer> listCustomer();

    public void removeCustomer(Integer id);
}

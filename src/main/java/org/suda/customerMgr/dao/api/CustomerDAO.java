package org.suda.customerMgr.dao.api;


import org.suda.customerMgr.domain.Customer;

import java.util.List;

public interface CustomerDAO {

    public boolean addCustomer(Customer customer);

    public List<Customer> listCustomer();

    public void removeCustomer(Integer id);
}

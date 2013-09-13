package org.suda.customerMgr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.suda.customerMgr.dao.api.CustomerDAO;
import org.suda.customerMgr.domain.Customer;
import org.suda.customerMgr.service.api.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public boolean addCustomer(Customer customer) {
        return customerDAO.addCustomer(customer);
    }

    @Transactional
    public List<Customer> listCustomer() {

        return customerDAO.listCustomer();
    }

    @Transactional
    public void removeCustomer(Integer id) {
        customerDAO.removeCustomer(id);
    }

    public CustomerDAO getCustomerDAO() {
        return customerDAO;
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}

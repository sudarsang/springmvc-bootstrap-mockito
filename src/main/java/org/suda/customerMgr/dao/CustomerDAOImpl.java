package org.suda.customerMgr.dao;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.suda.customerMgr.dao.api.CustomerDAO;
import org.suda.customerMgr.domain.Customer;

import java.util.List;


@Repository
public class CustomerDAOImpl implements CustomerDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDAOImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    public boolean addCustomer(Customer customer) {
        LOGGER.info("Adding customer: " + customer);
        try {
            sessionFactory.getCurrentSession().save(customer);
            return true;
        } catch (Exception e) {
            LOGGER.error("Error in adding Customer", e);
        }
        return false;
    }

    public List<Customer> listCustomer() {
        LOGGER.info("Listing all users ");
        return sessionFactory.getCurrentSession().createQuery("from Customer").list();
    }

    public void removeCustomer(Integer id) {
        Customer customer = (Customer) sessionFactory.getCurrentSession().load(
                Customer.class, id);
        if (null != customer) {
            sessionFactory.getCurrentSession().delete(customer);
        }

    }
}

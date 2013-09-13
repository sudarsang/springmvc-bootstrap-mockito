package org.suda.customerMgr.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.suda.customerMgr.dao.api.CustomerDAO;
import org.suda.customerMgr.domain.Customer;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * User: Sudarsan
 * Date: 9/7/13
 * Email: gk.sudarsan@yahoo.com
 */
public class CustomerServiceImplTest {
    @Mock
    private CustomerDAO customerDAO;
    private CustomerServiceImpl customerService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        customerService = new CustomerServiceImpl();
        customerService.setCustomerDAO(customerDAO);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddCustomer() throws Exception {
        Customer customer = new Customer();
        customer.setFirstname("John");
        customer.setLastname("Isaac");
        customer.setEmail("abc@xyz.com");
        customer.setTelephone("0466985854");

        when(customerDAO.addCustomer(customer)).thenReturn(true);
        assertTrue(customerService.addCustomer(customer));
    }

    @Test
    public void testListCustomer() throws Exception {
        Customer customer = new Customer();
        customer.setFirstname("John");
        customer.setLastname("Isaac");
        customer.setEmail("abc@xyz.com");
        customer.setTelephone("0466985854");

        List mockedList = mock(List.class);
        mockedList.add("abc");
        System.out.println(mockedList.size());
        when(customerDAO.listCustomer()).thenReturn(mockedList);
        when(mockedList.get(0)).thenReturn(customer);

        List cusList = customerDAO.listCustomer();
        assertNotNull(cusList);
        Customer testCustomer = (Customer) cusList.get(0);

        assertNotNull(testCustomer);
        assertEquals("Asserting First Name", "John", testCustomer.getFirstname());
        assertEquals("Asserting Last Name", "Isaac", testCustomer.getLastname());
        assertEquals("Asserting Email", "abc@xyz.com", testCustomer.getEmail());
        assertEquals("Asserting Phone", "0466985854", testCustomer.getTelephone());

    }


}

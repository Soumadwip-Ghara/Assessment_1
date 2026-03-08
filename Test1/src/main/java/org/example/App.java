package org.example;

import org.example.dao.CustomerDAO;
import org.example.model.Customer;
import org.example.model.Order;

import java.time.LocalDate;

public class App
{
    public static void main(String[]args){
        CustomerDAO customerDAO = new CustomerDAO();
        Order order = new Order("101", "HP", 1, 50000, LocalDate.now());
   
        Customer customer = new Customer("Souma", "souma@gmail.com", "Male", 9867589944L, LocalDate.now());
        
        
        customer.setOrder(order);
        order.setCustomer(customer);

        
        customerDAO.insertCustomer(customer);

        
        Customer c = customerDAO.getCustomerById(1);
        System.out.println(c.getCustomerName());

        
        Customer c_m = customerDAO.getCustomerByEmail("souma@gmail.com");
        System.out.println(c_m.getCustomerName());

    }
}

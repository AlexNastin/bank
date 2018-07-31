package com.pis.bank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankApplicationTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void repositoryCrudOperations() {
        Customer sample = sampleCustomer();
        customerRepository.save(sample);
        Optional<Customer> savedCustomer = customerRepository.findById(sample.getName());
        assertThat(savedCustomer.get().getName(), equalTo("Sample Customer"));
        customerRepository.delete(savedCustomer.get());
    }

    private Customer sampleCustomer() {
        Customer customer = new Customer();
        customer.setName("Sample Customer");
        customer.setValue("100 $");
        return customer;
    }
}

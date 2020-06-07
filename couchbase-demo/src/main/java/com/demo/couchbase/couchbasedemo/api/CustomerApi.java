/**
 *
 */
package com.demo.couchbase.couchbasedemo.api;

import com.demo.couchbase.couchbasedemo.model.Customer;
import com.demo.couchbase.couchbasedemo.repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: Insert description here.
 *
 * @author vijaykumar02
 * @version $Revision: 1.10 $
 */
@RestController
public class CustomerApi {

    @Autowired
    private CustomerRepository repository;


    @PostConstruct
    public void init(){
        repository.saveAll(
                Stream.of(new Customer(111, "Chirs",new String[]{"Newyork", "USA"}),
                        new Customer(112, "Martin",new String[]{"Newsouth wales", "UK"})).collect(Collectors.toList())
                );
    }

    @GetMapping("/fetchAllCustomers")
    public List<Customer> getAll(){
      return  repository.findAll();
    }

}

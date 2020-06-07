/**
 *
 */
package com.demo.couchbase.couchbasedemo.repository;

import com.demo.couchbase.couchbasedemo.model.Customer;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

/**
 * TODO: Insert description here.
 *
 * @author vijaykumar
 * @version $Revision: 1.10 $
 */
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "customer", viewName = "all")
public interface CustomerRepository extends CouchbaseRepository<Customer, Integer> {
}

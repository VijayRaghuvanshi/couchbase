/**
 *
 */
package com.casestudy.couchbase.ecommerce.data;

import com.casestudy.couchbase.ecommerce.model.Customer;
import com.casestudy.couchbase.ecommerce.model.Product;
import com.casestudy.couchbase.ecommerce.model.Purchase;
import com.casestudy.couchbase.ecommerce.model.Reviews;

import java.util.Set;

/**
 * TODO: Insert description here.
 *
 * @author vijay
 * @version $Revision: 1.10 $
 */
public interface DataFileReader {

    Set<Product> readProduct();

    Set<Reviews> readReview();

    Set<Customer> readCustomer();

    Set<Purchase> readPurchase();


}

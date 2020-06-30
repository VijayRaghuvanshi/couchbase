/**
 *
 */
package com.casestudy.couchbase.ecommerce.data;

import com.casestudy.couchbase.ecommerce.model.Product;

import java.util.Set;

/**
 * TODO: Insert description here.
 *
 * @author vijay
 * @version $Revision: 1.10 $
 */
public interface DataFileReader {

    Set<Product> readProduct();
}

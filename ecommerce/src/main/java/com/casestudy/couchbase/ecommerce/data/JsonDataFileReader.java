/**
 *
 */
package com.casestudy.couchbase.ecommerce.data;

import com.casestudy.couchbase.ecommerce.constant.EcommerceConsts;
import com.casestudy.couchbase.ecommerce.model.Customer;
import com.casestudy.couchbase.ecommerce.model.Product;
import com.casestudy.couchbase.ecommerce.model.Purchase;
import com.casestudy.couchbase.ecommerce.model.Reviews;
import com.couchbase.client.core.deps.com.fasterxml.jackson.core.type.TypeReference;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Set;

import org.springframework.stereotype.Service;

/**
 * Api to load data from JSON.
 *
 * @author vijaykumar
 * @version $Revision: 1.10 $
 */
@Service
public class JsonDataFileReader implements DataFileReader {

    @Override
    public Set<Product> readProduct() {
        return loadData(new TypeReference<Set<Product>>() {
        }, EcommerceConsts.PRODUCT_DATA_FILE_PATH);
    }

    @Override
    public Set<Reviews> readReview() {
        return loadData(new TypeReference<Set<Reviews>>() {
        }, EcommerceConsts.REVIEW_DATA_FILE_PATH);
    }

    @Override
    public Set<Customer> readCustomer() {
        return loadData(new TypeReference<Set<Customer>>() {
        }, EcommerceConsts.CUSTOMER_DATA_FILE_PATH);
    }

    @Override
    public Set<Purchase> readPurchase() {
        return loadData(new TypeReference<Set<Purchase>>() {
        }, EcommerceConsts.PURCHASES_DATA_FILE_PATH);
    }

    /**
     * Generic json data loader.
     *
     * @param typeReference
     * @param filePath
     *            json file path
     * @return Set<T> set of generic object
     */
    private <T> Set<T> loadData(final TypeReference<Set<T>> typeReference,
            final String filePath) {
        final ObjectMapper objectMapper = new ObjectMapper();
        Set<T> dataSet = null;
        try {
            dataSet = objectMapper.readValue(
                    getClass().getClassLoader().getResource(filePath),
                    typeReference);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return dataSet;

    }

    public static void main(String... arg) {
        final JsonDataFileReader obj = new JsonDataFileReader();
        System.out.print(obj.readProduct().size());
    }

}

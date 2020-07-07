/**
 *
 */
package com.casestudy.couchbase.ecommerce.service.impl;

import com.casestudy.couchbase.connection.CouchbaseConnectionFactory;
import com.casestudy.couchbase.ecommerce.data.DataFileReader;
import com.casestudy.couchbase.ecommerce.model.Customer;
import com.casestudy.couchbase.ecommerce.model.Product;
import com.casestudy.couchbase.ecommerce.model.Purchase;
import com.casestudy.couchbase.ecommerce.model.Reviews;
import com.casestudy.couchbase.ecommerce.service.DataUpoadService;
import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.kv.MutationResult;

import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Ecommerce data upload service impl.
 *
 * @author vijaykumar
 * @version $Revision: 1.10 $
 */
@Service
public class EcommerceDataUploadServiceImpl implements DataUpoadService {

    @Autowired
    private DataFileReader dataReader;

    @Autowired
    private CouchbaseConnectionFactory connnectionFactory;

    /**
     * {@inheritDoc}
     */
    @Override
    public void upload() {

        runProductDataUploader();
        runReviewDataUploader();
        runCustomerDataUploader();
        runPurchaseDataUploader();

    }

    private void runProductDataUploader() {
        final Bucket productBucket = connnectionFactory.getProductBucket();
        final Collection collection = productBucket.defaultCollection();
        final Set<Product> productData = dataReader.readProduct();
        if (productData != null) {
            MutationResult mutationResult = null;
            for (final Product product : productData) {
                /*
                 * mutationResult = collection.insert( product.getProductId(),
                 * product);
                 */

                mutationResult = collection.upsert(
                        product.getProductId(),
                        product);
                System.out.println(
                        "product "
                                + product.getProductId()
                                + " document has been created with cas "
                                + mutationResult.cas()
                                + "and mutation token: "
                                + mutationResult.mutationToken());
            }
        }
    }

    private void runReviewDataUploader() {
        final Bucket reviewBucket = connnectionFactory.getReviewBucket();
        final Collection collection = reviewBucket.defaultCollection();
        final Set<Reviews> productData = dataReader.readReview();
        if (productData != null) {
            MutationResult mutationResult = null;
            for (final Reviews review : productData) {
                mutationResult = collection.upsert(
                        review.getReviewId(),
                        review);
                System.out.println(
                        "review "
                                + review.getReviewId()
                                + " document has been created with cas "
                                + mutationResult.cas()
                                + "and mutation token: "
                                + mutationResult.mutationToken());
            }
        }
    }

    private void runCustomerDataUploader() {
        final Bucket bucket = connnectionFactory.getCustomerBucket();
        final Collection collection = bucket.defaultCollection();
        final Set<Customer> data = dataReader.readCustomer();
        if (data != null) {
            MutationResult mutationResult = null;
            for (final Customer d : data) {
                mutationResult = collection.upsert(d.getCustomerId(), d);
                System.out.println(
                        "Customer "
                                + d.getCustomerId()
                                + " document has been created with cas "
                                + mutationResult.cas()
                                + "and mutation token: "
                                + mutationResult.mutationToken());
            }
        }
    }

    private void runPurchaseDataUploader() {
        final Bucket bucket = connnectionFactory.getPurchaseBucket();
        final Collection collection = bucket.defaultCollection();
        final Set<Purchase> data = dataReader.readPurchase();
        if (data != null) {
            MutationResult mutationResult = null;
            for (final Purchase d : data) {
                mutationResult = collection.upsert(d.getPurchaseId(), d);
                System.out.println(
                        "Purchase "
                                + d.getPurchaseId()
                                + " document has been created with cas "
                                + mutationResult.cas()
                                + "and mutation token: "
                                + mutationResult.mutationToken());
            }
        }
    }

    @PostConstruct
    private void init() {
        //runPurchaseDataUploader();
    }
}

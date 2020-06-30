/**
 *
 */
package com.casestudy.couchbase.ecommerce.service.impl;

import com.casestudy.couchbase.connection.CouchbaseConnectionFactory;
import com.casestudy.couchbase.ecommerce.data.DataFileReader;
import com.casestudy.couchbase.ecommerce.model.Product;
import com.casestudy.couchbase.ecommerce.service.ProductService;
import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.kv.MutationResult;

import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service.
 *
 * @author vijaykumar02
 * @version $Revision: 1.10 $
 */
@Service
class ProductServiceImpl implements ProductService {

    @Autowired
    private DataFileReader dataReader;

    @Autowired
    private CouchbaseConnectionFactory connnectionFactory;

    @Override
    public void uploadData() {
        final Bucket productBucket = connnectionFactory.getProductBucket();
        final Collection collection = productBucket.defaultCollection();
        final Set<Product> productData = dataReader.readProduct();
        if (productData != null) {
            MutationResult mutationResult = null;
            for (final Product product : productData) {
                if (!"product837".equalsIgnoreCase(product.getProductId())) {
                    mutationResult = collection.insert(
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
    }

    @PostConstruct
    private void createData() {
        //product data has been uploaded
       // uploadData();
    }

}

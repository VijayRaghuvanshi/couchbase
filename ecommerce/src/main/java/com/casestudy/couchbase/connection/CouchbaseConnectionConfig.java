/**
 *
 */
package com.casestudy.couchbase.connection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * TODO: Insert description here.
 *
 * @author vijaykumar02
 * @version $Revision: 1.10 $
 */
@Configuration
class CouchbaseConnectionConfig {

    @Value("${couchbase.connection.host:localhost:8080}")
    private String host;

    @Value("${couchbase.connection.userName:admin}")
    private String userName;

    @Value("${couchbase.connection.password:admin}")
    private String password;

    @Value("${couchbase.bucket.product:demo-bucket}")
    private String productBucket;

    @Value("${couchbase.bucket.customer:demo-bucket}")
    private String customerBucket;

    @Value("${couchbase.bucket.reviews:demo-bucket}")
    private String reviewsBucket;

   @Value("${couchbase.bucket.purchases:demo-bucket}")
    private String purchasesBucket;

    /**
     *
     * Getter of {@link #host}.
     *
     * @return {@link #host}
     */
    public String getHost() {
        return host;
    }

    /**
     *
     * Getter of {@link #userName}.
     *
     * @return {@link #userName}
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * Getter of {@link #password}.
     *
     * @return {@link #password}
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * Getter of {@link #productBucket}.
     *
     * @return {@link #productBucket}
     */
    public String getProductBucket() {
        return productBucket;
    }

    /**
     *
     * Getter of {@link #customerBucket}.
     *
     * @return {@link #customerBucket}
     */
    public String getCustomerBucket() {
        return customerBucket;
    }

    /**
     *
     * Getter of {@link #reviewsBucket}.
     *
     * @return {@link #reviewsBucket}
     */
    public String getReviewsBucket() {
        return reviewsBucket;
    }

    /**
     *
     * Getter of {@link #purchasesBucket}.
     *
     * @return {@link #purchasesBucket}
     */
    public String getPurchasesBucket() {
        return purchasesBucket;
    }

}

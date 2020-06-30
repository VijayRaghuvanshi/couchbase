/**
 *
 */
package com.casestudy.couchbase.connection;

import com.couchbase.client.core.env.TimeoutConfig;
import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.ClusterOptions;
import com.couchbase.client.java.env.ClusterEnvironment;

import java.time.Duration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Couchbase connection manager.
 *
 * @author vijay
 * @version $Revision: 1.10 $
 */

@Component
public class CouchbaseConnectionFactory {

    @Autowired
    private CouchbaseConnectionConfig config;

    private Cluster cluster;

    private Bucket productBucket;

    @PostConstruct
    private void init() {

        System.out.println("Initlizing connection");
        final ClusterEnvironment env = ClusterEnvironment.builder().timeoutConfig(
                TimeoutConfig.kvTimeout(Duration.ofSeconds(5))).build();

        cluster = Cluster.connect(
                config.getHost(),
                ClusterOptions.clusterOptions(
                        config.getUserName(),
                        config.getPassword()).environment(env));
        productBucket = cluster.bucket(config.getProductBucket());
        System.out.println("Connection initlization completed");
    }

    @PreDestroy
    private void destory() {
        System.out.println("Closing connection");
        cluster.disconnect();
    }

    /**
     *
     * Getter of {@link #config}.
     *
     * @return {@link #config}
     */
    public CouchbaseConnectionConfig getConfig() {
        return config;
    }

    /**
     *
     * Getter of {@link #cluster}.
     *
     * @return {@link #cluster}
     */
    public Cluster getCluster() {
        return cluster;
    }

    /**
     *
     * Getter of {@link #productBucket}.
     *
     * @return {@link #productBucket}
     */
    public Bucket getProductBucket() {
        return productBucket;
    }


}

package com.demo.couchbase.couchbasedemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration{

    @Override
    public String getConnectionString() {
    // TODO Auto-generated method stub
    return "127.0.0.1";
    }

    @Override
    public String getUserName() {
        // TODO Auto-generated method stub
        return "couchbase";
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return "couchbase";
    }

    @Override
    public String getBucketName() {
        // TODO Auto-generated method stub
        return "demo-bucket";
    }

    @Override
    protected boolean autoIndexCreation() {
        // TODO Auto-generated method stub
        return true;
    }
   }


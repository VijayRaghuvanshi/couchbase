package com.demo.couchbase.learn.sdk;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.json.JsonObject;
import com.couchbase.client.java.kv.GetResult;
import com.couchbase.client.java.kv.MutationResult;
import com.couchbase.client.java.query.QueryResult;

class ConnectCouchCluster {

    public static void main(String... args) {
        final Cluster cluster = Cluster.connect("localhost", "couchbase", "couchbase");
        final Bucket bucket = cluster.bucket("demo-bucket");
        final Collection collection = bucket.defaultCollection();

        final MutationResult upsertResult = collection.upsert(
            "my-document",
            JsonObject.create().put("name", "mike")
        );
        final GetResult getResult = collection.get("my-document");

        final QueryResult result = cluster.query("select \"Hello World\" as greeting");
        System.out.println(result.rowsAsObject());
    }

}
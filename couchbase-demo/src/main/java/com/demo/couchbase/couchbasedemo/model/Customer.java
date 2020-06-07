/**
 *
 */
package com.demo.couchbase.couchbasedemo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

/**
 * TODO: Insert description here.
 *
 * @author vijaykumar
 * @version $Revision: 1.10 $
 */
@Document
public class Customer {
    @Id
    private int id;
    @Field
    private String name;
    @Field
    private String[] address;


    public Customer(){

    }
    public Customer(int id, String name, String[] address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
}

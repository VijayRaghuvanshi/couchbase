/**
 *
 */
package com.casestudy.couchbase.ecommerce.data;

import com.casestudy.couchbase.ecommerce.constant.EcommerceConsts;
import com.casestudy.couchbase.ecommerce.model.Product;
import com.couchbase.client.core.deps.com.fasterxml.jackson.core.type.TypeReference;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Set;

import org.springframework.stereotype.Service;

/**
 * Prepare data for the application.
 *
 * @author vijay
 * @version $Revision: 1.10 $
 */
@Service
public class JsonDataFileReader implements DataFileReader {

    @Override
    public Set<Product> readProduct() {

        final ObjectMapper objectMapper = new ObjectMapper();
        Set<Product> productArr = null;
        final URL url =  getClass().getClassLoader().getResource(
                EcommerceConsts.PRODUCT_DATA_FILE_PATH);

        try {
            productArr = objectMapper.readValue(
                    url,
                    new TypeReference<Set<Product>>() {
                    });
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return productArr;
    }

    public static void main(String... arg) {
        final JsonDataFileReader obj = new JsonDataFileReader();
        System.out.print(obj.readProduct().size());
    }
}

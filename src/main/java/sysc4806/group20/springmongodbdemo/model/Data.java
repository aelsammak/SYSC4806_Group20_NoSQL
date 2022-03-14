package sysc4806.group20.springmongodbdemo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@lombok.Data
@Document
public class Data {
    private String name;
    private Address address;
    @lombok.Data
    @Document
    static class Address{
        private int street_number;
        private String street;
    }
}

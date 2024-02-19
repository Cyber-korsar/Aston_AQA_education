package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Person {
    private ObjectWriter writer = new ObjectMapper().writer().withDefaultPrettyPrinter();
    private int id;
    private String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toJson() {
        try {
            return  writer.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
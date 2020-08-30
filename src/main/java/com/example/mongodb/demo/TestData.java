package com.example.mongodb.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="testdb")
@Getter @Setter
public class TestData {
    @Id
    private String id;
    private String name;

    @Builder
    public TestData(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString( ) {
        return "id : " + id + "\n"
              +"name : " + name;
    }
}

package com.example.mongodb.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<TestData, String> {

    public void deleteTestDataByName(String name);
}

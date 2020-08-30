package com.example.mongodb.demo;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class TestController {

    @Autowired
    TestRepository testRepository;

    @GetMapping("/read")
    public void MongoDB_READ( ) {

       log.info(String.valueOf(testRepository.findAll()));
    }

    @GetMapping("/insert")
    public void MongoDB_INSERT( ) {
        TestData testData = TestData.builder()
                            .name("GOOD").
                             build();

        testRepository.save(testData);
    }

    @GetMapping("/update")
    public void MongoDB_UPDATE( ) {
        TestData testData = TestData.builder()
                            .id("5f4b8d96983327c9be9546d8")
                            .name("KIMCODING").
                            build();

        testRepository.save(testData);
    }

    @GetMapping("/delete")
    public void MongoDB_DELETE( ) {
        testRepository.deleteTestDataByName("GOOD");
    }
}

package com.example.mongodb.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

    @Test
    void contextLoads() {


        log.debug("debug");
        log.info("info");
        log.error("error");
        log.warn("warn");


    }
}

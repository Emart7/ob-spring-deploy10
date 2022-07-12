package com.example.obspringdeploy10;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.SocketTimeoutException;

//@SpringBootTest
class ObSpringDeploy10ApplicationTests {

    @Test
    void contextLoads() {
        System.getenv().forEach((key, value) -> System.out.println(key + ": " + value));
    }

}

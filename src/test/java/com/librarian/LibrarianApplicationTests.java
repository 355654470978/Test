package com.librarian;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibrarianApplicationTests {

    @Test
    void contextLoads() {
        String version1 = SpringBootVersion.getVersion();
        System.out.println(version1);
    }

}

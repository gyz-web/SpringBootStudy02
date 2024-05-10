package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class org {

    @Autowired
    public Student student;

    @Test
    void sout() {
        System.out.println(student.toString());
    }
}

package com.kata.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PracticeApplicationTests {

    @Test
    void testHelloWorld() {
        PracticeApplication practiceApplication = new PracticeApplication();
        Assertions.assertEquals("Hello world!", practiceApplication.getText());
    }
}

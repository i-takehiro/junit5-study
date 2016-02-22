package com.example;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.*;

class FirstJUnit5Tests {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }
}

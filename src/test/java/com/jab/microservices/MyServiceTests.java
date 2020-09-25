package com.jab.microservices;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import org.mockito.*;

class MyServiceTests {

    MyService tested;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        tested = new MyService();
    }

    @Test
    void testGreet() {

        assertNotNull(tested.greet());

    }

}

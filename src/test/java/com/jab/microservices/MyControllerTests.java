package com.jab.microservices;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import org.mockito.*;

class MyControllerTests {

    MyController tested;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        tested = new MyController();
    }

    @Test
    void testGreeting(){
        assertNotNull(tested.greeting());
    }

}

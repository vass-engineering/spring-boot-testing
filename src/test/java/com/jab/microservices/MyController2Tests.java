package com.jab.microservices;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import org.mockito.*;

class MyController2Tests {

    @Mock MyService myService;
    MyController2 tested;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        tested = new MyController2(myService);
    }

    @Test
    void testGreeting1(){

        when(myService.greet()).thenReturn(null);
        assertNull(tested.greeting());

    }

    @Test
    void testGreeting2(){

        when(myService.greet()).thenReturn("greet");
        assertEquals("greet",tested.greeting());
        
    }

}

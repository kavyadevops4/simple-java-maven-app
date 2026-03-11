package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testSayHello() {
        App app = new App();
        assertEquals("Hello from Maven Project!", app.sayHello());
    }

    @Test
    void testMainMethod() {
        App.main(new String[]{});
    }
}

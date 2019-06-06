package com.codenvy.example.java;
    
import static org.junit.Assert.*;

import org.eclipse.che.examples.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class AppTest {

    HelloWorld hw = new HelloWorld();
    String hello = hw.getHello();
    
    @Test
    public void testApp() {
      assertEquals(hello,"Hello World !");
    }

   /* @Test
    public void testApp1() {
      assertEquals(hello,"Hello !");
    }*/
 
}

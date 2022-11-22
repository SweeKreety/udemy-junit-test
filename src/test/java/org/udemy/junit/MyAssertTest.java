package org.udemy.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAssertTest {

  List<String> todos= Arrays.asList("AWS","Azure","DevOps");


   @Test
    void testAsserts(){
       boolean test= todos.contains("DevOps");
       boolean test1= todos.contains("Java");
       //assertEquals(true, test);
       assertTrue("Something went wrong", test);
       assertFalse(test1);
     assertEquals(3,todos.size(), "Error message");

     assertArrayEquals(new int []{1,2}, new int[]{1,2 });
   }
}


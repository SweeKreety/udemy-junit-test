package org.udemy.junit;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBeforeAfterTest {
    //set up for all tests
    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }
    //set up for a specific test
    @BeforeEach
    void beforeEach(){
        System.out.println("before each");
    }
   @Test
    void test1(){
       System.out.println("test1");
   }
    @Test
    void test2(){
        System.out.println("test2");
    }
    @Test
    void test3(){
        System.out.println("test3");
    }
    @AfterEach //clean up for a specific test
    void afterEach(){
        System.out.println("after each");
    }
    @AfterAll //clean up after all tests are run
    static void afterAll(){
        System.out.println("after all");
    }

}


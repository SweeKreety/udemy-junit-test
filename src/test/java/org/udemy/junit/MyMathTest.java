package org.udemy.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    private MyMath math= new MyMath();

   @Test
    void calculateSum_ThreeMemberArray(){
        //We test conditions or Assert and if they fail, JUnit tests fail.
       //  fail("Not yet implemented");
       assertEquals(6, math.calculateSum(new int[]{1,2,3}));
    }


    @Test
    void calculateSum_ZeroMemberArray(){
        //We test conditions or Assert and if they fail, JUnit tests fail.
        //  fail("Not yet implemented");
        assertEquals(0, math.calculateSum(new int[]{}));
    }
}


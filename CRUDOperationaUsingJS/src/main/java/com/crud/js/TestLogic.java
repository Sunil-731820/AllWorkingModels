package com.crud.js;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jakarta.validation.constraints.AssertTrue;

public class TestLogic {
    
//    @Test
//    @AssertTrue
//    public void testFindMax() {
//        assertEquals(4,CalculationForTesting.findMax(new int[] {1,3,4,2}));
////        assertEquals(10, CalculationForTesting.findMax(new int[] {-12,-1,-3,-4,-2}));
//        
//    }
//    
////    
////    @Test
////    public void testFindMax() {
//////        System.out.println("Test case of the max value from the array");
////        assertEquals(4, CalculationForTesting.findMax(new int[] {1,3,4,2}));
////        assertEquals(-12,CalculationForTesting.findMax(new int[]{-12,-3,-4,-2}));  
////    }
    
    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
  
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,CalculationForTesting.findMax(new int[]{1,3,4,2}));  
//        assertEquals(-2,CalculationForTesting.findMax(new int[]{-12,-3,-4,-2}));  
    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,CalculationForTesting.cube(3));  
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk",CalculationForTesting.reverseWord("my name is khan"));  
    }  
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  

}

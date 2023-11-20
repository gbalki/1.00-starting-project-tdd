package com.luv2code.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach(){

        demoUtils = new DemoUtils();
    }

    @Test
    @Order(-2)
    void testEqualsAndNotEquals(){

        assertEquals(8,demoUtils.add(2,6),"2+6 must be 8");
        assertNotEquals(7,demoUtils.add(2,6),"2+8 must not be 8");
    }

   @Test
   @Order(-1)
    void testNullAndNotNull(){

        String str1 = null;
        String str2 = "null";

        assertNull(demoUtils.checkNull(str1),"object should be null");
        assertNotNull(demoUtils.checkNull(str2),"object should be not null");
   }

   @Test
   @Order(1)
    void testSameAndNotSame(){

        String str = "luv2code";

        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Object should refer the same object");
        assertNotSame(str,demoUtils.getAcademy(),"Object should not refer the same object");
   }

   @Test
    void testTrueAndFalse(){

        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo),"This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne),"This should return false");
   }

   @Test
   void testMultiply(){
        assertEquals(12,demoUtils.multiply(4,3),"should be equal 12");
   }

   @Test
    void testArrayEquals(){
       String[] stringArray = {"A","B","C"};
       assertArrayEquals(stringArray,demoUtils.getFirstThreeLettersOfAlphabet(),"array should be the same");
   }

   @Test
    void testIterableEquals(){
        List<String> theList = List.of("luv","2","code");
        assertIterableEquals(theList,demoUtils.getAcademyInList(),"list should be the same");
   }

   @Test
    void testLinesMatch(){
        List<String> theList = List.of("luv","2","code");
        assertLinesMatch(theList,demoUtils.getAcademyInList(),"lines should match");
   }

   @Test
    void testDoesThrowAndNotThrow(){
        assertThrows(Exception.class,()->{demoUtils.throwException(-1);},"Should throw Exception");
        assertDoesNotThrow(()->{demoUtils.throwException(5);},"Should not throw Exception");
   }

   @Test
    void testCheckTimeOut(){
        assertTimeout(Duration.ofSeconds(3),()->{demoUtils.checkTimeout();},"Method Should execute in 3 seconds");
   }






   /*
    @AfterEach
    void tearDownAfterEach(){
        System.out.println("Running @AfterEach");
    }

    @BeforeAll
    static  void setUpBeforeAll(){
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
    }

    @AfterAll
    static  void tearDownAfterAll(){
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }
    */
}

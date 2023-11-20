package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

     @Test
     @Disabled("Disabled test until #JIRA 123 resolved")
    void testBasit(){
         // execute method and perform asserts
     }

     @Test
     @EnabledOnOs(OS.WINDOWS)
    void testForWindows(){
         // execute method and perform asserts
     }

     @Test
     @EnabledOnOs(OS.LINUX)
    void testForLinux(){
         // execute method and perform asserts
     }

     @Test
    @EnabledOnOs(OS.MAC)
    void testForMac(){
         // execute method and perform asserts
     }

     @Test
    @EnabledOnOs({OS.WINDOWS,OS.MAC})
    void testForWindowsAndMac(){
         // execute method and perform asserts
     }

     @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testForOnlyJava11(){
         // execute method and perform asserts
     }

    @Test
    @EnabledOnJre(JRE.JAVA_19)
    void testForOnlyJava19(){
        // execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testForOnlyJavaRangeMin(){
        // execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_20)
    void testForOnlyJavaRangeMinAndMax(){
        // execute method and perform asserts
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV",matches = "DEV")
    void testOnlyForDevEnvironment(){
        // execute method and perform asserts
    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP",matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty(){
        // execute method and perform asserts
    }

}

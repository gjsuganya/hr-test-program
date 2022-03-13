package com.hrtest.Day1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class IfLoopProgram3Test {


    @ParameterizedTest
    @CsvSource({"1,Weird","2,Not Weird","8,Weird","30,Not Weird"})
    public void testShouldPrintWeirdWhenPassOddNumber(int input,String expected) {
        IfLoopProgram3 ifLoopProgram3 = new IfLoopProgram3();
        String actual = ifLoopProgram3.checkNumber(input);
        assertThat(actual, is(expected));
    }
}
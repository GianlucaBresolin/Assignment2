package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PerformanceRomanPrinterTest {
    
    @Test(timeout=100)
    public void performanceTimeTestRomanPrinter()
            throws NumberUnderZeroException, NumberOverOnethousandException,
            NonRightCharacterException {
        //Arrange
        int input = 356;
        //Action
        RomanPrinter.print(input);
        //Assertion
    }
}
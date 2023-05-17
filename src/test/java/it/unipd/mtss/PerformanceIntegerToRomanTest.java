package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PerformanceIntegerToRomanTest {
    
    @Test(timeout=100)
    public void performanceTimeTestIntegerToRoman()
            throws NumberUnderZeroException, NumberOverOnethousandException{
        //Arrange
        int input = 356;
        //Action
        IntegerToRoman.convert(input);
        //Assertion
    }
}

package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CondizioneLimiteIntegerToRomanTest {

    @Test(expected = NumberUnderZeroException.class)
    public void testNumberUnderZero() throws NumberUnderZeroException, NumberOverOnethousandException {
        //Arange
        int negative_number = -3;
        //Action
        String exp_out=IntegerToRoman.convert(negative_number);
        //Assert
        fail();
    }

    @Test(expected = NumberOverOnethousandException.class)
    public void testNumberOverOnethousand() throws NumberUnderZeroException, NumberOverOnethousandException {
        //Arange
        int number_over_onethousand = 1001;
        //Action
        String exp_out=IntegerToRoman.convert(number_over_onethousand);
        //Assert
        fail();
    }

}

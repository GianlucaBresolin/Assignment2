package it.unipd.mtss;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CorrettezzaIntegerToRomanTest {

    private String expectedOutput;
    private int input;

    public CorrettezzaIntegerToRomanTest(String input, String expectedOutput) {
        this.expectedOutput = expectedOutput;
        this.input = Integer.parseInt(input);
    }

    @Parameters
    public static Collection<String[]> testConditions() {
        String expectedOutputs[][]={
            {"526", "DXXVI"},
            {"264", "CCLXIV"}, 
            {"137", "CXXXVII"}, 
            {"878", "DCCCLXXVIII"}, 
            {"45", "XLV"},
            {"712", "DCCXII"}, 
            {"993", "CMXCIII"}, 
            {"648", "DCXLVIII"}, 
            {"318", "CCCXVIII"}, 
            {"879", "DCCCLXXIX"},
            {"532", "DXXXII"}, 
            {"248", "CCXLVIII"}, 
            {"396", "CCCXCVI"}, 
            {"919", "CMXIX"}, 
            {"668", "DCLXVIII"},
            {"246", "CCXLVI"}, 
            {"997", "CMXCVII"}, 
            {"783", "DCCLXXXIII"}, 
            {"509", "DIX"}, 
            {"463", "CDLXIII"},
            {"348", "CCCXLVIII"}, 
            {"537", "DXXXVII"}, 
            {"647", "DCXLVII"}, 
            {"587", "DLXXXVII"}, 
            {"792", "DCCXCII"},
            {"751", "DCCLI"}, 
            {"482", "CDLXXXII"}, 
            {"847", "DCCCXLVII"}, 
            {"529", "DXXIX"}, 
            {"714", "DCCXIV"},
            {"86", "LXXXVI"}, 
            {"904", "CMIV"}, 
            {"281", "CCLXXXI"}, 
            {"498", "CDXCVIII"}, 
            {"972", "CMLXXII"} };
            return Arrays.asList(expectedOutputs);
    }

    @Test
	public void testIntegerToRoman() throws NumberUnderZeroException, NumberOverOnethousandException{
		assertEquals(expectedOutput, 
            IntegerToRoman.convert(input));
	}

    @Test
    public void testZeroIntegerToRoman() throws NumberUnderZeroException, NumberOverOnethousandException{
        //Arrange
        String output="";
        int input=0;
        String produced_output;
        //Action
        produced_output=IntegerToRoman.convert(input);
        //Assert
        assertEquals(output, produced_output);
    }
        
}
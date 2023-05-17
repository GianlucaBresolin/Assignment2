////////////////////////////////////////////////////////////////////
// GIANLUCA BRESOLIN 2034316
// GIOVANNI MENON 2034301
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
            
    private static final int[] VALUES = { 1000, 900, 500, 400, 
                                         100, 90, 50, 40, 10, 9, 
                                         5, 4, 1 };

    private static final String[] SYMBOLS = { "M", "CM", "D", "CD", 
                                             "C", "XC", "L", "XL", 
                                             "X", "IX", "V", "IV", 
                                             "I" };
    
    public static String convert(int number)
        throws NumberUnderZeroException, 
            NumberOverOnethousandException {
        
        if (number < 0) {
            throw new NumberUnderZeroException();
        }
        if (number > 1000) {
            throw new NumberOverOnethousandException();
        }
    
        StringBuilder roman = new StringBuilder();
        int remaining = number;
    
        for (int i = 0; i < VALUES.length; i++) {
            while (remaining >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }
    
        return roman.toString();
    }
   
}
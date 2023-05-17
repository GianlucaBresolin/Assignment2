////////////////////////////////////////////////////////////////////
// GIANLUCA BRESOLIN 2034316
// GIOVANNI MENON 2034301
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberUnderZeroException extends Exception{
    public NumberUnderZeroException() {
        super("Non esistono numeri romani in negativo.");
    }
}

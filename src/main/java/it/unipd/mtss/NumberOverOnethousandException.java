////////////////////////////////////////////////////////////////////
// GIANLUCA BRESOLIN 2034316
// GIOVANNI MENON 2034301
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberOverOnethousandException extends Exception{
    public NumberOverOnethousandException() {
        super("Non esistono numeri romani maggiori di 1000.");
    }
}

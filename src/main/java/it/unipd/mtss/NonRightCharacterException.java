////////////////////////////////////////////////////////////////////
// GIANLUCA BRESOLIN 2034316
// GIOVANNI MENON 2034301
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NonRightCharacterException extends Exception {
        public NonRightCharacterException(char c) {
            super("Lettera non accettata: " + c);
        }
}
package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CorrettezzaRomanPrinterTest {
   
    @Test
    public void testPrintI() throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 1;
        String expected = new String(" _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n");
        // Action 
        String ascii_art_for_I = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_I);
    }


    @Test
    public void testPrintV() throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 5;
        String expected = new String("__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n");
        // Action 
        String ascii_art_for_V = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_V);
    }

    @Test
    public void testPrintX() throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 10;
        String expected = new String("__   __\n" +
                "\\ \\ / /\n" +
                " \\ V / \n" +
                "  > <  \n" +
                " / . \\ \n" +
                "/_/ \\_\\\n");
        // Action 
        String ascii_art_for_X = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_X);
    }

    @Test
    public void testPrintL() throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 50;
        String expected = new String(" _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n");
        // Action
        String ascii_art_for_L = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_L);
    }

    @Test
    public void testPrintC() throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 100;
        String expected = new String("  _____ \n" +
                " / ____|\n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                " \\_____|\n");
        // Action
        String ascii_art_for_C = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_C);
    }

    @Test
    public void testPrintD() throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 500;
        String expected = new String(" _____  \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ \n");
        // Action
        String ascii_art_for_D = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_D);
    }

    @Test
    public void testPrintM() throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 1000;
        String expected = new String(" __  __ \n" +
                "|  \\/  |\n" +
                "| \\  / |\n" +
                "| |\\/| |\n" +
                "| |  | |\n" +
                "|_|  |_|\n");
        // Action
        String ascii_art_for_M = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_M);
    }

    @Test
    public void testNumberZeroAsciiArt()
            throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 0;
        String expected = "";
        // Action
        String ascii_art_for_zero = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_zero);
    }

    @Test
    public void testLettersCombination511()
            throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 511;
        String expected = new String(" _____  " + "__   __" + " _____ \n" +
                "|  __ \\ " + "\\ \\ / /" + "|_   _|\n"
                + "| |  | |" + " \\ V / " + "  | |  \n" +
                "| |  | |" + "  > <  " + "  | |  \n" +
                "| |__| |" + " / . \\ " + " _| |_ \n" +
                "|_____/ " + "/_/ \\_\\"
                + "|_____|\n");
        // Action
        String ascii_art_for_511 = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_511);
    }

    @Test
    public void testLettersCombination56()
            throws NumberUnderZeroException, NumberOverOnethousandException , NonRightCharacterException {
        // Arrange 
        int input = 65;
        String expected = new String(" _      " + "__   __" + "__      __\n" +
                "| |     " + "\\ \\ / /" + "\\ \\    / /\n" +
                "| |     " + " \\ V / " + " \\ \\  / / \n" +
                "| |     " + "  > <  " + "  \\ \\/ /  \n" +
                "| |____ " + " / . \\ " + "   \\  /   \n" +
                "|______|" + "/_/ \\_\\" + "    \\/    \n");
        // Action
        String ascii_art_for_65 = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, ascii_art_for_65);
    }
}
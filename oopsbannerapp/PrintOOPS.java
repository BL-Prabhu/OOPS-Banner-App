package oopsbannerapp;


/**
 * PrintOOPS class
 *
 * <p>This class implements <b>UC2: Render OOPS as Banner using Print Statements</b>.
 * It prints the word {@code "OOPS"} in a large banner format using spaces and
 * asterisk ({@code *}) characters.</p>
 *
 * <p>The banner is created by printing each line individually using
 * {@code System.out.println()} and string concatenation with the {@code +}
 * operator. Each character (O, O, P, S) is represented using a 7-line pattern
 * with a fixed width, aligned properly to form a readable banner.</p>
 *
 * <p>This use case helps in understanding:</p>
 * <ul>
 *   <li>ASCII art using characters</li>
 *   <li>String concatenation using the {@code +} operator</li>
 *   <li>Multiple print statements for multi-line output</li>
 *   <li>Basic program flow in Java</li>
 * </ul>
 *
 * @author Prabhu
 * @version 2.0
 */

public class PrintOOPS
{

    /**
     * Main method – Entry point of the application.
     *
     * <p>When executed, this method prints seven lines of output that
     * together form the banner representation of the word {@code "OOPS"}.
     * Each line is constructed using string concatenation and printed
     * individually to the console.</p>
     *
     * @param args command-line arguments (not used)
     */

    public static void main(String[] args)
    {

// Line 1
        System.out.println(
                "   ***    " + "   ***    " + " ******  " + "  *****  "
        );

// Line 2
        System.out.println(
                " **   **  " + " **   **  " + " **   ** " + " **      "
        );

// Line 3
        System.out.println(
                " **   **  " + " **   **  " + " **   ** " + " **      "
        );

// Line 4
        System.out.println(
                " **   **  " + " **   **  " + " ******  " + "  ***    "
        );

// Line 5
        System.out.println(
                " **   **  " + " **   **  " + " **      " + "      ** "
        );

// Line 6
        System.out.println(
                " **   **  " + " **   **  " + " **      " + "      ** "
        );

// Line 7
        System.out.println(
                "   ***    " + "   ***    " + " **      " + "  *****  "
        );
    }

}

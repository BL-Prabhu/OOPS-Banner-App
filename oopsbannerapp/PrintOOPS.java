package oopsbannerapp;


/**
 * PrintOOPS class
 *
 * <p>This class implements <b>UC6: Refactor Banner Logic into Functions</b>.
 * It renders the word {@code "OOPS"} in a banner format using spaces and
 * asterisk ({@code *}) characters.</p>
 *
 * <p>In this use case, the banner rendering logic is refactored by
 * introducing dedicated helper methods to generate the ASCII patterns
 * for each character (O, P, and S). This removes hardcoded inline
 * initialization and improves modularity, reusability, and readability.</p>
 *
 * <p>Each helper method returns a {@code String[]} representing a
 * 7-line pattern with a fixed width of 9 characters. The main method
 * assembles these patterns line by line to form the final banner output.</p>
 *
 * <p>This implementation demonstrates the application of key object-oriented
 * design principles such as abstraction, encapsulation, and the
 * DRY (Don’t Repeat Yourself) principle.</p>
 *
 * <p>Key concepts demonstrated in this use case include:</p>
 * <ul>
 *   <li>Static helper methods</li>
 *   <li>Method abstraction and encapsulation</li>
 *   <li>Reusability of character patterns</li>
 *   <li>Loop-based banner rendering</li>
 *   <li>Composing complex output from smaller reusable units</li>
 * </ul>
 *
 * @author Prabhu
 * @version 6.0
 */

public class PrintOOPS
{

    /**
     * Generates the banner pattern for the letter {@code 'O'}.
     *
     * <p>The pattern consists of 7 lines, each having a fixed width
     * of 9 characters, and visually represents the letter O
     * using asterisk characters.</p>
     *
     * @return a {@code String[]} containing the 7-line banner pattern for O
     */

    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    /**
     * Generates the banner pattern for the letter {@code 'P'}.
     *
     * <p>The pattern consists of 7 lines with a fixed width
     * and visually represents the letter P using asterisks.</p>
     *
     * @return a {@code String[]} containing the 7-line banner pattern for P
     */

    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *        ",
                " *        ",
                " *        "
        };
    }

    /**
     * Generates the banner pattern for the letter {@code 'S'}.
     *
     * <p>The pattern consists of 7 lines with a fixed width
     * and visually represents the letter S using asterisks.</p>
     *
     * @return a {@code String[]} containing the 7-line banner pattern for S
     */

    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *        ",
                " *        ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }
    /**
     * Main method – Entry point of the Java application.
     *
     * <p>This method retrieves character patterns using helper methods
     * and assembles the word {@code "OOPS"} by combining the patterns
     * line by line. The banner is printed using a loop to ensure
     * clean and maintainable rendering logic.</p>
     *
     * <p>The letter {@code 'O'} is reused twice to demonstrate
     * pattern reuse and adherence to the DRY principle.</p>
     *
     * @param args command-line arguments (not used)
     */


    public static void main(String[] args) {

        // Retrieve patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print banner line by line
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    String.join("",
                            oPattern[i],
                            oPattern[i],   // 'O' repeated twice
                            pPattern[i],
                            sPattern[i]
                    )
            );
        }
    }
}


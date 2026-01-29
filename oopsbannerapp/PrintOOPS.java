package oopsbannerapp;


/**
 * PrintOOPS class
 *
 * <p>This class implements <b>UC5: Render OOPS as Banner using Inline Array Initialization</b>.
 * It prints the word {@code "OOPS"} in a banner format using spaces and
 * asterisk ({@code *}) characters.</p>
 *
 * <p>In this use case, the banner lines are created using inline array
 * initialization. The {@code String} array is declared, initialized,
 * and populated in a single statement using array literal syntax
 * combined with {@code String.join()} method calls.</p>
 *
 * <p>This approach improves upon UC4 by reducing code verbosity while
 * maintaining modularity and readability. All banner lines are visible
 * in one compact structure, making the code easier to understand and
 * modify.</p>
 *
 * <p>Key concepts demonstrated in this use case include:</p>
 * <ul>
 *   <li>Inline array declaration and initialization</li>
 *   <li>Method invocation inside array initializers</li>
 *   <li>String construction using {@code String.join()}</li>
 *   <li>Enhanced for loop for clean array traversal</li>
 * </ul>
 *
 * <p>Each character in the banner (O, O, P, S) is represented using a
 * fixed 7-line pattern with a width of 9 characters, ensuring proper
 * alignment and consistent visual output.</p>
 *
 * @author Prabhu
 * @version 5.0
 */

public class PrintOOPS
{

    /**
     * Main method – Entry point of the Java application.
     *
     * <p>This method declares and initializes a {@code String} array
     * using inline initialization, where each element represents one
     * line of the OOPS banner constructed using {@code String.join()}.</p>
     *
     * <p>An enhanced for loop is then used to iterate through the array
     * and print each line sequentially, forming the complete banner
     * output.</p>
     *
     * @param args command-line arguments (not used)
     */

    public static void main(String[] args)
    {
        // Inline declaration and initialization of banner lines
        String[] lines = {
                String.join("", "  *****  ", "  *****  ", " ******  ", "  *****  "),
                String.join("", " *     * ", " *     * ", " *     * ", " *        "),
                String.join("", " *     * ", " *     * ", " *     * ", " *        "),
                String.join("", " *     * ", " *     * ", " ******  ", "  *****  "),
                String.join("", " *     * ", " *     * ", " *        ", "       * "),
                String.join("", " *     * ", " *     * ", " *        ", "       * "),
                String.join("", "  *****  ", "  *****  ", " *        ", "  *****  ")
        };

        // Step 3: Print banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }

}

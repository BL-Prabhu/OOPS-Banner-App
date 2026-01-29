package oopsbannerapp;


/**
 * PrintOOPS class
 *
 * <p>This class implements <b>UC4: Render OOPS as Banner using String Array and Loop</b>.
 * It prints the word {@code "OOPS"} in a banner format using spaces and
 * asterisk ({@code *}) characters.</p>
 *
 * <p>In this use case, all banner lines are stored in a one-dimensional
 * {@code String} array. Each line of the banner is constructed using
 * {@code String.join()} and then printed using an enhanced for loop.</p>
 *
 * <p>This approach improves upon UC3 by eliminating repetitive
 * {@code System.out.println()} statements and introducing better
 * modularity, readability, and maintainability.</p>
 *
 * <p>Key concepts demonstrated in this use case include:</p>
 * <ul>
 *   <li>String array creation and usage</li>
 *   <li>Array population using {@code String.join()}</li>
 *   <li>Enhanced for loop for array traversal</li>
 *   <li>ASCII art representation using characters</li>
 * </ul>
 *
 * <p>Each character in the banner (O, O, P, S) is represented using
 * a 7-line pattern with a fixed width of 9 characters, ensuring
 * proper alignment and consistent visual output.</p>
 *
 * @author Prabhu
 * @version 4.0
 */

public class PrintOOPS
{
    /**
     * Main method – Entry point of the Java application.
     *
     * <p>This method creates a {@code String} array to store all
     * seven lines of the OOPS banner. Each array element represents
     * one line of the banner and is constructed using
     * {@code String.join()}.</p>
     *
     * <p>An enhanced for loop is then used to iterate through
     * the array and print each line sequentially, forming the
     * complete banner output.</p>
     *
     * @param args command-line arguments (not used)
     */

    public static void main(String[] args)
    {
        // Step 1: Create String array for 7 lines
        String[] lines = new String[7];

        // Step 2: Populate array using String.join()
        lines[0] = String.join("",
                "  *****  ", "  *****  ", " ******  ", "  *****  ");

        lines[1] = String.join("",
                " *     * ", " *     * ", " *     * ", " *        ");

        lines[2] = String.join("",
                " *     * ", " *     * ", " *     * ", " *        ");

        lines[3] = String.join("",
                " *     * ", " *     * ", " ******  ", "  *****  ");

        lines[4] = String.join("",
                " *     * ", " *     * ", " *        ", "       * ");

        lines[5] = String.join("",
                " *     * ", " *     * ", " *        ", "       * ");

        lines[6] = String.join("",
                "  *****  ", "  *****  ", " *        ", "  *****  ");

        // Step 3: Print banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }

}

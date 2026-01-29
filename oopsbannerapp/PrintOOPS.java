package oopsbannerapp;

import java.util.HashMap;

/**
 * PrintOOPS
 *
 * <p>This class implements <b>UC8: Use Map for Character Patterns and Render via Function</b>.
 * It prints a banner-style ASCII art representation of a given message
 * (for example {@code "OOPS"}) using character patterns stored in a
 * {@link java.util.HashMap}.</p>
 *
 * <p>This implementation improves upon UC7 by replacing array-based
 * character lookup with a {@code HashMap}, enabling constant-time
 * pattern retrieval and centralized pattern management.</p>
 *
 * <p>The banner is rendered row by row using nested loops and
 * {@link StringBuilder} for efficient string concatenation.</p>
 *
 * <p>This design demonstrates key object-oriented and collection-based
 * concepts such as modularity, encapsulation, abstraction, and reusability.</p>
 *
 * @author Prabhu
 * @version 8.0
 */
public class PrintOOPS
{

    /**
     * Creates and initializes a {@code HashMap} that stores banner patterns
     * for supported characters.
     *
     * <p>The key represents a character, and the value represents a
     * 7-line ASCII art pattern for that character. A space character
     * is also included to handle unsupported or blank characters
     * gracefully.</p>
     *
     * @return a {@code HashMap} mapping characters to their banner patterns
     */
    public static HashMap<Character, String[]> createCharacterMap()
    {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        charMap.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *        ",
                " *        ",
                " *        "
        });

        charMap.put('S', new String[]{
                "  *****  ",
                " *        ",
                " *        ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });

        charMap.put(' ', new String[]{
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          "
        });

        return charMap;
    }

    /**
     * Displays a banner representation of the given message.
     *
     * <p>The method converts the message to uppercase, retrieves the
     * corresponding banner pattern for each character from the
     * {@code HashMap}, and prints the output line by line.</p>
     *
     * <p>An outer loop iterates over each row of the banner, while an
     * inner loop processes each character in the message to assemble
     * the full banner row using {@link StringBuilder}.</p>
     *
     * <p>If a character is not found in the map, a blank space pattern
     * is used as a fallback.</p>
     *
     * @param message the message to be rendered as a banner
     * @param charMap the {@code HashMap} containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap)
    {
        message = message.toUpperCase();

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++)
        {
            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray())
            {
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]);
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main method – Entry point of the application.
     *
     * <p>This method initializes the character-pattern map and invokes
     * the banner display logic to print the word {@code "OOPS"} in
     * ASCII art format.</p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";

        displayBanner(message, charMap);
    }
}

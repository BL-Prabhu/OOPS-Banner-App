package oopsbannerapp;

/**
 * PrintOOPS class
 *
 * <p>This class implements <b>UC7: Store Character Pattern in a Class</b>.
 * It renders a banner representation of a given message (e.g. {@code "OOPS"})
 * using ASCII art composed of spaces and asterisk ({@code *}) characters.</p>
 *
 * <p>This use case improves upon UC6 by introducing a dedicated inner
 * class to encapsulate a character and its corresponding banner pattern.
 * This provides centralized pattern management and makes the solution
 * more scalable and easier to maintain when adding new characters.</p>
 *
 * <p>The banner rendering logic retrieves character patterns from a
 * collection of {@code CharacterPatternMap} objects and constructs
 * the output row by row using nested loops and {@code StringBuilder}
 * for efficient string concatenation.</p>
 *
 * <p>Key object-oriented principles such as encapsulation, abstraction,
 * modularity, reusability, and separation of concerns are demonstrated
 * in this implementation.</p>
 *
 * @author Prabhu
 * @version 7.0
 */
public class PrintOOPS
{

    /**
     * Inner static class that encapsulates a character and its banner pattern.
     *
     * <p>This class represents a mapping between a single character and
     * its corresponding 7-line ASCII banner pattern. Making this class
     * {@code static} allows it to be instantiated without requiring an
     * instance of the outer {@code PrintOOPS} class.</p>
     *
     * <p>The class is immutable; its state is initialized via the constructor
     * and accessed only through getter methods.</p>
     */
    static class CharacterPatternMap
    {

        /** The character represented by this pattern. */
        private final Character character;

        /** The 7-line ASCII banner pattern for the character. */
        private final String[] pattern;

        /**
         * Constructs a {@code CharacterPatternMap} object.
         *
         * @param character the character to be mapped
         * @param pattern   the 7-line banner pattern representing the character
         */
        public CharacterPatternMap(Character character, String[] pattern)
        {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character associated with this pattern.
         *
         * @return the mapped character
         */
        public Character getCharacter()
        {
            return character;
        }

        /**
         * Returns the banner pattern for the character.
         *
         * @return a {@code String[]} containing the 7-line banner pattern
         */
        public String[] getPattern()
        {
            return pattern;
        }
    }

    /**
     * Creates and returns an array of {@code CharacterPatternMap} objects.
     *
     * <p>This method initializes banner patterns for supported characters
     * such as {@code 'O'}, {@code 'P'}, {@code 'S'}, and a space character
     * to handle unsupported or blank characters gracefully.</p>
     *
     * @return an array of {@code CharacterPatternMap} objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps()
    {
        return new CharacterPatternMap[]{

                new CharacterPatternMap('O', new String[]{
                        "  *****  ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        "  *****  "
                }),

                new CharacterPatternMap('P', new String[]{
                        " ******  ",
                        " *     * ",
                        " *     * ",
                        " ******  ",
                        " *        ",
                        " *        ",
                        " *        "
                }),

                new CharacterPatternMap('S', new String[]{
                        "  *****  ",
                        " *        ",
                        " *        ",
                        "  *****  ",
                        "       * ",
                        "       * ",
                        "  *****  "
                }),

                new CharacterPatternMap(' ', new String[]{
                        "          ",
                        "          ",
                        "          ",
                        "          ",
                        "          ",
                        "          ",
                        "          "
                })
        };
    }

    /**
     * Retrieves the banner pattern for a given character.
     *
     * <p>This method abstracts the pattern lookup logic by searching
     * through the provided {@code CharacterPatternMap} array. If the
     * character is not found, a blank space pattern is returned.</p>
     *
     * @param ch       the character whose pattern is required
     * @param charMaps the array of available character-pattern mappings
     * @return a {@code String[]} representing the character's banner pattern
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps)
    {
        for (CharacterPatternMap map : charMaps)
        {
            if (map.getCharacter() == ch)
            {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message in banner format using stored character patterns.
     *
     * <p>The method converts the input message to uppercase, retrieves
     * the corresponding banner pattern for each character, and prints
     * the output row by row using nested loops.</p>
     *
     * <p>{@code StringBuilder} is used to efficiently concatenate patterns
     * for each row before printing.</p>
     *
     * @param message  the message to be displayed as a banner
     * @param charMaps the character-pattern mappings
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps)
    {
        message = message.toUpperCase();

        for (int row = 0; row < 7; row++)
        {
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray())
            {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[row]);
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main method – Entry point of the Java application.
     *
     * <p>This method initializes the character-pattern mappings and
     * invokes the banner rendering logic to display the word
     * {@code "OOPS"} in ASCII banner format.</p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";

        printMessage(message, charMaps);
    }
}

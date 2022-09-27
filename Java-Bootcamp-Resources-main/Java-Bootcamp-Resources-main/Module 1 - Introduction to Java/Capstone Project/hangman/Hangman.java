import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = randomWord(words);
        System.out.println(word);

        int turns = 0;
        String misses = "";
        String placeholders = printPlaceholders(word);

        for (int i = 0; i < gallows.length; i++) {
            if (isWin(placeholders)) {
                System.out.println("You win!");
                break;
            } else if (turns == 6) {
                System.out.println("RIP!");
                break;
            }
            System.out.println(gallows[turns]);
            System.out.println("Word: " + placeholders + "\n");
            System.out.println("Misses: " + misses + "\n\n");
            System.out.print("Guess: ");
            String userGuess = scanner.nextLine();
            checkGuess(userGuess, word);
            
            if (checkGuess(userGuess, word)) {
                placeholders = updatePlaceholders(word, userGuess, placeholders);
            } else {
                misses = printMisses(userGuess, misses);
                turns++;
             }

        }

        scanner.close();
    }

    public static String randomWord(String[] words) {
        Random rand = new Random();
        int n = rand.nextInt(words.length);
        return words[n];
    }

    public static String printPlaceholders(String word) {
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            sb.setCharAt(i, '_');
        }
        return sb.toString();
    }

    public static boolean checkGuess(String userGuess, String word) {
        char userChar = userGuess.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            if (userChar == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static String updatePlaceholders(String word, String userGuess, String placeholders) {
        StringBuilder sb = new StringBuilder(placeholders);
        char userChar = userGuess.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            if (userChar == word.charAt(i)) {
                sb.setCharAt(i, userChar);;
            } 
        }
        return sb.toString();
    }

    public static String printMisses(String userGuess, String misses) {
        StringBuilder sb = new StringBuilder(misses);
        sb.append(userGuess.charAt(0));
        return sb.toString();
    }

    public static boolean isWin(String placeholders) {
        for (int i = 0; i < placeholders.toCharArray().length; i++) {
            if (placeholders.charAt(i) == '_') {
                return false;
            }
        }
        return true;
    }
}


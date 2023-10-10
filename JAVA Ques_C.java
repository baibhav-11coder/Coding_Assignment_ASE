import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive check
        scanner.close();

        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String sentence) {
        boolean[] alphabetPresent = new boolean[26]; // 26 letters from 'a' to 'z'

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a'; // Convert character to index (0-25)
                alphabetPresent[index] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}
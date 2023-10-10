import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        scanner.close();

        int result = romanToInt(romanNumeral);
        if (result == -1) {
            System.out.println("Invalid Roman numeral input.");
        } else {
            System.out.println("The integer representation of " + romanNumeral + " is " + result);
        }
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.getOrDefault(currentChar, -1);

            if (currentValue == -1) {
                return -1; // Invalid Roman numeral character
            }

            if (currentValue < prevValue) {
                result -= currentValue; // Subtract when a smaller value appears before a larger one (e.g., IV = 4)
            } else {
                result += currentValue; // Add when a smaller value appears after or equals a larger one (e.g., VI = 6)
            }

            prevValue = currentValue;
        }

        return result;
    }
}
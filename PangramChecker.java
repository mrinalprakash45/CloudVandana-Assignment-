import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String s) {
        // Convert the input to lowercase for case-insensitive check
        s = s.toLowerCase();

        // Initialize an array to track the presence of each letter
        boolean[] alphabet = new boolean[26];

        // Iterate through each character in the input
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if the character is a lowercase letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Mark the corresponding letter as present
                alphabet[currentChar - 'a'] = true;
            }
        }

        // Check if all letters are present (array is fully marked)
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false; // Not a pangram
            }
        }

        return true; // Pangram
    }
}

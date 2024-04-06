import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the word or phrase
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        // Remove spaces and punctuation from the input and convert to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if the clean input is a palindrome
        boolean isPalindrome = checkPalindrome(cleanInput);

        // Display the result
        if (isPalindrome) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

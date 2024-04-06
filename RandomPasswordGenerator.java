import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter password length
        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();
        
        // Prompt user to specify which characters to include
        System.out.println("Specify which characters to include:");
        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("y");
        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("y");
        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("y");
        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecial = scanner.next().equalsIgnoreCase("y");
        
        // Generate the password
        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecial);
        
        // Display the generated password
        System.out.println("Generated password: " + password);
        
        scanner.close();
    }
    
    // Function to generate a random password
    public static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecial) {
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        
        StringBuilder validChars = new StringBuilder();
        if (includeLowercase) validChars.append(lowercaseLetters);
        if (includeUppercase) validChars.append(uppercaseLetters);
        if (includeNumbers) validChars.append(numbers);
        if (includeSpecial) validChars.append(specialCharacters);
        
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }
        
        return password.toString();
    }
}

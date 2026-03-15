import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void analyzePassword(String password) {

        int length = password.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c))
                hasUpper = true;

            else if (Character.isLowerCase(c))
                hasLower = true;

            else if (Character.isDigit(c))
                hasDigit = true;

            else
                hasSpecial = true;
        }

        int score = 0;

        if (length >= 8) score++;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        System.out.println("\nPassword Analysis:");

        System.out.println("Length: " + length);
        System.out.println("Contains Uppercase: " + hasUpper);
        System.out.println("Contains Lowercase: " + hasLower);
        System.out.println("Contains Digit: " + hasDigit);
        System.out.println("Contains Special Character: " + hasSpecial);

        if (score <= 2)
            System.out.println("Strength: Weak Password");

        else if (score <= 4)
            System.out.println("Strength: Medium Password");

        else
            System.out.println("Strength: Strong Password");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Password Strength Checker");

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        analyzePassword(password);

        sc.close();
    }
}

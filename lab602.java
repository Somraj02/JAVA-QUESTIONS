import java.util.*;

public class lab602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
         sc.nextLine();
        String changedCase = str.toUpperCase();
        System.out.println("Changed Case: " + changedCase);
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);
        String anotherStr = sc.nextLine();
        int comparisonResult = str.compareTo(anotherStr);
        System.out.println("Comparison Result: " + comparisonResult);

        // iv) Insert one string into another string
        String insertedStr = str.substring(0, str.length() / 2) + anotherStr + str.substring(str.length() / 2);
        System.out.println("Inserted String: " + insertedStr);

        // v) Convert the string to upper case and lower case
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        System.out.println("Upper Case: " + upperCase);
        System.out.println("Lower Case: " + lowerCase);

        // vi) Check whether the character is present in the string and at which position
        int position = str.indexOf(ch);
        if (position != -1) {
            System.out.println("Character " + ch + " found at position: " + position);
        } else {
            System.out.println("Character " + ch + " not found in the string.");
        }

        // vii) Check whether the string is palindrome or not
        String reversedStr = new StringBuilder(str).reverse().toString();
        boolean isPalindrome = str.equals(reversedStr);
        System.out.println("Is Palindrome: " + isPalindrome);

        // viii) Check the number of words, vowels, and consonants in the string
        int wordCount = str.split("\\s+").length;
        int vowelCount = str.replaceAll("[^aeiouAEIOU]", "").length();
        int consonantCount = str.replaceAll("[aeiouAEIOU\\s]", "").length();
        System.out.println("Word Count: " + wordCount);
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }
}
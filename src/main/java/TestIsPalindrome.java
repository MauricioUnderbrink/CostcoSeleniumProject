import java.util.Scanner;

public class TestIsPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a message");

        String userString = scanner.nextLine();

        scanner.close();


        if (checkIfStringIsPalindrome(userString)) {

            //Print this message if it is a palindrome number
            System.out.println("The given string: " + userString + " is a palindrome word");

        } else {
            //Print this message if it is not a palindrome number
            System.out.print("The given string: " + userString + " is not a palindrome word");

        }

    }

    /**
     * This method will reverse the string and compare the provided string with the reversed string
     *
     * @param userString
     * @return boolean
     */
    public static boolean checkIfStringIsPalindrome(String userString) {

        if (!userString.isBlank() && !userString.isEmpty()) {

            char[] eachLetter = userString.toCharArray();

            int size = eachLetter.length;

            String reversedWord = "";

            boolean isPalindrome = false;

            for (int i = size - 1; i >= 0; i--) {


                reversedWord = reversedWord + eachLetter[i];

            }

            //Compare the two strings
            if (userString.equals(reversedWord)) {

                isPalindrome = true;
            } else {

                isPalindrome = false;

            }

            return isPalindrome;

        } else {
            System.out.println("There is no message");
            return false;
        }


    }


}

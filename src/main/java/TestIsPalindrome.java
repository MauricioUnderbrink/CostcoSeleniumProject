import org.apache.commons.exec.util.StringUtils;

import java.util.Scanner;

public class TestIsPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a message");

        String userString = scanner.nextLine();

        scanner.close();

/*
        //Example #1
        if (checkIfStringIsPalindrome(userString)) {

            //Print this message if it is a palindrome number
            System.out.println("The given string: " + userString + " is a palindrome word");

        } else {
            //Print this message if it is not a palindrome number
            System.out.print("The given string: " + userString + " is not a palindrome word");

        }

*/

        /*
        //Example #2
        if (checkIfStringIsPalindrome2(userString)) {

            //Print this message if it is a palindrome number
            System.out.println("The given string: " + userString + " is a palindrome word 2");

        } else {
            //Print this message if it is not a palindrome number
            System.out.print("The given string: " + userString + " is not a palindrome word 2");

        }

*/

        //Example #3
        if (isPalindrome(userString)) {

            //Print this message if it is a palindrome number
            System.out.println("The given string: " + userString + " is a palindrome word 2");

        } else {
            //Print this message if it is not a palindrome number
            System.out.print("The given string: " + userString + " is not a palindrome word 2");

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



    /**
     * This method will reverse the string using String Buffer and compare the provided string with the reversed string
     *
     * @param userString
     * @return boolean
     */

    public static boolean checkIfStringIsPalindrome2(String userString) {

        if (!userString.isBlank() && !userString.isEmpty()) {

            StringBuffer userStringBuffer = new StringBuffer(userString);

            String reversedWord = userStringBuffer.reverse().toString();

            boolean isPalindrome = false;

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
    /**
     * This method will compare the first half of the string agains the half of the string at the edn
     *
     * @param userString
     * @return boolean
     */

    public static boolean isPalindrome(String userString) {
        int size = userString.length();

        // Compare characters from beginning and end
        for (int i = 0; i < size/2; i++) {
            if (userString.charAt(i) != userString.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
}

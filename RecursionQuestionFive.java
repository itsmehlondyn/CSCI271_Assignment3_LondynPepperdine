/*************************************************************************
 * Assignment 5 for CSCI 271 Spring 2026
 *
 * Author: Londyn Pepperdine
 * WID:
 * OS: Windows / Ubuntu
 * Compiler: javac 25.0.1
 * Date: February 25, 2026
 *
 * Purpose:
 * This program reads a string from the user and prints it reversed
 * using a recursive function.
 *
 * Algorithm:
 * 1. Read a string from the user.
 * 2. Call recursion() to reverse the string.
 * 3. Print the reversed string.
 *
 * Data Structures:
 * - String for input and reversed output
 *
 *************************************************************************/

/********************************************************************
 * I declare and confirm the following:
 * - I have not discussed this program code with anyone other than my
 *   instructor or the teaching assistants assigned to this course.
 * - I have not used programming code obtained from someone else,
 *   or any unauthorized sources, including the Internet, either
 *   modified or unmodified.
 * - If any source code or documentation used in my program was
 *   obtained from other sources, like a textbook or course notes,
 *   I have clearly indicated that with a proper citation in the comments.
 * - I have not designed this program in such a way as to defeat or
 *   interfere with the normal operation of the supplied grading code.
 *
 * Londyn Pepperdine
 ********************************************************************/
import java.util.Scanner;

public class RecursionQuestionFive {
/*****************************backward********************************
* Description: Recursively reverses a string.
*
* Parameters:
*   str (String) - input string to reverse (input)
*
* Pre: str is initialized.
*
* Post: Returns the reversed string.
*
* Returns: String - reversed input string
*
* Called by: main
* Calls: itself recursively
************************************************************************/
    public static String backward(String n) {
        //base case
        if (n.length() == 0) {
            return n;
        }

        int index = 0;
        char c;
        if (index < n.length()) {
            c = n.charAt(index);
            String a = backward(n.substring(1));
            return a + c;
        }
        return backward(n.substring(1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your word: ");
        String word = input.nextLine();
        System.out.println("recursive = " + backward(word));

        //Test case
        System.out.println(backward("hello")); //olleh
        //Tests the function with the string "hello". It should return "olleh" as the reversed string.
        //passing the string "hello" to the backward function to reverse it and print the result.

        input.close();
    }
}
/*
* n = length of the string.
* Each recursive call removes one character.
*
* Time Complexity: O(n) because each character is processed once.
* T(n) = T(n-2) + 2c
* ...
* T(n) = T(0) + n*c
* T(n) = O(n)
*
* Space Complexity: O(n) due to recursion
*/

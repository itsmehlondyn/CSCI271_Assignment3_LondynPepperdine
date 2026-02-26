/*************************************************************************
* Assignment 2 for CSCI 271 Spring 2026
*
* Author: Londyn Pepperdine
* WID:
* OS: Windows 11
* Compiler: javac 25.0.1
* Date: February 25, 2026
*
* Purpose:
* This program reads a string and a single character from the user,
* and counts how many times that character occurs in the string using
* a recursive function. The program demonstrates recursion, base
* cases, and string processing without using loops.
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
*   obtained from other sources, like a text book or course notes,
*   I have clearly indicated that with a proper citation in the comments.
* - I have not designed this program in such a way as to defeat or
*   interfere with the normal operation of the supplied grading code.
*
* Londyn Pepperdine
********************************************************************/

import java.util.Scanner;

public class RecursionQuestionTwo {
/*****************************Occurrences********************************
* Description: Counts the number of times a given character C occurs in
*  the input string S using recursion.
*
* Parameters:
*   S - input string
*   C  - character to count
*
* Pre: S is initialized and C is a valid character.
*
* Post: Returns the total number of occurrences of C in S.
*
* Returns: int - number of occurrences
*
* Called by: main
* Calls: itself recursively
************************************************************************/
    public static int Occurrences(String S, char C) {

        //Base case
        if (S.length() == 0) {
            return 0;
        }

        //Recursive case: Check if the first character matches C
        if (S.charAt(0) == C) {
            return 1 + Occurrences(S.substring(1), C);
        }
        // Add the count from the rest of the string
        return Occurrences(S.substring(1), C);
    }

    public static void main(String[] args) {
        //Scanner for user input
        Scanner Scanner = new Scanner(System.in);

        //Read input string and character from the user
        System.out.print("Enter a word: ");
        String S = Scanner.nextLine();
        System.out.print("Enter a letter: ");
        String C = Scanner.nextLine();
        Scanner.close();

        //Call the Occurrences function and display the result
        int count = Occurrences(S, C.charAt(0));
        System.out.println("The letter " + C + " occurs " + count + " times in the word " + S + ".");

        //Test case
        System.out.println(Occurrences("banana", 'a'));
        //Tests the function with the string "banana" and the character 'a'. It should return 3 as 'a' occurs three times in "banana".
        //passing the string "banana" and the character 'a' to the Occurrences
        //function to count how many times 'a' appears in "banana" and print the result.

    }
}

/*
* n = length of the string.
* Each recursive call processes one character.
*
* Time Complexity: O(n)
* T(n) = T(n-2) + 2c
* ...
* T(n) = T(0) + n*c
* T(n) = O(n)
*
* Space Complexity: O(n) due to recursion
*/

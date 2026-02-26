/*************************************************************************
* Assignment 1 for CSCI 271 Spring 2026
*
* Author: Londyn Pepperdine
* WID:
* OS: Windows 11
* Compiler: javac 25.0.1
* Date: February 25, 2026
*
* Purpose:
* This program reads a string from the user and
* calculates the total length of the string using
* a recursive function. No loops :)
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

public class CSCI271_Assignment3_QuestionOne_LondynPepperdine {
/*****************************stringName********************************
* Description: Recursively prints each character of a string starting
*              from a given index and calculates the total length.
*
* Parameters:
*   S  - input string
*   index  - current index to process
*
* Pre: S is initialized and index >= 0.
*
* Post: Prints each character in order and returns the total length of S.
*
* Returns: int - length of the string
*
* Called by: main
* Calls: itself recursively
************************************************************************/
    public static int stringName(String S, int index)
    {
        //Base case
        if (S.length() == index)
	{
            return 0;
        }
        //System.out.println(S.charAt(index)); //test to print the character at the current index
        //Recursive case: Call the function with the next index
        return 1 + stringName(S, index + 1);
    }

    public static void main(String[] args)
    {
        //Scanner to read input from the user
        Scanner Scanner = new Scanner(System.in);

        //Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String name = Scanner.nextLine();
        
        //Call the recursive function to print characters and calculate length
        int length = stringName(name, 0);

        //Print the total length of the string
        System.out.println("The Length of your word is: " + length);
        Scanner.close();

        //Test case
	System.out.println("test case: ");
        System.out.println(stringName("hello", 0));
        //Tests basic condition and recursive calls by
        //passing the string "hello" and starting index 0.
        //It should print each character and return the length of the string
        
    }
}

/* n = length of the string.
* Each recursive call handles one character.
*
* Time Complexity: O(n)
* T(n) = T(n-1) + c
*      = T(n-2) + 2c
*      = T(n-3) + 3c
*      ...
*      = T(0) + n*c
*
* Space Complexity: O(n), due to recursion
*/

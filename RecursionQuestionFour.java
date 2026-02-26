/*************************************************************************
* Assignment 4 for CSCI 271 Spring 2026
*
* Author: Londyn Pepperdine
* WID:
* OS: Windows 11
* Compiler: javac 25.0.1
* Date: February 25, 2026
*
* Purpose:
* This program reads an integer N and a single digit D from the user
* and counts how many times D occurs in N using a recursive function.
* The program demonstrates recursion on integer digits without loops.
*
* Algorithm:
* 1. Read integer N and single digit D from the user.
* 2. Call recursive method countDigit(N, D) to count occurrences of D.
* 3. Display the result to the user.
*
* Data Structures:
* - int N for the input number
* - int D for the digit to count
* - int for storing the result
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

public class RecursionQuestionFour {

/*****************************countDigit*******************************
* Description: Counts the number of times a digit D occurs in the
*              integer N using recursion.
*
* Parameters:
*   N - integer to search
*   D - single digit to count
*
* Pre: N >= 0, D is a single digit 0-9.
*
* Post: Returns the number of occurrences of D in N.
*
* Returns: int - number of times D occurs in N
*
* Called by: main
* Calls: itself recursively
************************************************************************/
    public static int countDigit(int N, int D) {
        //base case
        if (N == 0) {
            return 0;
        }

        //recursive case: Get the last digit of N
        int remainder = N % 10;
        if (remainder == D) {
            N /= 10;
            return 1 + countDigit(N, D);
        } else {
            N /= 10;
            return countDigit(N, D);
        }
    }

    public static void main(String[] args) {
        //Scanner for user input
        Scanner Scanner = new Scanner(System.in);

        //Read input number and digit from the user
        System.out.print("Enter number a big number: ");
        int big = Scanner.nextInt();
        System.out.println("Enter one digit number: ");
        int small = Scanner.nextInt();

        //Call the countDigit function and display the result
        int numberOfTimes = countDigit(big, small);

        //Display the result to the user
        System.out.println("Number of times " + small + " if found in " + big + " is: " + numberOfTimes);

        //test case
        System.out.println(countDigit(1234567890, 1));
        //Tests the function with the number 1234567890 and the digit 1. It should return 1 as '1' occurs once in "1234567890".
        //passing the number 1234567890 and the digit 1 to the countDigit

        Scanner.close();
    }
}

/*
* n = number of digits in N.
* Each recursive call processes one digit.
* Time Complexity: O(n) because each digit is processed once.
* T(n) = T(n-1) + c
*      = T(n-2) + 2c
*      = T(n-3) + 3c
*      ...
*      = T(0) + n*c
*      = O(n)
* Space Complexity: O(n) due to recursion
*/

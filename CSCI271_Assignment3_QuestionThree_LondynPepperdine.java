/*************************************************************************
* Assignment 3 for CSCI 271 Spring 2026
*
* Author: Londyn Pepperdine
* WID:
* OS: Windows 11
* Compiler: javac 25.0.1
* Date: February 25, 2026
*
* Purpose:
* This program reads a list of integers from the user and finds the maximum
* element using a recursive function. No loops
*
* Algorithm:
* 1. Read the number of elements from the user.
* 2. Read each integer into an array.
* 3. Call recursive method max() to find the maximum element.
* 4. Display the maximum element.
*
* Data Structures:
* - int array for storing input integers
* - int for maximum value
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
* 
********************************************************************/
import java.util.Scanner;

public class CSCI271_Assignment3_QuestionThree_LondynPepperdine {
/*****************************max***************************************
* Description: Finds the maximum element in an array recursively.
*
* Parameters:
*   A - array of integers
*   n - number of elements to consider
*
* Pre: A is initialized, n > 0.
*
* Post: Returns the maximum value in the first n elements of A.
*
* Returns: int - maximum value in the array
*
* Called by: main
* Calls: itself recursively
************************************************************************/
    public static int max(int[] A, int n) {
        //base case
        if (n == 1) {
            return A[0];
        }

        //Recursive case: Find the maximum of the rest of the array
        int maxOfRest = max(A, n - 1);

        // Compare the last element with the maximum of the rest
        if (A[n - 1] > maxOfRest) {
            return A[n - 1];
        } else {
            return maxOfRest;
        }
    }

    public static void main(String[] args) {
        //Scanner for user input
        Scanner Scanner = new Scanner(System.in);

        //Read the number of elements and the elements themselves
        System.out.print("Enter number of elements: ");
        int n = Scanner.nextInt();

        //Create an array to hold the integers
        int[] A = new int[n];

        //Prompt the user to enter the integers
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            A[i] = Scanner.nextInt();
        }

        //Call the recursive function to find the maximum element
        int maximum = max(A, n);
        System.out.println("Maximum element = " + maximum);

        //Test case
        System.out.println("Test case: ");
        System.out.println((max(new int[]{3, 1, 4, 1, 5, 9}, 6)));
        //Tests the function with an array of 6 integers. It should return 9 as the maximum element.
        //passing the array {3, 1, 4, 1, 5, 9} and n = 6 to find the maximum element in the array.

        Scanner.close();
    }
}

/*
* n = number of elements in the array.
* Each recursive call compares one element with the max of the rest.
*
* Time Complexity: O(n)
* T(n) = T(n-2) + 2c
* ...
* T(n) = T(0) + n*c
* T(n) = O(n)
*
* Space Complexity: Due to recursion, space = O(n)
*/

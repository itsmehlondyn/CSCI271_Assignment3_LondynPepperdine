/*************************************************************************
 * Project 3 for CSCI 271 Spring 2026
 *
 * Author: Londyn Pepperdine
 * WID:
 * OS: Windows
 * Compiler: javac 25.0.1
 * Date: February 24, 2026
 *
 * Purpose:
 * This program reads a list of integers from the user and computes the sum
 * of all even numbers using a recursive function.
 *
 * Algorithm:
 * 1. Read array size from the user.
 * 2. Read array elements from the user.
 * 3. Call recursion() to compute the sum of even numbers.
 * 4. Print the result.
 *
 * Data Structures:
 * - int[] numbers: stores the user input numbers
 * - int: sum of even numbers
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
 ******************************************************************/

import java.util.Scanner;

public class CSCI271_Assignment3_QuestionSix_LondynPepperdine {
/***************************sumEven**********************************
 * Description: Recursively computes the sum of even numbers in an array
 *
 * Parameters:
 *   n - array of integers
 *   i - current index to process
 *
 * Pre: 0 <= i <= n.length
 * Post: Returns the sum of all even numbers in n from index i to end.
 *
 * Returns: int - sum of even numbers
 *
 * Called by: main
 * Calls: itself recursively
 ************************************************************************/
    public static int sumEven(int[] n, int i) {

        //base case
        if (i == n.length) {
            return 0;
        }

        //recursive case: if the number is even add it to the sum if not just call the function again
        if (n[i] % 2 == 0) {
            return n[i] + sumEven(n, i + 1);
        }

        //if the number is odd just call the function again
        return sumEven(n, i + 1);

    }

    public static void main(String[] args) {
        //Scanner for user input
        Scanner Scanner = new Scanner(System.in);

        //Read input size and array elements from the user
        System.out.println("Please enter array size: ");
        int size = Scanner.nextInt();

        //Create an array of the given size
        int[] numbers = new int[size];

        //Read the numbers into the array
        System.out.println("enter your numbers: ");
        //Loop to read each number into the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Scanner.nextInt();
        }

        //Call the recursive function to calculate the sum of even numbers
        int b = sumEven(numbers, 0);
        System.out.println("The sum of the even numbers is: " + b);

        Scanner.close();


        //Test case
        int[] testArray = {1, 2, 3, 4, 5, 6};
        System.out.println(sumEven(testArray, 0));
        //Tests the function with an array of 6 integers. It should return 12
        //passing the array {1, 2, 3, 4, 5, 6} and starting index 0 to calculate the sum of even numbers in the array and print the result.
    }
}

/* n = number of elements in the array.
* Each recursive call processes one element.
* Time Complexity: O(n) because each element is processed once.
* T(n) = T(n-1) + c
*      = T(n-2) + 2c
*      = T(n-3) + 3c
*      ...
*      = T(0) + n*c
*      = O(n)
* Space Complexity: O(n) due to recursion
 */

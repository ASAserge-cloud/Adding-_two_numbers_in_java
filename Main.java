
/**This program adds two numbers enter by the use. Source code written by Awunjia Serge Atabong in Buea-cameroon
 on the 17/08/2020, contact me directly at awujiaa2018@gmail.com whatsApp: +237 651565843.
This is a free and open source sofware(FOSS), feel free to modify accordingly and use.
 */

package com.ASAtech;

import java.util.Scanner;

//Main class
public class Main {

    //Creating private fields
    private static double firstNum;
    private static double secondNum;
    private static double result;

    //Creating method to add two numbers
    public static double Add(double a, double b){
        double sum;
        sum = a + b;
        return sum;
    }

    //Creating scanner object
    public static Scanner read = new Scanner(System.in);

    //Main method that runs when the program is executed
    public static void main(String[] args) {

        //Reading input from user
        System.out.println("Enter the first number");
        firstNum = read.nextDouble();

        System.out.println("Enter the second number");
        secondNum = read.nextDouble();

        //Computing the input
        result = firstNum + secondNum;

        //Displaying the final results
        System.out.printf("The sum of the two number is: %.2f", result);

    }
}

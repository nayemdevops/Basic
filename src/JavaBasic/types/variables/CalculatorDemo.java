package JavaBasic.types.variables;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("Please enter any integer number");

        int numberOne = input.nextInt();

        System.out.println("Please enter any integer number");

        int numberTwo = input.nextInt();



       int result = numberOne + numberTwo;
       System.out.println("Final Result = " + result);

    }
}

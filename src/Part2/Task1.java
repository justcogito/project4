package Part2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Project 4. Part 2. Task 1.

        Scanner in = new Scanner(System.in);
        String  result_string;

        Boolean Continue = true;

        while (Continue) {

            System.out.println("Please input a string");

            result_string = in.nextLine().toUpperCase();

            System.out.println("You wrote " + result_string);
            System.out.println("Do you want to try again?");

            result_string = in.nextLine();

            switch (result_string.toLowerCase()) {
                case "y":
                    System.out.println("Ok then, lets try again.");
                    break;
                default:
                    Continue = false;
            }
        }
    }
}
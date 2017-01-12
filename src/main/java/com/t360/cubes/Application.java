package com.t360.cubes;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        //Program keeps running till this condition updates.
        boolean keepRunning = true;
        Scanner scanner = new Scanner(System.in);

        int userOption = 0;
        while(keepRunning) {
            userOption = showOptions();
            switch(userOption) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Good-Bye");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option! Please re-enter your option again.");
                    break;
            }
        }
    }

    public static int showOptions() {
        Scanner scanner = new Scanner(System.in);
        int intChoice;
        String strChoice;

        System.out.println("\n-------------------------------------");
        System.out.println("|-----------------------------------|");
        System.out.println("| Main Menu:                        |");
        System.out.println("|-----------------------------------|");
        System.out.println("|                                   |");
        System.out.println("| 1.) Solve Cubes Puzzle            |");
        System.out.println("| 2.) Select different input data   |");
        System.out.println("| 3.) No idea now                   |");
        System.out.println("| 4.) No idea now                   |");
        System.out.println("| 5.) Exit!                         |");
        System.out.println("|                             v 1.0 |");
        System.out.println("-------------------------------------");

        System.out.print("Please choose a option: ");
        strChoice = scanner.next();
        try {
            intChoice = Integer.parseInt(strChoice);
        }
        catch (NumberFormatException e) {
            intChoice = -1;
        }
        return intChoice;
    }

}

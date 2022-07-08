package com.ProgramValera;
import java.util.Scanner;
public class StartProgram extends Operators {
    public static void processing() {
        StartProgram.Input();
    }
        private static void Input () {
            System.out.println("Input number of program: ");
            Scanner scanner1 = new Scanner(System.in);
            int numberProgram = scanner1.nextInt();

            System.out.println("Exam 0: How old are you?");
            System.out.println("Execute it?(yes or no): ");
            Scanner scannerAnswer = new Scanner(System.in);
            switch (scannerAnswer.nextLine()) {
                case "yes":
                    switch (numberProgram) {
                        case 0:
                            Exam0.processing();
                            break;
                        case 1:
                            Exam1.processing();
                            break;
                        case 2:
                            Exam2.processing();
                            break;
                        case 3:
                            Exam3.processing();
                            break;
                        case 4:
                            Exam4.processing();
                            break;
                        case 5:
                            Exam5.processing();
                            break;
                    }
                case "no":
                    StartProgram.Input();
                    break;
                default:
                    System.out.println("not correct answer, try again: ");
                    scannerAnswer.nextLine();
            }

//            switch (scanner1.nextInt()) {
//                case 0:
//                    System.out.println("Exam 0: How old are you?");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner0 = new Scanner(System.in);
//                    switch (scanner0.nextLine()) {
//                        case "yes":
//                            Exam0.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner0.nextLine();
//                    }
//                    break;
//                case 1:
//                    System.out.println("Exam 1: Countable and Uncountable");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner2 = new Scanner(System.in);
//                    switch (scanner2.nextLine()) {
//                        case "yes":
//                            Exam1.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner2.nextLine();
//                    }
//                    break;
//                case 2:
//                    System.out.println("Exam 2: Numbers");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner3 = new Scanner(System.in);
//                    switch (scanner3.nextLine()) {
//                        case "yes":
//                            Exam2.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner3.nextLine();
//                    }
//                    break;
//                case 3:
//                    System.out.println("Exam 3: Days of week");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner4 = new Scanner(System.in);
//                    switch (scanner4.nextLine()) {
//                        case "yes":
//                            Exam3.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner4.nextLine();
//                    }
//                    break;
//                case 4:
//                    System.out.println("Exam 4: Days of week(second type)");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner5 = new Scanner(System.in);
//                    switch (scanner5.nextLine()) {
//                        case "yes":
//                            Exam4.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner5.nextLine();
//                    }
//                    break;
//                case 5:
//                    System.out.println("Exam 5: Arrays");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner6 = new Scanner(System.in);
//                    switch (scanner6.nextLine()) {
//                        case "yes":
//                            Exam5.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner6.nextLine();
//                    }
//                    break;
//                case 6:
//                    System.out.println("Exam 6: Arrays2");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner7 = new Scanner(System.in);
//                    switch (scanner7.nextLine()) {
//                        case "yes":
//                            Exam6.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner7.nextLine();
//                    }
//                    break;
//                case 7:
//                    System.out.println("Exam 7: Days of week(third type)");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner8 = new Scanner(System.in);
//                    switch (scanner8.nextLine()) {
//                        case "yes":
//                            Exam7.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner8.nextLine();
//                    }
//                    break;
//                case 8:
//                    System.out.println("Exam 8: Loop while");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner9 = new Scanner(System.in);
//                    switch (scanner9.nextLine()) {
//                        case "yes":
//                            Exam8.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner9.nextLine();
//                    }
//                    break;
//                case 9:
//                    System.out.println("Exam 9: Loop Do-while");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner10 = new Scanner(System.in);
//                    switch (scanner10.nextLine()) {
//                        case "yes":
//                            Exam9.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner10.nextLine();
//                    }
//                    break;
//                case 10:
//                    System.out.println("Exam 10: Array of Char");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner11 = new Scanner(System.in);
//                    switch (scanner11.nextLine()) {
//                        case "yes":
//                            Exam10.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner11.nextLine();
//                    }
//                    break;
//                case 11:
//                    System.out.println("Exam 11: Array of symbols");
//                    System.out.println("Execute it?(yes or no): ");
//                    Scanner scanner12 = new Scanner(System.in);
//                    switch (scanner12.nextLine()) {
//                        case "yes":
//                            Exam11.processing();
//                            break;
//                        case "no":
//                            StartProgram.Input();
//                            break;
//                        default:
//                            System.out.println("not correct answer, try again: ");
//                            scanner12.nextLine();
//                    }
//                    break;
//                default:
//                    System.out.println("Вы ввели неправильное число");
//
//            }
//
        }
//
   }

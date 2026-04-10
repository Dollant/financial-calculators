package com.pluralsight;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean validChoice = false;

        while (!validChoice) {
            System.out.println("Select a calculator:");
            System.out.println("1. Mortgage Calculator");
            System.out.println("2. CD Future Value");
            System.out.println("3. Annuity Present Value");
            System.out.print("Select Choice (1-3): ");

            try {
                int choice = keyboard.nextInt();

                if (choice == 1) {
                    System.out.print("Principal: ");
                    double p = keyboard.nextDouble();
                    System.out.print("Annual Rate: ");
                    double r = keyboard.nextDouble();
                    System.out.print("Loan term (years): ");
                    int y = keyboard.nextInt();
                    FinancialCalculators.mortgageCalculator(p, r, y);
                    validChoice = true;
                } else if (choice == 2) {
                    System.out.print("Deposit: ");
                    double p = keyboard.nextDouble();
                    System.out.print("Annual Rate: ");
                    double r = keyboard.nextDouble();
                    System.out.print("Years: ");
                    int y = keyboard.nextInt();
                    FinancialCalculators.cdFutureValue(p, r, y);
                    validChoice = true;
                } else if (choice == 3) {
                    System.out.print("Monthly payout: ");
                    double pmt = keyboard.nextDouble();
                    System.out.print("Annual Rate: ");
                    double r = keyboard.nextDouble();
                    System.out.print("Years: ");
                    int y = keyboard.nextInt();
                    FinancialCalculators.annuityPresentValue(pmt, r, y);
                    validChoice = true;
                } else {
                    System.out.println("Invalid choice silly! T.T || Please select 1, 2, or 3.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Numbers only please. T.T");
                keyboard.nextLine();
            }
        }

        keyboard.close();
    }
}
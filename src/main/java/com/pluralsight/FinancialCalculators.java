package com.pluralsight;

public class FinancialCalculators {

// 1. Mortgage Calculator
// Calculates the monthly payment and total interest for a fixed-rate loan.
// Inputs:
//   principal  – total loan amount
//   annualRate – annual interest rate in decimal form (e.g., 7.625% = 0.07625)
//   years      – loan term in years
// Formula:
//   M = P * (i * (1 + i)^n) / ((1 + i)^n - 1)
//     where i = monthly interest rate (annualRate / 12)
//           n = total number of payments (years * 12)
// Total Interest = (M * n) - P
public static void mortgageCalculator(double principal, double annualRate, int years) {
    double r = annualRate / 12;     //Monthly interest rate
    int n = years * 12;             //Total number of payments
    double M = principal * (r *Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    double totalInterest = M * n - principal;

    System.out.printf("Monthly Payment:     $%.2f%n", M);
    System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);

    }

// 2. CD Future Value Calculator (Daily Compounding)
// Determines the future value of a one-time deposit using daily compounding.
// Inputs:
//   principal  – initial deposit amount
//   annualRate – annual interest rate in decimal form (e.g., 1.75% = 0.0175)
//   years      – number of years the deposit earns interest
// Formula:
//   FV = P * (1 + r/365)^(365 * years)
// Total Interest Earned = FV - P
public static void cdFutureValue(double principal, double annualRate, int years) {
    double r = annualRate;
    double FV = principal * Math.pow(1 + r / 365, 365 * years);
    double interest = FV - principal;

    System.out.printf("Future Value:          %.2f%n", FV);
    System.out.printf("Total Interest Earned: %.2f%n", interest);

    }

// 3. Annuity Present Value Calculator
// Calculates how much money must be invested today to fund a fixed monthly payout.
// Inputs:
//   monthlyPayout – amount paid out each month
//   annualRate    – expected annual interest rate in decimal form
//   years         – number of years the annuity will pay out
// Formula:
//   PV = PMT * (1 - (1 + i)^(-n)) / i
//     where i = monthly interest rate (annualRate / 12)
//           n = total number of payments (years * 12)
public static void annuityPresentValue(double monthlyPayout, double annualRate, int years) {
    double r = annualRate;
    int n = years * 12;
    double PV = monthlyPayout * (1 - Math.pow(1 + r, -n)) / r;

    System.out.printf("Present Value Needed: %.2f%n", PV);

    }
}


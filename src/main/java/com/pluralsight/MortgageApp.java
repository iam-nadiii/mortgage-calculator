package com.pluralsight;

import java.util.Scanner;

public class MortgageApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principal: ");
        double principal = input.nextDouble();

        System.out.println("Enter interest rate: ");
        double rate = input.nextDouble();

        System.out.println("Enter loan length in years: ");
        int years = input.nextInt();

        double totalInterest = interestCalculator(principal, years, monthlyInterestCalculator(principal, rate, years));

        double monthlyPay = monthlyInterestCalculator(principal, rate, years);



        System.out.printf("Your monthly pay will be $%.2f.", monthlyPay);
        System.out.println();
        System.out.printf("Your total interest will be $%.2f.", totalInterest);



    }

    private static double monthlyInterestCalculator(double principal, double rate, int years) {
        double monthlyInterest = principal * (rate/12 * Math.pow((1 + rate/12), years*12)) / (Math.pow((1 + rate/12), years * 12) -1);
        return monthlyInterest;
    }

    private static double interestCalculator(double principal, int years, double monthlyInterest){
        return (monthlyInterest * 12 * years) - principal;
    }




}



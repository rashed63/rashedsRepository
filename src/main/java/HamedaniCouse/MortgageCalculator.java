package HamedaniCouse;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void creatingNewProject(){
        final byte monthsInYear = 12;
        final byte percent = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;


        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Principal : ");
            principal = scanner.nextInt();
            if(principal>= 1000 && principal<= 1000000)
                break;
            System.out.println("Enter a value between 1k and 1M");

        }
        while(true) {
            System.out.print("Annual Interest Rate : ");
            float annualInterestRate = scanner.nextFloat();
            if(annualInterestRate>=1 && annualInterestRate<=30) {
                monthlyInterest = annualInterestRate / percent / monthsInYear;
                break;
            }
            System.out.println("enter a value between 1 and 30");

        }

        while(true) {
            System.out.print("Periods In Year : ");
            byte years = scanner.nextByte();
            if(years<=30 && years >= 1) {
                numberOfPayments = years * monthsInYear;
                break;
            }
            System.out.println("enter a valid value between 1 and 30");
        }

        double mortgage = principal *(monthlyInterest* Math.pow(1+ monthlyInterest, numberOfPayments))
                /(Math.pow(1+monthlyInterest, numberOfPayments)-1);
       String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage :: "+ mortgageFormatted);
    }

    public static void main(String[] args) {
        creatingNewProject();
    }
}

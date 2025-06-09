import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
//        int x = 1;
//        int y = 1;

//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x <= y);
//        System.out.println(x >= y);
//        System.out.println(x < y);
//        System.out.println(y < x);
//        System.out.println(x > y);
//        System.out.println(y > x);

//        && AND || OR || ! Not

//        if(x == y){
//    // do something
//        }else if( x == 2 ){
//            // do something else if condition matches
//        }else{
//
//            // do something else as fallback
//        }

//        Ternary Operator
//        int income  = 120_000;
//        System.out.println( (income > 200_000) ? "High Income" : "Low Income" );

//        Switch Statement
//        String role = "admin";
//
//        switch (role) {
//            case "admin":
//                System.out.println("You are admin");
//                break;
//            case "staff":
//                System.out.println("You are staff");
//            default:
//                System.out.println("You are a guest");
//        }

//        Fizz Buzz mini app test

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number : ");
//
//        int number = scanner.nextInt();
//
//        if(number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if(number % 5 == 0)
//            System.out.println("Fizz");
//        else if(number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);

//        For Loops

//        for (int  i = 0; i <= 5 ; i++)
//            System.out.println("Number : " + i);

//        int i = 0;
//        while(i <= 5){
//            System.out.println("Number :" + i);
//            i++;
//        }

//        int i = 0;
//        do{
//            System.out.println("Number :" + i);
//            i++;
//        }while(i <= 5);

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (true){
//            System.out.print("Input : ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass"))
//                continue;
//            if(input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

//        String[] fruits = { "Apple", "Orange" , "Mango" };
//
//        for ( String fruit : fruits )
//            System.out.println(fruit);

//        mortgage solution
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float annualInterestRate = 0;
        float monthlyInterestRate =0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter Principal :" );
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while(true){
            System.out.print("Enter Annual Interest Rate :" );
            annualInterestRate = scanner.nextFloat();
            if(annualInterestRate >=1  && annualInterestRate <= 30){
                monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a valid value between 1 and 30");
        }

        while(true){
            System.out.print("Enter Period Years:" );
            byte years = scanner.nextByte();
            if(years >= 1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a valid number between 1 and 30");
        }

        double mortgage = principal * ( monthlyInterestRate * Math.pow( 1 + monthlyInterestRate , numberOfPayments ) )
                            / ( Math.pow( 1 + monthlyInterestRate , numberOfPayments ) - 1 );

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage :" + mortgageFormatted);

    }
}
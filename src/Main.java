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
    //    Creating Mortgage Payment Calculator
    // M = P((r (1 + r) ^ n)/((1+r)^n - 1))

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal (p) :" );
        int p = scanner.nextInt();

        System.out.print("Enter rate (r) :" );
        float r = scanner.nextFloat();

        System.out.print("Enter number of payments (n) :" );
        byte n = scanner.nextByte();

        double numerator = r * Math.pow(1 + r, n);
        double denominator = Math.pow(1 + r, n) - 1;
        double m = p * (numerator / denominator);

        System.out.printf("Monthly Payment (M): %.2f%n", m);
    }
}
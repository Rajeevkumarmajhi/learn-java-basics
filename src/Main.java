import java.awt.*;
import java.util.Arrays;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Primitive Data
//        byte age = 33;
//        int count = 2000;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.9F;
//        char letter = 'A';
//        boolean isEligible = false;

        // Reference Types (Objects)
//        Integer housesCount = 200000;
//        String DeveloperName = "Rajeev Kumar Majhi";
//        Date now = new Date();
//
//        Point point = new Point(5,6);
//        Point point1 = point;
//
//        point.x = 9;
//        System.out.println(point1.x);


        // Arrays
//        int[] numbers = { 2,4,6,3,5 };

        // sort array
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        // Multi dimentional array
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
//        int [][] numbers = { {1,2,3}, {4,5,6} };
//
//
//        System.out.println(Arrays.deepToString(numbers));

//        Constants Declarations
//        final float PI = 3.14F;
//
//        System.out.println(PI);

//        Arithmetic Expression
//        int x = 1;
//        int y = x++;
//        System.out.println(x);
//        System.out.println(y);
//
//        print 2,1 since y= x first then x++

//        int x = 1;
//        int y = ++x;
//        System.out.println(x);
//        System.out.println(y);

//      prints 2,2 since x is incremented first and then set to y

//        int x = 1;
//        x += 2;  // Augmented operator
//
//        System.out.println(x);

//        Casting
//        Implicit Casting (Casting automatically short to int in below example)
//        byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);

//        Explicit Casting
//        double num = 10.99;
//        int result = (int) num;  // double to int (narrowing)
//        System.out.println(result); // Output: 10


//        Explicit Convertion using a method
        String str = "123";
        int num = Integer.parseInt(str);  // ✅ explicit conversion using a method
        System.out.println(num);

    }
}
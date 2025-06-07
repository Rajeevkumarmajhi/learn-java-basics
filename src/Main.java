import java.awt.*;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Primitive Data
        byte age = 33;
        int count = 2000;
        long viewsCount = 3_123_456_789L;
        float price = 10.9F;
        char letter = 'A';
        boolean isEligible = false;

        // Reference Types (Objects)
        Integer housesCount = 200000;
        String DeveloperName = "Rajeev Kumar Majhi";
        Date now = new Date();

        Point point = new Point(5,6);
        Point point1 = point;

        point.x = 9;

        System.out.println(point1.x);
    }
}
import java.util.Scanner;

public class FeetConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance " + feet + " feet is " + yards + " yards and " + miles + " miles");
        input.close();
    }
}

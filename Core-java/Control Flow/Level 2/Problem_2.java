import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        
        double bonus = 0;
        if(years > 5) {
            bonus = 0.05 * salary;
        }
        System.out.println("Bonus: " + bonus);
        sc.close();
    }
}

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double salary = scanner.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            double years = scanner.nextDouble();
            if (salary <= 0 || years < 0) {
                i--;
                continue;
            }
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < 10; i++) {
            double bonus = (yearsOfService[i] > 5) ? salaries[i] * 0.05 : salaries[i] * 0.02;
            double newSalary = salaries[i] + bonus;
            bonuses[i] = bonus;
            newSalaries[i] = newSalary;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

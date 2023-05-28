import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input gross salary: ");
        double grossSalary = scanner.nextDouble();

        double incomeTax = 0.21 * grossSalary;
        double socialFee = Math.min(0.05 * grossSalary, 25000);

        double stampDuty;
        if (grossSalary <= 100000) {
            stampDuty = 1500;
        } else if (grossSalary <= 200000) {
            stampDuty = 3000;
        } else if (grossSalary <= 500000) {
            stampDuty = 5500;
        } else if (grossSalary <= 1000000) {
            stampDuty = 8500;
        } else {
            stampDuty = 15000;
        }

        double netSalary = grossSalary - incomeTax - socialFee - stampDuty;

        System.out.println("Net Salary: " + netSalary);
    }
}


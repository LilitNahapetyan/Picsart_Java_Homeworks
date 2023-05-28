import java.util.Scanner;

public class YearToCentury {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        int century = (year + 99) / 100;

        System.out.println("The year " + year + " is in the " + century + " century.");

        scanner.close();
    }
}

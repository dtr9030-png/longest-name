import java.util.Scanner;

public class MonthDaysSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        } else {
            switch (month) {
                case 1:
                    System.out.println("Month: January\nDays: 31");
                    break;
                case 2:
                    System.out.println("Month: February\nDays: 28 or 29 (leap year)");
                    break;
                case 3:
                    System.out.println("Month: March\nDays: 31");
                    break;
                case 4:
                    System.out.println("Month: April\nDays: 30");
                    break;
                case 5:
                    System.out.println("Month: May\nDays: 31");
                    break;
                case 6:
                    System.out.println("Month: June\nDays: 30");
                    break;
                case 7:
                    System.out.println("Month: July\nDays: 31");
                    break;
                case 8:
                    System.out.println("Month: August\nDays: 31");
                    break;
                case 9:
                    System.out.println("Month: September\nDays: 30");
                    break;
                case 10:
                    System.out.println("Month: October\nDays: 31");
                    break;
                case 11:
                    System.out.println("Month: November\nDays: 30");
                    break;
                case 12:
                    System.out.println("Month: December\nDays: 31");
                    break;
            }
        }

        scanner.close();
    }
}

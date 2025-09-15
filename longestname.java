import java.util.Scanner;

public class LongestName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for three names
        System.out.print("Enter the first name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the second name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter the third name: ");
        String name3 = scanner.nextLine();

        // Find the longest name
        String longest = name1;
        if (name2.length() > longest.length()) {
            longest = name2;
        }
        if (name3.length() > longest.length()) {
            longest = name3;
        }

        // Display the longest name
        System.out.println("The longest name is: " + longest);

        scanner.close();
    }
}

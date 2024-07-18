package evennumber;

import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);

        scanner.close();
    }

    public static int countDigits(int n) {
        // Convert the number to string and return its length
        String numberStr = String.valueOf(n);
        return numberStr.length();
    }
}

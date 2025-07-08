//  Sum, Length, and Uppercase of a String

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
    }
}

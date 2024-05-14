package q7_Q7;

import java.util.Scanner;


public class Q7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Age: ");

            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException(" Age must be at least 18 or Higher");
            }sc.close();
            System.out.println("Age is valid and You are eligible.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
        }
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
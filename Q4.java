package q4_Q4;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        System.out.println("Enter First Num: ");
        A= sc.nextInt();
        System.out.println("Enter Second Num: ");
        B= sc.nextInt();
        sc.close();
        try {
            C = A/B;
            System.out.println("Division of Two Num is :" + C);

        } catch (ArithmeticException e) {
            System.err.println("Division by zero is not allowed and it is Invalid : " +e.getMessage());
            System.out.println("Error:"+e);
        }
    }
}
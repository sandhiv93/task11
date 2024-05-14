package q6_Q6;

import java.util.Scanner;

public santhiyaclass Q6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String MyPwd= "Hello123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password :");
        String UserPwd = sc.nextLine();
        try {
            if (!UserPwd.equals(MyPwd)) {
                throw new IncorrectpasswordException("Incorrect Pwd");
            }
            System.out.println("Login Success");
        } catch (IncorrectpasswordException e) {
            System.err.println("Password is Invalid Not matched : " +e.getMessage());
            System.out.println("Error:"+e);
        }sc.close();
    }
}
class IncorrectpasswordException extends Exception {
    public IncorrectpasswordException(String message) {
        super(message);
    }
}
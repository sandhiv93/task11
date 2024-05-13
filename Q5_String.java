package q5_Q5;

public class Q5_String {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "Chennai";

        try {
            char chars = str.charAt(7);
            System.out.println("Expected Characters is : " + chars);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Error : " + e.getMessage());
            System.out.println("Error : " + e);
        }
    }
}

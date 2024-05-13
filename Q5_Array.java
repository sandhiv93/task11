package q5_Q5;

public class Q5_Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums= {1,2,3,4,5};
        try {
            int value = nums[6];
            System.out.println("Value of Index Array is :" + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error : " + e.getMessage());
            System.out.println("Error : " + e);
        }
    }

}
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArmstrongNumber {
    //A number is called an Armstrong number if it is equal to the cube of its every digit.
    // For example, 153 is an Armstrong number because of 153= 1+ 125+27,
    // which is equal to 1^3+5^3+3^3.

    public static boolean isArmstrong(int n){
        int sum = 0;

        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        int [] numArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Character.getNumericValue(arr[i]);
        }
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            sum += Math.pow(numArr[i], 3);
        }
        if(sum==n){
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        int n =153;
        System.out.println(isArmstrong(n));
    }
}

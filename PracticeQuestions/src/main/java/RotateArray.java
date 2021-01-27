import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] array, int index){
        int []arrayResult = new int[array.length];

        int j =0;
        int temp = 0;
        for (int i = index; i < array.length; i++) {
            arrayResult[j] = array[i];
            j++;
            temp = j;
        }
        for (int i = 0; i < array.length; i++) {
            arrayResult[temp] = array[i];
            temp++;
            if(temp==array.length)
                break;
        }
        return arrayResult;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10};
        int index = 2;
        System.out.println(Arrays.toString(rotateArray(arr, index)));
    }
}

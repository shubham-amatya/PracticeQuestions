import java.util.Arrays;

public class EvenArray {
    //From a given array, make a new array with only even numbers

    public static int[] makeEvenArray(int[] array) {

        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        int[] evensArray = new int[evenCount];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evensArray[j] = array[i];
                j++;
            }
        }
        return evensArray;
    }

    public static void main(String[] args) {
        int [] ar = {3, 4, 5, 8, 2, 1};
        System.out.println(Arrays.toString(makeEvenArray(ar)));
    }
}

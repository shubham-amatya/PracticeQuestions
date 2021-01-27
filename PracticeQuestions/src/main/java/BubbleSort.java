import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] ar) {
        int temp;
        for (int i = 0; i <ar.length-1; i++) {
            for(int j=0; j<ar.length-1; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }

        } return ar;
    }


    public static void main(String[] args) {
        int[] ar = {3, 4, 5, 8, 2, 1};
        System.out.println(Arrays.toString(bubbleSort(ar)));
    }
}

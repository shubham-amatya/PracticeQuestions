import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
       int holder;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    holder = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= holder;
                }
            }
        } return arr;
    }


    public static void main(String[] args) {
        int[] a = {5, 1, 3, 7, 8, 4};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }
}

import java.util.Arrays;

public class ReverseArrayReverseOrder {

    public static int[] sortArrayReverseOrder(int[] arr){
//        int[] results = new int[arr.length];
        int temp;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 6, 7, 4};
        System.out.println(Arrays.toString(sortArrayReverseOrder(a)));
    }

}

import java.util.Arrays;

public class BinarySearch {

    //find the index at which a num is present using binary search method

    public static int findNumBinarySearch(int[] array, int x){

        int start = 0, end = array.length-1;

        for (int i = 0; i < array.length; i++) {
            int mid = start + (end-start)/2;

            if(array[mid] == x){
                return mid;
            } else if (array[mid]< x){
                start = mid+1;
            } else {
                end = mid -1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int [] ar = {3, 4, 5, 8, 2, 1};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int n = 4;
        System.out.println(findNumBinarySearch(ar, n));
    }



}





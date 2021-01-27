public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {

        int start =0, end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]== x)
                return mid;
            if(arr[mid]<x)
                start= mid +1;
            else
                end = mid-1;
        }
        return -1;
    }






    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int n = 6;
        System.out.println(binarySearch(nums, n));
    }
}

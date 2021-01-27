public class SmallestNum {

    public static int findSmallestNum(int[] arr){

        int smallestNum = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                    smallestNum = arr[i+1];
            }
        } return smallestNum;
    }

    public static void main(String[] args) {
        int [] ar = {3, 4, 5, 8, 2, 1};
        System.out.println(findSmallestNum(ar));
    }
}

public class BiggestNumInArray {

    public static int findBiggestNumInArray(int[] arr){

        int biggestNum = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                biggestNum = arr[i+1];
            }

        } return biggestNum;
    }

    public static void main(String[] args) {
        int [] ar = {3, 4, 5, 8, 2, 1};
        System.out.println(findBiggestNumInArray(ar));
    }
}

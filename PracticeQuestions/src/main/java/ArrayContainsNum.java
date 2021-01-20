public class ArrayContainsNum {

    public static boolean arrayContainsNum(int[] arr, int num){

        boolean containsNum = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num ){
                containsNum = true;
                break;
            } else {
                containsNum = false;
            }
        } return containsNum;
    }

    public static void main(String[] args) {
        int[] ar = {3, 4, 5, 8, 2, 1};
        int n = 9;
        System.out.println(arrayContainsNum(ar, n));
    }

}

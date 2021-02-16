import java.util.Arrays;

public class Pangramic {
    //pangramic is a sentence which has all the alphabets from a-z only once

    public static boolean isPangramic(String str){

        if(str.length()<26){
            return false;
        }

        str.replaceAll("\\s", "");
        System.out.println(str);
        char[] arr = str.toCharArray();

        String result = "";



                Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }




//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j <arr.length-1 ; j++) {
//                if(arr[j]>arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }

            String expected = "abcdefghijklmnopqrstuvwxyz";

            if(expected.equals(result)){
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        System.out.println(isPangramic(s));
    }


}

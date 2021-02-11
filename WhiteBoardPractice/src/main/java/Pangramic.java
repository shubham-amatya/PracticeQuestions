public class Pangramic {
    //pangramic is a sentence which has all the alphabets from a-z

    public static boolean isPangramic(String str){

        if(str.length()<26){
            return false;
        }

        char[] arr = str.toCharArray();
        char temp;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[i]>arr[i+1]){

                }
            }

        }


        return false;
    }

}

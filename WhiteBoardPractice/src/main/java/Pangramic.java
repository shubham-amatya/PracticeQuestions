public class Pangramic {
    //pangramic is a sentence which has all the alphabets from a-z only once

    public static boolean isPangramic(String str){

        if(str.length()<26){
            return false;
        }
        str.replaceAll("\\s", "");
        char[] arr = str.toCharArray();
        char temp;

        char[] given = Arrays.sort(arr);

//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j <arr.length-1 ; j++) {
//                if(arr[j]>arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }

            String expected = "abcdefghijklmnopqrstuvwxyz";
            //String given = arr.toString();
            if(expected.equals(given)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        System.out.println(isPangramic(s));
    }


}

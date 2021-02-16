import java.util.Arrays;
import java.util.HashMap;

public class Pangramic {
    //pangramic is a sentence which has all the alphabets from a-z only once

    public static boolean isPangramic(String str){

        if(str.length()<26){
            return false;
        }

        String withoutSpaces =  str.replaceAll("\\s", "");
        System.out.println(withoutSpaces);
        char[] arr = withoutSpaces.toCharArray();
        String result = "";


                Arrays.sort(arr);
        System.out.println(arr);

        HashMap<Character , Integer> map = new HashMap<>();

        for (int i = 0; i < map.size() ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for ( Character c: map.keySet()
             ) {
            result += c ;

        }
        System.out.println(result);



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

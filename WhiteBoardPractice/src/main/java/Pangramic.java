import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pangramic {
    //pangramic is a sentence which has all the alphabets from a-z only once

    public static boolean isPangramic(String str) {

        if (str.length() < 26) {
            return false;
        }

        String withoutSpaces = str.replaceAll("\\s", "");
        System.out.println(withoutSpaces);
        char[] arr = withoutSpaces.toCharArray();



        Arrays.sort(arr);
        System.out.println(arr);

        HashMap<Character, Integer> map = new HashMap<>();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        char[] resultOfChar = new char[map.size()];
        int j= 0;
        for(Character i: map.keySet()){
            resultOfChar[j] = i;
            j++;

        }

        for (int i = 0; i < resultOfChar.length; i++) {
            result += resultOfChar[i];
        }


        System.out.println(result);


        String expected = "abcdefghijklmnopqrstuvwxyz";

        if (expected.equals(result)) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        System.out.println(isPangramic(s));
    }


}

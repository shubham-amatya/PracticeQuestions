import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayMove {
    public static void main(String[] args) {




    }





    public static char findLastNonRepeatedCharInString() {
        String originalStr = "Maggie";
        char holder = 0;
        for (int i = 0; i < originalStr.length(); i++) {
            for (int j = 0; j < originalStr.length(); j++) {
                if (originalStr.charAt(i) != originalStr.charAt(j)) {
                    holder = originalStr.charAt(i);
                    break;
                }
            }
        }
        System.out.println(holder);
        return holder;
    }

    public static char findFirstNonReppeatedCharInString() {
        String originalStr = "Mmmaggiee";
        char wantedChar;
        char[] arrChar = originalStr.toCharArray();
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char c : arrChar
        ) {
            countMap.put(c, countMap.containsKey(c) ? countMap.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                wantedChar = entry.getKey();
                System.out.println(wantedChar);
                return wantedChar;
            }
        }
        throw new RuntimeException("No non-repeated characters found");
    }
    // HashMap<Character,Integer> scoreboard = new HashMap<>();
    //        // build table [char -> count]
    //        for (int i = 0; i < word.length(); i++) {
    //            char c = word.charAt(i);
    //            if (scoreboard.containsKey(c)) {
    //                scoreboard.put(c, scoreboard.get(c) + 1);
    //            } else {
    //                scoreboard.put(c, 1);
    //            }
    //        }
    //        // since HashMap doesn't maintain order, going through string again
    //        for (int i = 0; i < word.length(); i++) {
    //            char c = word.charAt(i);
    //            if (scoreboard.get(c) == 1) {
    //                return c;
    //            }
    //        }
    //        throw new RuntimeException("Undefined behaviour");
    //    }
    //
    //}


















    //Count the number of duplicates in an array
    public static int countDuplicates(int[] array) {
        //{1,1,2, ,5,3, 5}
        int count = 0;
        for (int i = 0; i < array.length; i++) { //1
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    count++;
                }
            }
        }
        return count;
    }


    //Delete the duplicate number in an array
    public static int[] duplicateDeleter(int[] array) {

        HashMap<Integer, Integer> countNumbers = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (countNumbers.containsKey(array[i])) {
                countNumbers.put(array[i], countNumbers.get(array[i] + 1));
            } else {
                countNumbers.put(array[i], 1);
            }
        }
        int[] result = new int[countNumbers.size()];
        int j = 0;
        for (Integer i : countNumbers.keySet()) {
            result[j] = i;
            j++;
        }
        return result;
    }

    public static int[] duplicateDeleter1(int[] array){
 return null;
    }




}
















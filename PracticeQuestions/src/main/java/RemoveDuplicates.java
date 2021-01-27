import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    //Given a list of numbers, remove duplicates and return the list of unique numbers in the list

    public static int[] deleteDuplicate(int[] arr) {

        HashMap<Integer, Integer> resultsMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if(resultsMap.containsKey(arr[i])){
                resultsMap.put(arr[i], resultsMap.get(arr[i])+1);
            } else{
                resultsMap.put(arr[i], 1);
            }
        }

        int[] results = new int[resultsMap.size()];

        int i =0;
      for  ( Map.Entry<Integer, Integer> map : resultsMap.entrySet()){
        results[i] = map.getKey();
        i++;
      }
        return results;
    }


    public static void main(String[] args) {
        int[] ar = {5,6,7, 5, 6,4};
        System.out.println(Arrays.toString(deleteDuplicate(ar)));
    }
}

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
    //find repeated characters in a string

    public static char[] repeatedCharacterFinder(String str){
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        String reps = "";
       for(Map.Entry<Character, Integer> entry : map.entrySet()){
           if(entry.getValue()>1){
               reps += entry.getKey();
           }
       }

       char[] result = reps.toCharArray();

        return result;
    }

    public static void main(String[] args) {
        String str = "fibonacci";
        System.out.println(repeatedCharacterFinder(str));
    }

}

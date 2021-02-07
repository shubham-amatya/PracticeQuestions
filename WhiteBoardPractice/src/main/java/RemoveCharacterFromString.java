import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCharacterFromString {

    //Write a method which will remove any given character from a String?

    public static String removeCharacter(String str, char remove){
        String output = "";
        int countCharToRemove = 0;
        char[] arrChar = str.toCharArray();
//       ArrayList<Character> characters = new ArrayList<>();
//        for (int i = 0; i < arrChar.length; i++) {
//            characters.add(i, arrChar[i]);
//        }
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == remove) {
                countCharToRemove++;
            }
        }
            for (int j = 0; j < arrChar.length; j++) {
                if(arrChar[j]!=remove){
                    output += arrChar[j];
                }

        }
        return output;
    }

    public static void main(String[] args) {
        String s = "apple";
        char r = 'a';
        System.out.println(removeCharacter(s, r));
    }


}

public class RemoveFirstAndLastChar {

    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */

    public static String removeFirstAndLastChar(String str){
        String result = str.substring(1, str.length()-1);
        return result;
    }
}

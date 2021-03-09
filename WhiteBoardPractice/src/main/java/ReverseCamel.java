public class ReverseCamel {

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */

    public static String reverseCamel(String str){
        String reversed = "";

        for (int i = str.length()-1; i>=0; i--) {
            reversed += str.charAt(i);

        }
        String output = reversed.substring(0,1).toUpperCase()+reversed.substring(1);

       return output;

    }

    public static void main(String[] args) {
        String input = "the quick brown fox";
        System.out.println(reverseCamel(input));
    }
}

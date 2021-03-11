public class ReverseCasing {

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */

    public static String reverseCasing(String str){
        char [] arr = str.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            char c1 = arr[i];
            if (Character.isUpperCase(c1)) {
              arr[i] =  Character.toLowerCase(c1);
            } else {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
            for (int j = 0; j < arr.length; j++) {
                result += arr[j];
            }

            return result;
    }

    public static void main(String[] args) {
        String input = "tHE quiCK brOwN";
        System.out.println(reverseCasing(input));
    }
}

public class Palindrome {

    public static boolean isPalindrome(String word){

        if(word.equals(null) || word.equals("")){
            return false;
        }

        String reversedWord = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversedWord += word.charAt(i);
        }

        if(word.toLowerCase().equals(reversedWord.toLowerCase())){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String word = "kayak";
        System.out.println(isPalindrome(word));
    }



}

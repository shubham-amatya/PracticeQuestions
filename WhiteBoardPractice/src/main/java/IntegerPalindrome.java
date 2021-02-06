public class IntegerPalindrome {
    public static boolean isIntegerPalindrome(int n) {
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        String reverse = "" ;

        for (int i = arr.length-1; i >= 0; i--) {
            reverse += arr[i];
        }
        if (str.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 1221;
        System.out.println(isIntegerPalindrome(n));
    }


}

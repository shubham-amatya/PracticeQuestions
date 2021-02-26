public class LongestSubString {

    //given a string, find the longest substring without repeated characters

    public static int longestSubstring(String s) {


        String answer = "";
        String temp = "";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!temp.contains("" + s.charAt(i))) {
                temp += s.charAt(i);
                if (temp.length() > answer.length()) {
                    answer = temp;
                }
            } else {
                //temp -= s.charAt(i);
                // temp = "";
                n = temp.indexOf(s.charAt(i));
                temp = temp.substring(n + 1);
                temp += s.charAt(i);
            }
        }
        return answer.length();
    }

    }


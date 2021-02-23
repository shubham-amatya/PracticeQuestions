public class LongestSubString {

    //given a string, find the longest substring without repeated characters

    public static String longestSubstring(String str) {


        int n = str.length();

        // Result
        int res = 0;

        for (int i = 0; i < n; i++) {

            // Note : Default values in visited are false
            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {

                // If current character is visited
                // Break the loop
                if (visited[str.charAt(j)] == true)
                    break;

                    // Else update the result if
                    // this window is larger, and mark
                    // current character as visited.
                else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }

            // Remove the first character of previous
            // window
            visited[str.charAt(i)] = false;
        }
        return res;
    }
}
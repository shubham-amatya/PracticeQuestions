public class Outlier {
    //You are given an array (which will have a length of at least 3,
    // but could be very large) containing integers.
    // The array is either entirely comprised of odd integers or entirely
    // comprised of even integers except for a single integer N. Write a method
    // that takes the array as an argument and returns this "outlier" N.

    static int find(int[] integers){

        int even = 0;
        int answer = integers[0];
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                even++;
            }
        }
        if (even >= 2) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 != 0) {
                    answer = integers[i];
                    break;
                }
            }
        } else {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    answer = integers[i];
                    break;
                }
            }
        }
        return answer;

    }


}

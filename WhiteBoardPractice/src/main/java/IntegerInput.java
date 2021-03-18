public class IntegerInput {

    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */

    public static int sumTilli(int n){

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;

        }
        return sum;
    }
}

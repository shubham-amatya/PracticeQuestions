public class IntegerInReverseOrder {

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */

    public static int reverseIntOrder(int val){
        int output;
        String output1 = "";
        String input = Integer.toString(val);
        for (int i = input.length()-1; i>=0;  i--) {
            output1 += input.charAt(i);
        }

        output = Integer.parseInt(output1);
        return output;
    }

    public static void main(String[] args) {
        Integer input = 12345;
        Integer expected = 54321;
        System.out.println(reverseIntOrder(input));
    }


}

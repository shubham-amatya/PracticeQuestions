public class NumSwap {

    //•	Swap 2 numbers, With and without a temp var

    public static void swapNumsUsingVariable(int x, int y){
        int z = x;
        x = y;
        y = z;

        System.out.println("x = " + x);
        System.out.println("y = "+ y);

    }

    public static void swapNumsWithoutVariable(int x, int y){
        // The idea is to get a sum in one of the two given numbers.
        // The numbers can then be swapped using the sum and subtraction from the sum.

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = "+ y);


    }

    public static void main(String[] args) {
        int x= 5, y = 10;
        swapNumsWithoutVariable(x, y);

    }

}

public class NumSwap {

    //•	Swap 2 numbers, With and without a temp var

    public static void swapNumsUsingVariable(int x, int y){
        int z = x;
        x = y;
        y = z;

        System.out.println("x = " + x);
        System.out.println("y = "+ y);

    }

    public static void main(String[] args) {
        int x= 5, y = 10;
        swapNumsUsingVariable(x, y);

    }

}

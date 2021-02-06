public class Factorial {

    public static int factorialFinder(int n){

        int factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i;

        }
        return factorial;
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(factorialFinder(n));
    }
}

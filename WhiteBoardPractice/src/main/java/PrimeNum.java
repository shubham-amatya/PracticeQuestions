public class PrimeNum {
    //Write a Java program to check if a given number is prime or not.

    public static boolean primeNumberFinder1(int num){
        if(num <=1){
            return false;
        }else if(num ==2 || num ==3 || num==5 || num ==7){
            return true;
        }
        else if(num %1 == 0 && num %num ==0 && num% 2!= 0 && num %3 !=0 && num %5 !=0 && num%7 !=0){
            return true;
        } return false;
    }

    public static boolean primeNumFinder2(int num){

        if(num<=0){
            return false;
        }
        for (int i = 2; i < num ; i++) {
            if(num %i ==0){
                return false;
            }
        } return true;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(primeNumFinder2(n));
    }

}

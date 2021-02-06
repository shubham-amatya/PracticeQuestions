public class PrimeNum {
    //Write a Java program to check if a given number is prime or not.

    public static boolean primeNumberFinder(int num){
        if(num <=1){
            return false;
        }else if(num ==2 || num ==3 || num==5 || num ==7){
            return true;
        }
        else if(num %1 == 0 && num %num ==0 && num% 2!= 0 && num %3 !=0 && num %5 !=0 && num%7 !=0){
            return true;
        } return false;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(primeNumberFinder(n));
    }

}

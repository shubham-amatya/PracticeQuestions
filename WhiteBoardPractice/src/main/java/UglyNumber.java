public class UglyNumber {

    //Write a Java program to check whether a given number is an ugly number.
    //In number system, ugly numbers are positive numbers whose
    // only prime factors are 2, 3 or 5.


    public static boolean uglyNumberFinder(int num){
        if (num==1){
            return true;
        }
        if((num%7 !=0 || num%9!=0 || num%8!=0) && (num%2==0 || num%3==0 || num %5==0) ){

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 14;
        System.out.println(uglyNumberFinder(n));
    }

}

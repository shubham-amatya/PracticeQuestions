public class BinaryTree {
     /*

     Given a number n, print the numbers in a pyramid format.. eg. n =10


            1

            2 3

            4 5 6

            7 8 9 10,  and so on.*/

     public static void makeTree(int endPoint){
         int currentNum=1;

         for (int i = 1; currentNum<=endPoint; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(currentNum + " ");
                 currentNum++;
             }
             System.out.println("\n");

         }
     }

    public static void main(String[] args) {
        int n = 10;
        makeTree(n);

    }
}

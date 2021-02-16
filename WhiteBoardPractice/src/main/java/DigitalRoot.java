import java.util.Arrays;

public class DigitalRoot {

    public static int digital_root(int n) {

        if (n == 0)
            return 0;
        int temp = (n % 10 + digital_root(n / 10));
        if (temp < 10)
            return temp;
        return digital_root(temp);

    }

    public static int digital_root1(int n) {
        int root = 0;
        while (n > 0 || root > 9) {
            if (n == 0) {
                n = root;
                root = 0;
            }
            root += n % 10;
            n /= 10;
        }
        return root;

    }
//
    public static void main(String[] args) {
        int n = 16;
        System.out.println(digital_root(n));
    }


}

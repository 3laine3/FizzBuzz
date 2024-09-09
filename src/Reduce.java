/**
 * Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
 * Prints how many steps it takes to reach 0 if you start at 100
 */
public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        while (n != 0){
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}

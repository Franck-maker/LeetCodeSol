package integers;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Implement pow(x,n) which calculates x raised to the power n
 * x E [-100, 100] et n E [-2^31, 2^31-1]
 */
public class Power {
    //logger
    private static final Logger logger =  Logger.getLogger(Power.class.getName());

    public double power(double x, int n) {
        int res = 1;
       long num = Math.abs((long) n); // because for absolute value of the min of n could cause an overflow since it'll be greater than the max
        while (num !=0){
            if (num%2 == 1){
                res *= (int) x;
                num= num-1;
            }
            x *= x;
            num /= 2;

        }

        return n>0 ? res : 1.0/res;

    } //TC : O(log2n) SC : O(1)

    public static void main(String[] args) {
        Power p = new Power();
        Scanner sc = new Scanner(System.in);
        logger.info("Enter power of x: ");
        int n = sc.nextInt();
        logger.info("Enter x the value to power: ");
        double x = sc.nextDouble();
        logger.info(() -> "The value of "+x +"to the power of "+n+ " is " +p.power(x, n));
        sc.close();

    }
}

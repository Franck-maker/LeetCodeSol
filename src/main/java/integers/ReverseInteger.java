package integers;
import java.util.*;
import java.util.logging.Logger;

/**
 * Given a signed 32-bit integer x return x with its digits reversed.
 * if reverses x causes the value to go outside the signed 32-bit integer
 * range [-2^31, 2^31-1], then return 0
 * Assume the environment doesn't allow you to store 64-bit integers (signed or unsigned)
 * 
 * ex1 : Input x = 123 output : 321
 * ex2 : Input: x =-123 output -321
 * ex3 : Input: x = 120 output 21
 */



public class ReverseInteger {

    private static final Logger logger = Logger.getLogger(ReverseInteger.class.getName());

    public int reverse (int x){
        int min = Integer.MIN_VALUE; // -2,147,483,648
        int max = Integer.MAX_VALUE; // 2,147,483,647
        int reversed = 0; 
        while( x!= 0){
            int lastDigit = x%10; // getting the last digit 
            /**
             * the purpose of dividing by ten is that, when reversing the number,
             * since the current reversed integer is multiplied by 10, if it's 
             * already greater than the min/max value divided by 10, then it'll overflow.
             * so we return 0. */
             
            // Check for overflow before it happens
            if (reversed > max/10 || (reversed == min/10 && lastDigit > 7)) {
                return 0;
            }
            if (reversed < min/10 || (reversed == min/10 && lastDigit < -8)) {
                return 0;
            }
            reversed = reversed * 10 + lastDigit;
            x /=10; // removing the last digit
        }
        return reversed;  
    }

    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        Scanner sc = new Scanner(System.in);
        logger.info("Enter you Integer: ");
        int x = sc.nextInt();
        logger.info(() -> "The reverse of "+x +" is " +obj.reverse(x));
        sc.close();


    }
    
}

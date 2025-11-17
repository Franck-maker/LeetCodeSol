package integers;

import java.util.*;
import java.util.logging.Logger;

public class FizzBuzzSol {

    private static final Logger logger = Logger.getLogger(FizzBuzzSol.class.getName());

    public String[] fizzBuzz(int n) {
        String [] ans = new String [n];
        for(int i=1; i<=n; i++){
            if(i%3 ==0 && i%5 ==0){
                ans[i-1] = "Fizz";
            } else if (i%3 ==0){
                ans[i-1] = "Buzz";
            } else if(i%5 ==0){
                ans[i-1] = "Fizz";
            }else{
                ans[i-1] = String.valueOf(i);
            }
        }
        return ans; 
    }

    /**
     * TC(Time complexity: O(n)
     * SC(Space Complexity : O(n)
     */
    public static void main(String[] args) {

        FizzBuzzSol f = new FizzBuzzSol();
        Scanner sc = new Scanner(System.in);
        logger.info("Enter your integer value for FizzBuzz : ");
        int n = sc.nextInt();
        logger.info(() -> "your FizzBuzz output is "+ Arrays.toString(f.fizzBuzz(n)));


    }
}

package integers;


import java.util.Scanner;
import java.util.logging.Logger;

public class FactZeroTrail {

    private static final Logger logger = Logger.getLogger(FactZeroTrail.class.getName());

    public int numZeros(int n) {

        int occ = 0;
        int div = 5;

        while ( n >= div){
            occ += n/div;
            div *=5;
        }
        return occ;
    }
    public static void main(String[] args) {
        FactZeroTrail obj = new FactZeroTrail();

        Scanner sc = new Scanner(System.in);
        logger.info("Enter the value to find the trailing zeroes of his factorial : ");
        int n =sc.nextInt();
        logger.info( () -> "the number of trailing zeroes for the factorial of "+n+" is "+obj.numZeros(n));
    }
} // TC: O(log5(n)), SC: O(1)


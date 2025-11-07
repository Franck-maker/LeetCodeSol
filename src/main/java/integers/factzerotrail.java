package integers;
import java.util.*;
import java.lang.*;
public class factzerotrail {

    public int numZeros(int n) {

        int occ = 0;

        for (int i = 1; i <= n/5; i++) {
            occ = occ + (int) (n / (Math.pow(5,i)));
        }
        return occ;
    }
    // since above Math.pow(5,i) returns a double which is unnecessary and can be inaccurate for a large n
    // here's another solution
    public int numzeros(int n) {

        int occ = 0;
        int div = 5;

        while ( n >= div){
            occ += n/div;
            div *=5;
        }
        return occ;
    }
    public static void main(String[] args) {
        factzerotrail obj = new factzerotrail();
        int n = 125;
        //System.out.println("the number of trailing zeroes for the factorial of "+n+" is "+obj.numZeros(n));
        System.out.println("the number of trailing zeroes for the factorial of "+n+" is "+obj.numzeros(n));
    }
} // TC: O(log5(n)), SC: O(1)

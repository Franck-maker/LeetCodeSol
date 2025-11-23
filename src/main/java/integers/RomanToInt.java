package integers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * The principle is that to find the integer value of a roman value,
 * we take the roman value and if the left value is greater than the right value in the line,
 * we make an addition but if the left value is less than the right one we make a subtraction and so on
 * until the end of the Roman value.
 */

public class RomanToInt {

    private static final Logger logger = Logger.getLogger(RomanToInt.class.getName());

    public int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            if(i<n-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res -= map.get(s.charAt(i));
            } else{
                res += map.get(s.charAt(i));
            }
        }
        return res;

    } // TC : O(n), SC : O(1)

    public static void main(String [] args){
        RomanToInt r = new RomanToInt();
        Scanner sc = new Scanner(System.in);
        logger.info("Enter a roman value containing only characters like 'I', 'V', 'X', 'L', 'C', 'D', 'M': ");
        String st = sc.nextLine();
        logger.info(()-> "the integer value of your roman value is : "+r.romanToInt((st.toUpperCase())));


    }
}

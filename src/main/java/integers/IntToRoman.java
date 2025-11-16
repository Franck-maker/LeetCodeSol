package integers;

import java.util.Scanner;
import java.util.logging.Logger;

public class IntToRoman {

    public static final Logger logger = Logger.getLogger(IntToRoman.class.getName());
    public String intToRoman(int num) {
        int [] storeInt = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] storeRoman = {"M", "CM","D", "CD", "C", "XC", "L", "XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();
        for(int i = 0 ; i < storeInt.length ; i++){
            while(num >= storeInt[i]){
                String symbol = storeRoman[i];
                roman.append(symbol);
                num -= storeInt[i];
            }
        }
        return roman.toString();
    }//TC: O(13 log n), SC: O(13)

    public static void main(String [] args){

        IntToRoman i2r = new IntToRoman();
        Scanner sc = new Scanner(System.in);
        logger.info("Enter an integer : ");
        int num = sc.nextInt();
        logger.info(()-> "The roman value of "+num + " is " + i2r.intToRoman(num));

    }
}

package strings;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseString {
    private static final Logger logger = Logger.getLogger(ReverseString.class.getName());

    public void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
    } //TC : O(n) SC : O(1)

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        logger.info("Enter a string to reverse : ");
        String line = sc.nextLine();
        char [] s = line.toCharArray();
        ReverseString rs = new ReverseString();
        rs.reverseString(s);
        logger.info( () -> "The reverse of the string is : " + new String(s));
        sc.close();

    }
}

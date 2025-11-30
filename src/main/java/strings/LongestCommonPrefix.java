package strings;

import java.util.Scanner;
import java.util.logging.Logger;

public class LongestCommonPrefix {

    private static final Logger logger = Logger.getLogger(LongestCommonPrefix.class.getName());

    public String longestCommonPrefix(String[] strs) {
        // checking if the strings array is not null
        if(strs == null || strs.length == 0) return "";
        // setting the first string of the array as the prefix
        String prefix = strs[0];
        /**
         * going through the remaining string of the array to see
         * if they match prefix and if they don't, decreasing the value
         * of the prefix accordingly
         */
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;


    } /**
       TC : O(m*n) : the length of the list and the length of the longest string in the list,
       SC : O(1)
     */

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        logger.info("Enter your array of strings : ");
        String [] strs = sc.nextLine().split(" ");
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        logger.info( ()-> "the longest common prefix of your strings is : "+ lcp.longestCommonPrefix(strs));

        // try with : flower, flow, flight

    }
}

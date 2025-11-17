package integers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class SingleNumberSol {

    private static final Logger logger = Logger.getLogger(SingleNumberSol.class.getName());

    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    } //TC : O(n) SC: O(n)

    /**
     * Doing it with xor operation to improve the
     * space complexity
     */

    public int singleNumber2(int[] nums) {
        int singleNum =0;
        for(int num : nums){
            singleNum ^= num;
        }
        return singleNum;
    }// TC: O(n) SC: O(1)


    public static void main(String [] args){
        SingleNumberSol sol = new SingleNumberSol();
        Scanner sc = new Scanner(System.in);
        logger.info("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        logger.info("Enter the elements of the array : ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        logger.info(()-> "the single number contained in your array is :"+ sol.singleNumber2(nums));
        sc.close();

    }
}

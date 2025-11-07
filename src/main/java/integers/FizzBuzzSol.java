package integers;

import java.util.*;

public class FizzBuzzSol {

    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3 ==0 && i%5 ==0){
                ans.add("FizzBuzz");
            } else if (i%3 ==0){
                ans.add("Fizz");
            }else if(i%5 ==0){
                ans.add("Buzz");
            }else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }

    public String[] fizzBuzz2(int n) {
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
        int n = 15;
        List<String> ans = f.fizzBuzz(n);
        System.out.println(ans);

    }
}

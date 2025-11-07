package integers;

public class IntPower {

    public double pow(double x, int n) {
        long num = Math.abs((long) n);
        int res = 1; // it's better to use double to handle both int and double solutions (double res)
        while(num!=0){
            if(num%2==1){
                res *= x;
                num = num-1;
            }
            x *= x;
            num /= 2;
        }
        return n<0 ? 1.0/res : res;

    } //TC: O(log2n) SC: O(1)

    public static void main(String[] args) {

    }
}

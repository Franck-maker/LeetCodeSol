package integers;

public class PalindromeNum {

    private int isPalindrome(int num) {
        boolean isNegative = num <0;
        if(isNegative){
            return -num;
        }
        //
        int rev =0;
        while(num > 0){

            int rem = num % 10;
            rev =  rev*10 + rem;

            if((rev-rem)/10 != 0){
                return 0;
            }
            num = num / 10;
        }
        return isNegative ? rev*-1 : rev;


    }

    // other solution

    public boolean isPalin(int num) {
        if(num <0 || (num != 0 && num%10 == 0)) return false;

        int reverse = 0;
        while(num > reverse){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return (num == reverse || num == reverse/10) ? true : false;
    }
}

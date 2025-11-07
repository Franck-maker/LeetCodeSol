package strings;

public class ReverseWords {

    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        // step1 : reverse the entire string
        reverse(str, 0, str.length-1);
        // step2 : reverse each word
        reverseWord(str);
        // step3 : clean space
        return cleanSpaces(str);


    } //O(n), SC: O(1)

    private String cleanSpaces(char[] str) {
        int right = 0;
        int left = 0;

        while(right < str.length){
            while(right< str.length && str[right] == ' ') right++;
            while(right < str.length && str[right] != ' '){
                str[left] = str[right];
                left++;
                right++;
            }
            while(right< str.length && str[right] == ' ') right++;
            if(right < str.length){
                str[left] = ' ';
                left++;
            }

        }
        return new String(str).substring(0, left);
    }



    private void reverseWord(char[] str) {
        int right =0;
        int left =0;

        while(left < str.length) {
            while(left <str.length && str[left] == ' ') left++;
            right = left;
            while(right < str.length && str[right] != ' ') right++;
            reverse(str, left, right-1);
            left = right;
        }
    }

    private void reverse(char [] str, int left, int right){
        while(left < right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
}

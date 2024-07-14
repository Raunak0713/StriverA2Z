package String.Basic_and_Easy;

public class Largest_Odd_Number {
    public String largestOddNumber(String num) {
        int lastIndex = 0;
        String ans = "";
        for(int i=num.length()-1; i>=0; i--){
            char c = num.charAt(i);
            int a = c - '0';
            if(a%2 != 0){
                lastIndex = i;
                ans = num.substring(0,lastIndex+1);
                break;
            }
        }
        return ans;
    }
}

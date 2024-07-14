package String.Basic_and_Easy;

public class Remove_Outermost_Parenthesis {
    public String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                if(counter != 0){
                    sb.append(c);
                }
                counter++;
            }
            else{
                if(counter > 1){
                    sb.append(c);
                }
                counter--;
            }
        }
        return sb.toString();
    }
}

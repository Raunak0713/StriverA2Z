package String.Basic_and_Easy;

public class Reverse_The_Sentence {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        return String.join(" ", words);
    }
}

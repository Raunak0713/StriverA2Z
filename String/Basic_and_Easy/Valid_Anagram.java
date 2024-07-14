package String.Basic_and_Easy;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        int[] sa = new int[26];
        int[] ta = new int[26];
        
        for(char c : s.toCharArray()){
            sa[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            ta[c - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(sa[i] != ta[i]){
                return false;
            }
        }
        return true;
    }
}

package String.Basic_and_Easy;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        int[] sa = new int[256];
        int[] ta = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (sa[sc] != ta[tc]) {
                return false;
            }

            sa[sc] = i + 1;
            ta[tc] = i + 1;
        }

        return true;
    }
}

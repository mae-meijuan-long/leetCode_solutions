package string.solution_205;

import java.util.Arrays;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[256];
        Arrays.fill(mapS,-1);

        int[] mapT = new int[256];
        Arrays.fill(mapT,-1);

        if(s.length()!=t.length()) return false;

        for(int i= 0;i<s.length();i++){
            if(mapS[s.charAt(i)]==-1 && mapT[t.charAt(i)]==-1){
                mapS[s.charAt(i)] = t.charAt(i);
                mapT[t.charAt(i)] = s.charAt(i);
                continue;
            }
            if(mapS[s.charAt(i)] != t.charAt(i) ||  mapT[t.charAt(i)] != s.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean isomorphic = new Solution().isIsomorphic("egg", "add");

        System.out.println(isomorphic);
    }
}

package string.solution_205;

/**
 *用双指针做 392题
 */
public class isSubsequence {

    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;

        while(right<t.length()&&left<s.length()){
            if(s.charAt(left)==(t.charAt(right))){
                left ++;
            }
            right ++;

            System.out.println(left+"===="+right);
        }
        return   left==s.length();
    }

    public static void main(String[] args) {
        boolean subsequence = new isSubsequence().isSubsequence("abc", "aaabbcc");
        System.out.println(subsequence);
    }
}

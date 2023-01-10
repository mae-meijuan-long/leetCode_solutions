package string.solution_151;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reverseWords {

    public String reverseWords(String s) {
        String[] splited = s.split(" ");
        var b = Arrays.stream(splited).filter(x->x.startsWith(" "))
                .collect(Collectors.toList());
//        List<String> reserved = b;

        StringBuffer res = new StringBuffer();
        for(int i = 0;i<b.size();i++){
            res.append( b.get(b.size()-1-i)+" ");
        }

        return   res.toString().trim();
    }

    public static void main(String[] args) {
        String s = new reverseWords().reverseWords("a good   example");

        System.out.println(s);
    }
}

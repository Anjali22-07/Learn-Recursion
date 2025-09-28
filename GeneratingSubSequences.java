import java.util.ArrayList;
import java.util.List;

public class GeneratingSubSequences {

    public static void main(String[] args) {
        String s="abc";
        List<String> str= new ArrayList();   //because arrayList is passed by reference

        SubSequence("",s,0, str);
        System.out.print(str+ " ");

    }
     public static void SubSequence(String ans, String s, int idx, List<String> str){

         if(idx==s.length()) {
            str.add(ans);
            return;
        }
         char ch= s.charAt(idx);
        SubSequence(ans+ch, s, idx+1, str);    //pick
        SubSequence(ans, s, idx+1, str);    //skip
     }
    
}

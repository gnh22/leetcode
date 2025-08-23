package java_solutions;

public class is_subsequence {
    public static void main(String[] args){
        String s ="abc";
        String t ="axbxc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())
            return false;
        int s_pointer = 0;
        int t_pointer = 0;

        while(s_pointer<s.length()){
            if(t_pointer>=t.length())
                return false;
            if(s.charAt(s_pointer)==t.charAt(t_pointer)){
                s_pointer++;
                t_pointer++;
            }
            else{
                t_pointer++;
            }
        }

        return true;
    }
    
}

package java_solutions;

public class valid_palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        // make all lowercase
        s = s.toLowerCase();
        int front = 0;
        int end = s.length()-1;

        while(front < s.length())
        {
            if(Character.isLetterOrDigit(s.charAt(front)) && Character.isLetterOrDigit(s.charAt(end)))
            {
                 if(s.charAt(front) != s.charAt(end))
                    return false;
                front++;
                end--;
            }
            else if(!Character.isLetterOrDigit(s.charAt(front)))
                front++;
            else if(!Character.isLetterOrDigit(s.charAt(end)))
                end--;
        }

        return true;
        
    }
    
}

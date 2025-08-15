
import java.util.Scanner;
public class longest_common_prefix {
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        
        String commonPrefix="";
        // get first character
        for(int k=0; k<strs[0].length(); k++)
        { 
            // loop through array
            for(int i=1; i<strs.length; i++)
            {
                if(k>=strs[i].length())
                    return commonPrefix;
                if(strs[i].charAt(k)!=strs[0].charAt(k))
                    return commonPrefix;
            }

            // same character for all words
            commonPrefix += strs[0].charAt(k); 
        }
       
        return commonPrefix;
    }
    
}

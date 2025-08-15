/*
 * August 14th, 2025
 * Leetcode 14. Longest Common Prefix
 */

 import java.util.*;

public class longest_common_prefix {
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs)
    {
        StringBuilder commonPrefix=new StringBuilder();
        // get first character
        for(int k=0; k<strs[0].length(); k++)
        { 
            // loop through array
            for(int i=1; i<strs.length; i++)
            {
                if(k>=strs[i].length())
                    return commonPrefix.toString();
                if(strs[i].charAt(k)!=strs[0].charAt(k))
                    return commonPrefix.toString();
            }

            // same character for all words
            commonPrefix.append(strs[0].charAt(k)); 
        }
       
        return commonPrefix.toString();
    }
      /* 
     * I could not figure out how to get rid of the nested for-loop, but I saw an ingenious solution on leetcode:
     *  1. Sort the array 
     *  2. Just go through each letter for the first and last word to find the longest prefix!
     *  This gets rid of the nested-ness since you are only comparing letters for two words!
     * 
     * Although... I reran my original solution just with a StringBuilder instead of a String, and it has the same runtime, and memory is actually better!
     */
    // public static String longestCommonPrefix(String[] strs)
    // {
    //     // sort 
    //     Arrays.sort(strs);

    //     // NEED TO USE STRING BUILDER!!
    //     StringBuilder commonPrefix=new StringBuilder();
    //     String first = strs[0];
    //     String last = strs[strs.length-1];
    //     for(int i=0; i<Math.min(first.length(),last.length()); i++)
    //     {
    //         if(first.charAt(i) != last.charAt(i))
    //             return commonPrefix.toString();
    //         commonPrefix.append(first.charAt(i));
    //     }

    //     return commonPrefix.toString();
    // }
    /* 
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
    }*/  
}

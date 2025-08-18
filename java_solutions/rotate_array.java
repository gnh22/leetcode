package java_solutions;
import java.util.Arrays;
public class rotate_array {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

    }
    public static void rotate(int[] nums, int k) {

        //base case
        if(nums.length==1||nums.length==0)
            return;
        
        // if nums.length % k == 0, no shifting needs to happen
        if(k % nums.length == 0)
            return;

        int start;
        int i=0;
        int[] nums2 = new int[nums.length];

        // it's possible we will be shifting it greater than the length
        if(k>nums.length)
            start = nums.length - (k % nums.length);
        else
            start = nums.length - k;
        
        while(i<nums2.length){
            // reset to 0
            if(start==nums.length)
                start=0;
            nums2[i] = nums[start];
            i++;
            start++;
        }

       // copy into nums
        for(int j=0; j<nums.length; j++)
            nums[j] = nums2[j];
        
    }
    
}

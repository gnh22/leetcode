package java_solutions;
import java.util.Arrays;
public class merge_sorted_array{
    public static void main(String[] args){
        int[] nums1 = {0,0,3,0,0,0,0,0,0};
        int[] nums2 = {-1,1,1,1,2,3};
        merge(nums1,3, nums2 ,6);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // base case
        if(n==0)
            return;

        // initialize them both to point at the last index
        int nums1_ptr = m-1;
        int nums2_ptr = n-1;

        for(int i=nums1.length-1; i>=0; i--)
        {
            if(nums2_ptr < 0)
                break;
            if(nums1_ptr < 0)
            {
                nums1[i] = nums2[nums2_ptr];
                nums2_ptr--;
            }
            else if(nums1[nums1_ptr]>nums2[nums2_ptr])
            {
                nums1[i] = nums1[nums1_ptr];
                nums1_ptr--;
            }
            else
            {
                nums1[i] = nums2[nums2_ptr];
                nums2_ptr--;
            }
        }
    }
}

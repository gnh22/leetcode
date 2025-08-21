package java_solutions;

public class jump_game {
    public static void main(String[] args){
        int[] array = {2,3,1,1,4};
        System.out.println(canJump(array));
    }
    public static boolean canJump(int[] nums) {

        if(nums.length==1)
            return true;
        int i=0;
        while(i<nums.length-1)
        {
            //System.out.println(i);
            int jump = nums[i];
            if(jump==0 && i!=nums.length-1)
                return false;
            if(i+jump>=nums.length-1)
                return true;
            
            // System.out.println("amde it here");

            for(int j=nums[i]; j>0; j--)
            {
                // System.out.println(nums[i+j]);
                // System.out.println(nums[jump]);
                if(nums[i+j]>nums[jump+i])
                {
                    // System.out.println(j+i);
                    // System.out.println(nums[j+nums[jump+i]]);
                    if(j+nums[i+j]>=nums.length-1)
                        return true;
                    if(nums[j+nums[i+j]]==0 && nums[jump+nums[jump+i]]==0)
                        jump = j;
                    if(nums[j+nums[i+j]]!=0)
                        jump = j;
                    //System.out.println("here");
                    
                }
                   
            }

            if(i+jump>=nums.length-1)
                return true;
            i += jump;
            
        }

        return false;
       
    }
}
